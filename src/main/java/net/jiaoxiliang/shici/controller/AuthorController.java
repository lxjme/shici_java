package net.jiaoxiliang.shici.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.jiaoxiliang.shici.mapper.AuthorMapper;
import net.jiaoxiliang.shici.mapper.AuthorOtherMapper;
import net.jiaoxiliang.shici.pojo.Author;
import net.jiaoxiliang.shici.pojo.AuthorOther;
import net.jiaoxiliang.shici.util.PageUtil;

/**
 * 作者数据
 * AuthorController
 */
@RestController
public class AuthorController extends BaseController {

    @Autowired
    private AuthorMapper authorMapper;
    @Autowired
    private AuthorOtherMapper authorOtherMapper;

    @RequestMapping("/getAuthor")
    public ResponseEntity<Object> getAuthor( PageUtil pageUtil) {
        // 1.参数
        // System.out.println(pageUtil.getPage());
        // 2.数据
        int total_count = authorMapper.total();
        // 计算分页各个参数
        pageUtil.calcParam(total_count);
        List<Author> as = authorMapper.findAll(pageUtil);
        for (Author a : as) {
            if(StringUtils.isBlank(a.getImg_url())) {
                a.setImg_url("");
            }
        }
        Map<String, Object> result = new HashMap<>();
        result.put("list", as);
        result.put("total", total_count);
        // 3.返回数据
        return new ResponseEntity<Object>(success("获取成功", result), HttpStatus.OK);

    }

    /**
     * 通过ID获取作者信息
     * @param id
     * @return
     */
    @RequestMapping("/getAuthorById")
    public ResponseEntity<Object> getAuthorById(Integer id) {
        // 1.参数
        // 2.获取数据
        Map<String, Object> result = new HashMap<>();

        // (1) 作者简介
        // System.out.println(id);
        Author author = authorMapper.selectById(id);
        result.put("info", author);
        // (2) 作者生平

        Map<String, Object> params = new HashMap<>();
        params.put("author_id", id);
        List<AuthorOther> others = authorOtherMapper.getAuthorOther(params);

        int index = 0;
        for (AuthorOther ao : others) {
            ao.setAuthor_other_short(ao.getAuthor_other_short().replaceAll("onclick=\"toggle\\(this\\);\"", "data-index='"+index+"'").replaceAll("onclick=\"zhankai\\(this\\)\"", "data-index='"+index+"'"));
            ao.setAuthor_other(ao.getAuthor_other().replaceAll("onclick=\"toggle\\(this,2\\);\"", "data-index='"+index+"'"));
            index++;
        }
        result.put("list", others);

        // 3.返回数据
        return new ResponseEntity<Object>(success("获取成功", result), HttpStatus.OK);
    }

}
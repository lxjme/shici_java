package net.jiaoxiliang.shici.mapper;

import java.util.List;

import net.jiaoxiliang.shici.pojo.Category;
import net.jiaoxiliang.shici.util.PageUtil;

import org.apache.ibatis.annotations.Mapper;

/**
 * CategoryMapper
 */
@Mapper
public interface CategoryMapper {
    /**
     * 分类列表
     * @return
     */
    List<Category> findAll();
    List<Category> findAll(PageUtil pageUtil);

    Category getCategoryById(Category c);

    /**
     * 取得总数
     * @return
     */
    int total();

    // 添加
    int addCategory(Category c);
    // 删除
    void delCategory(Category c);
    // 更新
    int saveCategory(Category c);

}
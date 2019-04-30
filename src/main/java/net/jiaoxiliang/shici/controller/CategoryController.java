package net.jiaoxiliang.shici.controller;

import java.util.List;

import net.jiaoxiliang.shici.mapper.CategoryMapper;
import net.jiaoxiliang.shici.pojo.Category;
import net.jiaoxiliang.shici.util.PageUtil;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * CategoryController
 */
@Controller
public class CategoryController {
    @Autowired
    CategoryMapper categoryMapper;

    Logger logger  = LogManager.getLogger(CategoryController.class);

    @RequestMapping("listCategory")
    public String listCategory(Model m, PageUtil pageUtil) {

        // jpa 取数据
        // List<Category> cs = categoryDao.findAll();
        logger.info("=======================  logger strart =========================");
        logger.info("=======================  logger strart =========================");
        // System.out.println(page);
        logger.info(pageUtil.getPage());
        pageUtil.calcParam(categoryMapper.total());

        logger.info(pageUtil.getTotal());
        logger.info(pageUtil.getTotalPages());
        System.out.println(Math.ceil(154/10));



        /* mybits 数据 */
        List<Category> cs = categoryMapper.findAll(pageUtil);
        
        m.addAttribute("cs", cs);
        return "list_category";
    }


    @RequestMapping("addCategory")
    public String addCategory(Category c) {
        categoryMapper.addCategory(c);
        return "redirect:listCategory";
    }

    @RequestMapping("delCategory")
    public String delCategory(Category c) {
        categoryMapper.delCategory(c);
        return "redirect:listCategory";
    }

    @RequestMapping("editCategory")
    public String editCategory(Model m, Category c) {
        Category c2 = categoryMapper.getCategoryById(c);
        m.addAttribute("category", c2);
        return "edit_category";
    }

    @RequestMapping("updateCategory")
    public String updateCategory(Category c) {
        int res = categoryMapper.saveCategory(c);
        return "redirect:listCategory";
    }


    
}
package net.jiaoxiliang.shici.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import net.jiaoxiliang.shici.pojo.Author;
import net.jiaoxiliang.shici.util.PageUtil;

/**
 * AuthorMapper
 */
@Mapper
public interface AuthorMapper {

    List<Author> findAll();
    List<Author> findAll(PageUtil pageUtil);
    Author selectById(int id);
    int total();
}
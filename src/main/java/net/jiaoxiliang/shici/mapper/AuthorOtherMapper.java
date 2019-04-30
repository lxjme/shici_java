package net.jiaoxiliang.shici.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import net.jiaoxiliang.shici.pojo.AuthorOther;

/**
 * AuthorOtherMapper
 */
@Mapper
public interface AuthorOtherMapper {
    List<AuthorOther> getAuthorOther(Map<String, Object> params);
}
package com.worker.dao;

import com.worker.bean.Author;
import com.worker.bean.Entry;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AuthorMapper {
    //获取所有作者
    List<Author> getAll();
    //获取相似的作者
    List<Author> getLikelyAuthors(@Param("name") String name);
    //获取作者信息通过名字
    Author getAuthorByName(@Param("name") String name);

    List<String> getLikelyAuthorOnlyName(@Param("name")String name);

    //查询entry
    Entry getEntryByName(@Param("name") String name);

}

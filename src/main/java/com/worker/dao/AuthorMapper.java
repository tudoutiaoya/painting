package com.worker.dao;

import com.worker.bean.Author;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AuthorMapper {

    List<Author> getAll();

    List<Author> getLikelyAuthors(@Param("name") String name);

    Author getAuthorByName(@Param("name") String name);

    List<String> getLikelyAuthorOnlyName(@Param("name")String name);
}

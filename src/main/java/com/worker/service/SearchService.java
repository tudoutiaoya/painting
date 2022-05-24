package com.worker.service;

import com.worker.bean.Author;
import com.worker.dao.AuthorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname SearchService
 * @Version 1.0.0
 * @Description TODO
 */
@Service
public class SearchService {

    @Autowired
    AuthorMapper authorMapper;

    public List<Author> searchAuthor(String name) {
        List<Author> likelyAuthors = authorMapper.getLikelyAuthors(name);
        return likelyAuthors;
    }
}

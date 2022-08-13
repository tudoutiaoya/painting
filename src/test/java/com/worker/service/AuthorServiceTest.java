package com.worker.service;

import com.worker.TestParent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AuthorServiceTest  extends TestParent {

    @Autowired
    private AuthorService authorService;

    @Test
    void searRelatedAuthorAndPainting() {
        Map<String, Object> map = authorService.searchAuthorRelative("张大千");
        System.out.println(map);
    }
}
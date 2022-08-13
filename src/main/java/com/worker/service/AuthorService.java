package com.worker.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface AuthorService {

    public Map<String, Object> searchAuthorRelative(String authorName);

    public Map<String, Object> searchAuthorDetails(String authorName);

}

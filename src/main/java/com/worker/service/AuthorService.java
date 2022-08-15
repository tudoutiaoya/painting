package com.worker.service;

import com.worker.model.domain.Author;
import com.worker.model.vo.AuthorVo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface AuthorService {

    public Map<String, Object> searchAuthorRelative(String authorName);

    public Map<String, Object> searchAuthorDetails(String authorName);

    public List<Author> getAllAuthor();

    public AuthorVo getAuthorVo(String authorName);

    /**
     * 模糊查询作者
     * @return
     */
    public List<Author> getLikelyAuthor(String authorName);

}

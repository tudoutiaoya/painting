package com.worker.service.impl;

import com.worker.dao.AuthorMapper;
import com.worker.model.domain.Author;
import com.worker.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AuthorMapper authorMapper;

    @Override
    public Map<String, Object> searchAreaRelative(String id) {
        HashMap<String, Object> map = new HashMap<>();

        // 获取作者
        List<Author> authors = authorMapper.getAuthorsByAreaId(id);
        map.put("authors", authors);

        return map;
    }
}

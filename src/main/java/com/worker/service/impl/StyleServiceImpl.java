package com.worker.service.impl;

import com.worker.dao.AuthorMapper;
import com.worker.dao.PaintingMapper;
import com.worker.model.domain.Author;
import com.worker.model.domain.Painting;
import com.worker.service.StyleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StyleServiceImpl implements StyleService {

    @Autowired
    private AuthorMapper authorMapper;

    @Autowired
    private PaintingMapper paintingMapper;


    @Override
    public Map<String, Object> searchStyleRelative(String id) {
        Map<String, Object> map = new HashMap<>();
        //  作者
        List<Author> authors = authorMapper.getAuthorsByStyleId(id);
        // 画作
        List<Painting> paintings = paintingMapper.getPaintingByStyleId(id);

        map.put("authors", authors);
        map.put("paintings", paintings);

        return map;
    }
}

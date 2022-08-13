package com.worker.service.impl;

import com.worker.dao.AuthorMapper;
import com.worker.dao.PaintingMapper;
import com.worker.model.domain.Author;
import com.worker.model.domain.Painting;
import com.worker.service.PoemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PoemServiceImpl implements PoemService {

    @Autowired
    private AuthorMapper authorMapper;

    @Autowired
    private PaintingMapper paintingMapper;

    @Override
    public Map<String, Object> searchPoemRelative(String id) {
        Map<String, Object> map = new HashMap<>();
        //  作者
        //Author author = authorMapper.getAuthorsByPoemId(id);
        Author author = null;
        // 画作
        List<Painting> paintings = paintingMapper.getPaintingByPoemId(id);

        map.put("author", author);
        map.put("paintings", paintings);

        return map;
    }
}

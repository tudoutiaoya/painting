package com.worker.service.impl;

import com.worker.dao.AuthorMapper;
import com.worker.dao.PaintingMapper;
import com.worker.model.domain.*;
import com.worker.service.PaintingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class PaintingServiceImpl implements PaintingService {

    @Autowired
    private PaintingMapper paintingMapper;

    @Autowired
    private AuthorMapper authorMapper;

    @Override
    public Map<String, Object> searchPaintingRelative(String paintingName) {
        Map<String,Object> map = new HashMap<>();
        // 查询相关画作
        // 同风格
        List<Painting> sameStylePaintings = paintingMapper.getPaintingSameStyle(paintingName);
        // 同类型
        List<Painting> sameTypePaintings = paintingMapper.getPaintingSameType(paintingName);
        // 画作作者 可能多个作者
        List<Author> authors = authorMapper.getAuthorByPaintingName(paintingName);
        // 印章相关先不加
        // 去重
        List<Painting> paintings = Stream.of(sameStylePaintings, sameTypePaintings).flatMap(Collection::stream).collect(Collectors.toList());
        map.put("paintings", paintings);
        map.put("authors", authors);
        return map;
    }


    @Override
    public Map<String, Object> searPaintingDetails(String paintingName) {
        Map<String, Object> map = new HashMap<>();
        Painting painting = paintingMapper.getPaintingByPaintingName(paintingName);
        if(painting == null) {
            return map;
        }
        // 画作作者
        List<Author> authors = authorMapper.getAuthorByPaintingName(paintingName);
        // 风格
        PaintingStyle paintingStyle = paintingMapper.getStyleByPaintingId(painting.getId());
        // 题诗
        List<Poem> poems = paintingMapper.getPaintingPoems(paintingName);
        // 铃印
        List<Seal> seals = paintingMapper.getSealByPaintingId(painting.getId());
        map.put("authors", authors);
        map.put("style", paintingStyle);
        map.put("poems", poems);
        map.put("seals", seals);

        return map;
    }

    @Override
    public List<Painting> getPaintingWithTypeLimit(String type, int limit) {
        return paintingMapper.getTenPaintingWithType(type, limit);
    }

    @Override
    public List<Painting> getLikelyPaintings(String paintingName) {
        return paintingMapper.getLikelyPaintings(paintingName);
    }


}

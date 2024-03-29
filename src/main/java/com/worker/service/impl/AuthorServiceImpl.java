package com.worker.service.impl;

import com.worker.dao.AuthorMapper;
import com.worker.dao.PaintingMapper;
import com.worker.dao.SealMapper;
import com.worker.dao.StyleMapper;
import com.worker.model.domain.*;
import com.worker.model.vo.AuthorVo;
import com.worker.model.vo.PaintingVo;
import com.worker.service.AuthorService;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorMapper authorMapper;

    @Autowired
    private PaintingMapper paintingMapper;

    @Autowired
    private SealMapper sealMapper;

    @Autowired
    private StyleMapper styleMapper;

    public Map<String, Object> searchAuthorRelative(String authorName) {
        Map<String,Object> map = new HashMap<>();
        // 查询画作
        List<Painting> paintings = paintingMapper.getPaintingByAuthorName(authorName);
        // 相关作者 同籍贯 风格 朋友
        List<Author> authorFriends = authorMapper.getAuthorFriends(authorName);
        List<Author> sameAreaAuthors = authorMapper.getSameAreaAuthor(authorName);
        List<Author> sameStyleAuthors = authorMapper.getSameStyleAuthor(authorName);


        List<Author> authors = Stream.of(authorFriends, sameAreaAuthors, sameStyleAuthors)
                .flatMap(Collection::stream).collect(Collectors.toList());

        map.put("authors", authors);
        map.put("paintings", paintings);

        return map;
    }

    @Override
    public Map<String, Object> searchAuthorDetails(String authorName) {
        Map<String,Object> map = new HashMap<>();
        // 籍贯
        Area area = authorMapper.getAreaByAuthorName(authorName);
        // 朋友
        List<Author> authorFriends = authorMapper.getAuthorFriends(authorName);
        // 铃印
        List<Seal> seals = authorMapper.getSealsByAuthorName(authorName);
        // 作者画作
        List<PaintingVo> paintings = getPaintingVo(authorName);
        // 风格
        List<PaintingStyle> sytles = authorMapper.getAuthorGoodAtStyles(authorName);
        map.put("area", area);
        map.put("friends", authorFriends);
        map.put("seals", seals);
        map.put("paintings", paintings);
        map.put("styles", sytles);
        return map;
    }

    @Override
    public List<Author> getAllAuthor() {
        return authorMapper.getAllAuthor();
    }

    @Override
    public AuthorVo getAuthorVo(String authorName) {
        AuthorVo authorVo = new AuthorVo();
        // 作者 籍贯 作者画作 作者诗 作者铃印 作者擅长风格
        Author author = authorMapper.getAuthorByName(authorName);
        Area area = authorMapper.getAreaByAuthorName(authorName);
        List<Painting> paintings = paintingMapper.getPaintingByAuthorName(authorName);
        // 获取 作者所有诗 没有数据库关系
        List<Poem> poems = null;
        List<Seal> seals = sealMapper.getSealsByAuthorName(authorName);
        List<PaintingStyle> goodAtStyles = styleMapper.getGoodAtStylesByAuthorName(authorName);
        BeanUtils.copyProperties(author, authorVo);
        authorVo.setPaintings(paintings);
        authorVo.setPoems(poems);
        authorVo.setSeals(seals);
        authorVo.setGoodAtStyles(goodAtStyles);
        return authorVo;
    }

    @Override
    public List<Author> getLikelyAuthor(String authorName) {
        return authorMapper.getLikelyAuhtors(authorName);
    }

    private List<PaintingVo> getPaintingVo(String authorName) {
        List<PaintingVo> paintingVos = new LinkedList<>();
        // 获取画
        List<Painting> paintings = paintingMapper.getPaintingByAuthorName(authorName);

        // 获取peoms
        for (Painting painting : paintings) {
            PaintingVo paintingVo = new PaintingVo();
            BeanUtils.copyProperties(painting, paintingVo);
            // 获取题诗
            List<Poem> poems = paintingMapper.getPaintingPoems(painting.getPaintingName());
            // 获取铃印
            List<Seal> seals = paintingMapper.getSealByPaintingId(painting.getId());
            // 获取画作类型
            PaintingType paintingType = paintingMapper.getTypeByPaintingId(painting.getId());
            // 获取画作风格
            PaintingStyle paintingStyle = paintingMapper.getStyleByPaintingId(painting.getId());

            paintingVo.setPeoms(poems);
            paintingVo.setSeals(seals);
            if(paintingType != null) {
                paintingVo.setType(paintingType.getType());
            }
            if(paintingStyle != null) {
                paintingVo.setStyle(paintingStyle.getStyle());
            }

            paintingVos.add(paintingVo);
        }

        return paintingVos;
    }


}

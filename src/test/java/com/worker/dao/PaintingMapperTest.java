package com.worker.dao;

import com.worker.TestParent;
import com.worker.model.domain.Painting;
import com.worker.model.domain.PaintingStyle;
import com.worker.model.domain.PaintingType;
import com.worker.model.domain.Poem;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

class PaintingMapperTest extends TestParent {

    @Autowired
    private PaintingMapper paintingMapper;

    @Test
    void getPaintingByAuthorName() {
        List<Painting> paintingList = paintingMapper.getPaintingByAuthorName("张大千");
        System.out.println(paintingList);
    }

    @Test
    void getPaintingPoems() {
        List<Poem> poems = paintingMapper.getPaintingPoems("仿沈周山水");
        System.out.println(poems);
    }

    @Test
    void getTypeByPaintingId() {
        PaintingType type = paintingMapper.getTypeByPaintingId("7013");
        System.out.println(type);
    }

    @Test
    void getStyleByPaintingId() {
        PaintingStyle sytle = paintingMapper.getStyleByPaintingId("7013");
        System.out.println(sytle);
    }

    @Test
    void getTenPaintingWithType() {
        List<Painting> list = paintingMapper.getTenPaintingWithType("轴", 10);
        System.out.println(list);
    }
}
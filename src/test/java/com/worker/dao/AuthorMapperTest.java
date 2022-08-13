package com.worker.dao;

import com.worker.TestParent;
import com.worker.model.domain.Area;
import com.worker.model.domain.Author;
import com.worker.model.domain.Seal;
import com.worker.model.domain.PaintingStyle;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

class AuthorMapperTest extends TestParent {

    @Autowired
    private AuthorMapper authorMapper;

    @Test
    void getSameAreaAuthor() {
        List<Author> authorList = authorMapper.getSameAreaAuthor("张大千");
        System.out.println(authorList);
    }


    @Test
    void getSameStyleAuthor() {
        List<Author> list = authorMapper.getSameStyleAuthor("张大千");
        System.out.println(list);
        System.out.println("长度为： " + list.size());
    }

    @Test
    void getAuthorFriends() {
        List<Author> list = authorMapper.getAuthorFriends("张大千");
        System.out.println(list);
        System.out.println("长度为： " + list.size());
    }

    @Test
    void getAuthorByPaintingName() {
        List<Author> author = authorMapper.getAuthorByPaintingName("秋山在望");
        System.out.println(author);
    }

    @Test
    void testGetAuthorByPaintingName() {
        List<Author> a = authorMapper.getAuthorByPaintingName("秋山在望");
        System.out.println(a);
        System.out.println("数量" + a.size());
    }

    @Test
    void getAreaByAuthorName() {
        Area area = authorMapper.getAreaByAuthorName("张大千");
        System.out.println(area);
    }

    @Test
    void getSealsByAuthorName() {
        List<Seal> seals = authorMapper.getSealsByAuthorName("张大千");
        System.out.println(seals);
    }

    @Test
    void getAuthorGoodAtStyles() {
        List<PaintingStyle> li = authorMapper.getAuthorGoodAtStyles("张大千");
        System.out.println(li);
    }
}
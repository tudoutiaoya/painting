package com.worker.dao;

import com.worker.model.domain.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AuthorMapper {

    /**
     * 获取同籍贯作者
     * @return
     */
    public List<Author> getSameAreaAuthor(String authorName);

    /**
     * 获取同风格作者
     * @return
     */
    public List<Author> getSameStyleAuthor(String authorName);

    /**
     * 获取作者的朋友
     * @return
     */
    public List<Author> getAuthorFriends(String authorName);

    /**
     * 画作名称查询作者
     * @return
     */
    public List<Author> getAuthorByPaintingName(String paintingName);

    /**
     * 根据画查 印章相关联的作者 (可能会删除, 先不加)
     * @return
     */
    public List<Author> getAuthorBySeal(String paintingName);

    /**
     * 查询作者籍贯
     * @return
     */
    public Area getAreaByAuthorName(String authorName);

    /**
     * 查询作者的印章
     * @return
     */
    public List<Seal> getSealsByAuthorName(String authorName);

    /**
     * 查询作者擅长的风格
     * @return
     */
    public List<PaintingStyle> getAuthorGoodAtStyles(String authorName);

    /**
     * 风格 获取作者
     * @return
     */
    public List<Author> getAuthorsByStyleId(String id);

    /**
     * 风格 获取作者  待开发
     * @return
     */
    Author getAuthorsByPoemId(String id);

    /**
     * 籍贯 获取作者
     * @return
     */
    List<Author> getAuthorsByAreaId(String id);

    /**
     * 获取作者铃印 by id
     * @return
     */
    List<Author> getAuthorsBySealId(String id);

    /**
     * 获取所有作者
     * @return
     */
    List<Author> getAllAuthor();

    /**
     * 作者姓名获取作者信息
     * @return
     */
    Author getAuthorByName(String authorName);

    /**
     * 获取作者 模糊查询
     * @return
     */
    List<Author> getLikelyAuhtors(String authorName);

}

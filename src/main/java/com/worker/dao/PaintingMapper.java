package com.worker.dao;

import com.worker.model.domain.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.awt.*;
import java.util.List;

@Mapper
public interface PaintingMapper {

    /**
     * 获取作者画作
     * @return
     */
    public List<Painting> getPaintingByAuthorName(String authorName);

    /**
     * 查询 同风格作品
     * @return
     */
    public List<Painting> getPaintingSameStyle(String paintingName);

    /**
     *  查询同类型作品
     * @return
     */
    public List<Painting> getPaintingSameType(String paintingName);

    /**
     * 获取画作的题诗
     * @return
     */
    public List<Poem> getPaintingPoems(String paintingName);

    /**
     * 获取画的 铃印
     * @return
     */
    public List<Seal> getSealByPaintingId(String id);

    /**
     * 获取画作类型
     * @return
     */
    public PaintingType getTypeByPaintingId(String id);

    /**
     * 获取画作风格
     * @return
     */
    public PaintingStyle getStyleByPaintingId(String id);

    /**
     * 查询画作根据画作名称
     * @return
     */
    public Painting getPaintingByPaintingName(String paintingName);

    /**
     * 风格获取画作
     * @return
     */
    public List<Painting> getPaintingByStyleId(String id);

    /**
     * 题诗获取 作品
     * @return
     */
    List<Painting> getPaintingByPoemId(String id);

    /**
     * id获取画作
     * @return
     */
    List<Painting> getPaintingBySealId(String id);

    /**
     * 查询轴的10条画作
     * @return
     */
    List<Painting> getTenPaintingWithType(@Param("type") String type,@Param("limit") int limit);

    /**
     * 获取画作 模糊查询
     * @return
     */
    List<Painting> getLikelyPaintings(String paintingName);
}

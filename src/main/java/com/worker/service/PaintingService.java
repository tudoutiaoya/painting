package com.worker.service;

import com.worker.model.domain.Painting;

import java.awt.*;
import java.util.List;
import java.util.Map;

public interface PaintingService {

    public Map<String, Object> searchPaintingRelative(String paintingName);

    public Map<String, Object> searPaintingDetails(String paintingName);

    /**
     * 获取特定类型的画 限制多少条
     * @return
     */
    public List<Painting> getPaintingWithTypeLimit(String type, int limit);

    /**
     *  模糊查询画作
     * @return
     */
    public List<Painting> getLikelyPaintings(String paintingName);


}

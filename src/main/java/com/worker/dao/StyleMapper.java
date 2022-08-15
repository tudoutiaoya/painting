package com.worker.dao;

import com.worker.model.domain.PaintingStyle;

import javax.ws.rs.core.Link;
import java.util.List;

public interface StyleMapper {

    public List<PaintingStyle> getGoodAtStylesByAuthorName(String authorName);

}

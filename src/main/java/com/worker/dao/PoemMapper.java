package com.worker.dao;

import com.worker.model.domain.Poem;

import javax.ws.rs.core.Link;
import java.util.List;

public interface PoemMapper {

    public List<Poem> getPoemsByAuthorName(String authorName);

}

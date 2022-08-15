package com.worker.dao;

import com.worker.model.domain.Seal;

import java.util.List;

public interface SealMapper {

    public List<Seal> getSealsByAuthorName(String authorName);

}

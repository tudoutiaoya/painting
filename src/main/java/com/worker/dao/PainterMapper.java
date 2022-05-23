package com.worker.dao;

import com.worker.bean.Painter;

import java.util.List;

public interface PainterMapper {

    List<Painter> getAll();

    Painter getPainterByName();
}

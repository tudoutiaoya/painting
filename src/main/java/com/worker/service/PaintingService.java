package com.worker.service;

import java.util.Map;

public interface PaintingService {

    public Map<String, Object> searchPaintingRelative(String paintingName);

    public Map<String, Object> searPaintingDetails(String paintingName);
}

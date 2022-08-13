package com.worker.controller;

import com.worker.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@ResponseBody
@RequestMapping("/search")
public class SearchController {

    @Autowired
    private AuthorService authorService;

    @Autowired
    private PaintingService paintingService;

    @Autowired
    private StyleService styleService;

    @Autowired
    private PoemService poemService;

    @Autowired
    private AreaService areaService;

    @Autowired
    private SealService sealService;

    /**
     *  查询相关作者 作何画作
     * @return
     */
    @GetMapping("/relativeAuthor")
    public Map<String, Object> getAuthorRelative(String authorName) {
        authorName = authorName.trim();
        return authorService.searchAuthorRelative(authorName);
    }

    /**
     * 查询相关 画作
     * @return
     */
    @GetMapping("/relativePainting")
    public Map<String, Object> getPaintingRelative(String paintingName) {
        paintingName = paintingName.trim();
        return paintingService.searchPaintingRelative(paintingName);
    }

    /**
     * 查询 作者大部分数据
     * @return
     */
    @GetMapping("/authorDetails")
    public Map<String,Object> getAuthorDetails(String authorName) {
        authorName = authorName.trim();
        return authorService.searchAuthorDetails(authorName);
    }

    /**
     * 查询画作 大部分数据
     * @return
     */
    @GetMapping("/paintingDetails")
    public Map<String,Object> getPaintingDetails(String paintingName) {
        paintingName = paintingName.trim();
        return paintingService.searPaintingDetails(paintingName);
    }

    /**
     *  查询风格 相关画作以及作者
     * @return
     */
    @GetMapping("/styleRelative")
    public Map<String, Object> getStyleRelative(String id) {
        id = id.trim();
        return styleService.searchStyleRelative(id);
    }

    /**
     * 诗题 查询 作者 画作  待开发完整
     * @return
     */
    @GetMapping("/poemRelative")
    public Map<String, Object> getPoemRelative(String id) {
        id = id.trim();
        return poemService.searchPoemRelative(id);
    }

    /**
     *  籍贯 查询作者
     * @return
     */
    @GetMapping("/areaRelative")
    public Map<String, Object> getAreaRelative(String id) {
        id = id.trim();
        return areaService.searchAreaRelative(id);
    }

    /**
     *  铃印 查询画作  作者
     * @return
     */
    @GetMapping("/sealRelative")
    public Map<String, Object> getSealRelative(String id) {
        id = id.trim();
        return sealService.searchStyleRelative(id);
    }

    
}

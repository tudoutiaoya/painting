package com.worker.controller;

import com.worker.bean.Author;
import com.worker.bean.Painting;
import com.worker.service.SearchService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname SearchController
 * @Version 1.0.0
 * @Description TODO
 */
@Controller
public class SearchController {

    @Autowired
    private SearchService searchService;

    @RequestMapping("/search")
    @ResponseBody
    public Map<String,Object> Search(@Param("name") String name) {

        Map<String,Object> map = new HashMap<>();

        List<Author> authors = searchService.searchAuthor(name);

        if (authors.size() > 0) {
            map.put("authors", authors);
            return map;
        }
        //之后添加判断图画的逻辑
        List<Painting> paintings = new ArrayList<>();
        map.put("paintings", paintings);

        return map;
    }

}

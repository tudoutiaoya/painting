package com.worker.controller;

import com.worker.bean.Author;
import com.worker.bean.NoFind;
import com.worker.bean.Painting;
import com.worker.service.SearchService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


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
    public Object Search(@Param("name") String name) {
        List<Author> authors = searchService.searchAuthor(name);

        if (authors.size() > 0) {
            return authors;
        }
        //之后添加判断图画的逻辑
        List<Painting> paintings = new ArrayList<>();


        if (paintings.size() > 0) {
            return paintings;
        }

        return  new NoFind();
    }

    // 获取所有作者信息
    @RequestMapping("/getAllAuthor")
    @ResponseBody
    public Object SetAllAuthor() {
        List<Author> allAuthor = searchService.getAllAuthor();
        System.out.println(allAuthor.size());
        return allAuthor;
    }

    //根据name 参数只返回某个/某些作者名字
    @RequestMapping("/searchOnlyName")
    @ResponseBody
    public Object SearchOnlyName(@Param("name") String name) {
        return searchService.getLikelyAuthorOnlyName(name);
    }

}

package com.gong.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.gong.pojo.Sport;
import com.gong.service.SportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CodeSniper
 * @since 2021-07-06
 */

@RestController
public class SportController {
    @Autowired
    private SportService sportService;

    @RequestMapping("/sport")
    public String getTypeList(@RequestParam("type") String type, @RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize) {
        PageInfo<Sport> sportList = sportService.getSportList(type, pageNum, pageSize);
        return JSON.toJSONString(sportList);
    }

    @RequestMapping("/delete")
    public String deleteTypeById(@RequestParam Integer id) {
        int i = sportService.deleteSportById(id);
        return i > 0 ? "success" : "error";
    }
}

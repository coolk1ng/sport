package com.gong.controller;

import com.alibaba.fastjson.JSON;
import com.gong.pojo.MainMenu;
import com.gong.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * @author CodeSniper
 * @since 2021-06-28
 */

@RestController
public class MenuController {
    @Autowired
    private MenuService menuService;

    @RequestMapping("/menus")
    public String getMenus() {
        HashMap<String, Object> map = new HashMap<>();
        List<MainMenu> menus = menuService.getMenus();
        if (menus != null) {
            map.put("menus", menus);
            map.put("flag", 200);
        } else {
            map.put("flag", 404);
        }
        return JSON.toJSONString(map);
    }
}

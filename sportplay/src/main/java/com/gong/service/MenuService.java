package com.gong.service;

import com.gong.pojo.MainMenu;

import java.util.List;

/**
 * @author CodeSniper
 * @since 2021-06-28
 */

public interface MenuService {
    //菜单列表
    List<MainMenu> getMenus();
}

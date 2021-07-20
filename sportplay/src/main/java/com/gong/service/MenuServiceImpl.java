package com.gong.service;

import com.gong.mapper.MenuMapper;
import com.gong.pojo.MainMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CodeSniper
 * @since 2021-06-28
 */
@Service("MenuService")
public class MenuServiceImpl implements MenuService{
    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<MainMenu> getMenus() {
        return menuMapper.getMenus();
    }
}

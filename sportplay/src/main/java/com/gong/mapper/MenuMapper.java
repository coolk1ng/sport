package com.gong.mapper;

import com.gong.pojo.MainMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author CodeSniper
 * @since 2021-06-28
 */

@Mapper
public interface MenuMapper {
    //菜单列表
    List<MainMenu> getMenus();
}

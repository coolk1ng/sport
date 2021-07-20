package com.gong.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author CodeSniper
 * @since 2021-06-28
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MainMenu {

    private int id;
    private String title;
    private String path;
    private List<SubMenu> subMenus;
}

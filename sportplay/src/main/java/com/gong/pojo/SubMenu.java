package com.gong.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author CodeSniper
 * @since 2021-06-28
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubMenu {

    private int id;

    private String title;

    private String path;

}

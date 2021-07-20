package com.gong.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author CodeSniper
 * @since 2021-07-06
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sport {
    private Integer id;
    private String type;
    private String effect;
    private Date time;
}

package com.gong.queryInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author CodeSniper
 * @since 2021-06-29
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryUser {
    private String username;
    private int pageNum;
    private int pageSize;
}

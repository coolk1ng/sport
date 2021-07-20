package com.gong.mapper;

import com.github.pagehelper.PageInfo;
import com.gong.pojo.Sport;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author CodeSniper
 * @since 2021-07-06
 */

@Mapper
public interface SportMapper {
    //分页查询
    PageInfo<Sport> getSportList(String type,int pageNum,int pageSize);

    //根据type查询
    List<Sport> getSportByType(String type);

    //删除
    int deleteSportById(Integer id);
}

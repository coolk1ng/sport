package com.gong.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gong.mapper.SportMapper;
import com.gong.mapper.UserMapper;
import com.gong.pojo.Sport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CodeSniper
 * @since 2021-07-06
 */

@Service("SportService")
public class SportServiceImpl implements SportService{
    @Autowired
    private SportMapper sportMapper;

    @Override
    public PageInfo<Sport> getSportList(String type, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return new PageInfo<>(sportMapper.getSportByType(type));
    }

    @Override
    public List<Sport> getSportByType(String type) {
        return sportMapper.getSportByType(type);
    }

    @Override
    public int deleteSportById(Integer id) {
        return sportMapper.deleteSportById(id);
    }
}

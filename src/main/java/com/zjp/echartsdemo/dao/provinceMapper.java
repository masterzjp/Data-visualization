package com.zjp.echartsdemo.dao;

import com.zjp.echartsdemo.entity.Province;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface provinceMapper {
    public List<Province> selectAll();
}

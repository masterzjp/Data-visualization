package com.zjp.echartsdemo.service.impl;

import com.zjp.echartsdemo.dao.provinceMapper;
import com.zjp.echartsdemo.entity.Province;
import com.zjp.echartsdemo.service.IprovinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IprovinceImpl implements IprovinceService {
    @Autowired
    provinceMapper pMapper;
    @Override
    public List<Province> selectAll(){
        return this.pMapper.selectAll();
    }
}

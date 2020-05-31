package com.zjp.echartsdemo.service;

import com.zjp.echartsdemo.entity.Province;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IprovinceService {
    public List<Province> selectAll();
}

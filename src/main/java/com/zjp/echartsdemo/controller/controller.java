package com.zjp.echartsdemo.controller;

import com.zjp.echartsdemo.dao.provinceMapper;
import com.zjp.echartsdemo.entity.Province;
import com.zjp.echartsdemo.service.IprovinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class controller {
    @Autowired
    IprovinceService pService;
    @RequestMapping("/getdata")
    @ResponseBody
    public List<Province> showData(){
        List<Province> provinceArrayList = new ArrayList<>();
        provinceArrayList = pService.selectAll();
        return provinceArrayList;
    }
    @RequestMapping("/")
    public String index(){
        return "index";
    }

}

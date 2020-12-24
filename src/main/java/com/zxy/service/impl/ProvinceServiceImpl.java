package com.zxy.service.impl;

import com.zxy.dao.ProvinceDao;
import com.zxy.entity.Province;
import com.zxy.service.ProvinceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Resource
    private  ProvinceDao provinceDao;

    @Override
    public List<Province> findAllProvince() {
        List<Province> provinces=provinceDao.selectAllProvince1();
        return provinces;
    }
    @Override
    public List<Province> findAllProvince1() {
        return provinceDao.selectAllProvince1();
    }
}

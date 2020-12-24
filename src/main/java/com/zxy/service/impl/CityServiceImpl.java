package com.zxy.service.impl;

import com.zxy.dao.CityDao;
import com.zxy.entity.City;
import com.zxy.service.CityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Resource
    private CityDao cityDao;

    @Override
    public List<City> selectAllCity(int province_id) {
        List<City> cities=cityDao.selectAllCity(province_id);
        return cities;
    }
    @Override
    public List<City> selectAllCity1(int provinceid) {
        return cityDao.selectAllCity1(provinceid);
    }
}

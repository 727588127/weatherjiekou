package com.zxy.service;

import com.zxy.entity.City;

import java.util.List;

public interface CityService {
    List<City> selectAllCity(int province_id);
    List<City> selectAllCity1(int provinceid);
}

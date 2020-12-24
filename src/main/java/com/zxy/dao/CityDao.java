package com.zxy.dao;

import com.zxy.entity.City;

import java.util.List;

public interface CityDao {
    List<City> selectAllCity(int province_id);
    List<City> selectAllCity1(int provinceid);
}

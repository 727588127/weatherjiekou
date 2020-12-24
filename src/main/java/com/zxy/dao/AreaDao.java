package com.zxy.dao;

import com.zxy.entity.Area;

import java.util.List;

public interface AreaDao {
    List<Area> selectAllArea(int province_id,int city_id);
    List<Area> selectAllArea1(int provinceid,int cityid);
}

package com.zxy.service;

import com.zxy.entity.Area;

import java.util.List;

public interface AreaService {
    List<Area> selectAllArea(int province_id,int city_id);
    List<Area> selectAllArea1(int provinceid,int cityid);
}

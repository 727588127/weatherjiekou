package com.zxy.service.impl;

import com.zxy.dao.AreaDao;
import com.zxy.entity.Area;
import com.zxy.service.AreaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AreaServiceImpl implements AreaService {

    @Resource
    private AreaDao areaDao;

    @Override
    public List<Area> selectAllArea(int province_id, int city_id) {
        List<Area> areas=areaDao.selectAllArea(province_id, city_id);
        return areas;
    }
    @Override
    public List<Area> selectAllArea1(int provinceid, int cityid) {
        return areaDao.selectAllArea1(provinceid, cityid);
    }
}

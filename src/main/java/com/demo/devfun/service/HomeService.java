package com.demo.devfun.service;

import com.demo.devfun.dao.HomeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

@Service
public class HomeService {
    @Autowired
    HomeDao homeDao;

    public Map<String, Object> getRequestInfo() {
        Map<String, Object> map = new HashMap<>();
        map.put("count", homeDao.getTestCount());
        map.put("sample", homeDao.getRequest());
        return map;
    }
}

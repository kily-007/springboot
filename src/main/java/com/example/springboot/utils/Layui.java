package com.example.springboot.utils;

import java.util.HashMap;
import java.util.List;

public class Layui extends HashMap<String, Object> {
    public static Layui data(long total, List<?> data) {
        Layui r = new Layui();
        r.put("code", 0);
        r.put("message", "查询成功");
        r.put("total", total);
        r.put("data", data);
        return r;
    }
}
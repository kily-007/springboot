package com.example.springboot.utils;

import java.util.HashMap;
import java.util.List;

public class Layui extends HashMap<String, Object> {
    public static Layui data(long count, List<?> data) {
        Layui r = new Layui();
        r.put("data", data);
        r.put("code", 0);
        r.put("msg", "");
        r.put("count", count);
        return r;
    }
}
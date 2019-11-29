package com.example.springboot.utils;

import lombok.Data;


/**
 * "status": 0,
 * "message": "",
 * "total": 180,
 * "data": {
 * "item": [{}, {}]
 * }
 */
@Data
public class LayuiTableResult {

    //0-成功 其它-失败
    private int code;

    //消息
    private String msg;

    //总共
    private int count;

    //返回的数据格式
    private Object data;

    public LayuiTableResult() {

    }

    public LayuiTableResult(int code, String msg, int count, Object data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }
}

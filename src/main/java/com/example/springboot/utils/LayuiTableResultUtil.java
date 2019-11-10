package com.example.springboot.utils;

public class LayuiTableResultUtil<T> {
    private T data;
    private String msg;
    private int code;
    private Long count;


    public LayuiTableResultUtil(int code,String msg, Long count, T data) {
        this.msg = msg;
        this.data = data;
        this.code = code;
        this.count = count;
    }

    @Override
    public String toString() {
        return "LayuiTableResult [msg=" + msg + ", data=" + data + ", code=" + code + ", count=" + count + "]";

    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

package com.example.springboot.utils;

public class LayuiTableResultUtil {
    private Object data;
    private String message;
    private int status;
    private int total;

    public LayuiTableResultUtil() {
    }

    public LayuiTableResultUtil(int status,String msg, int total, Object data) {
        this.message = msg;
        this.data = data;
        this.status = status;
        this.total = total;
    }

    @Override
    public String toString() {
        return "LayuiTableResult [msg=" + message + ", data=" + data + ", code=" + status + ", total=" + total + "]";

    }

    public String getMsg() {
        return message;
    }

    public void setMsg(String msg) {
        this.message = msg;
    }

    public int getCount() {
        return total;
    }

    public void setCount(int total) {
        this.total = total;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

package com.vince.util;

/**
 * Package: com.vince.model
 * User: 诸葛子房
 * Email: xiaoiqu2017wy@163.com
 * Date: 2019/3/21
 * Time: 14:16
 * Description:
 */
public class Response<T> {
    private int code;
    private String msg;
    private T data;

    public Response() {
    }

    public Response(int code, String msg, T data) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public static Response from(int code) {
        return new Response(code, null, null);
    }

    public static <R> Response<R> from(int code, String msg, R data) {
        return new Response(code, msg, data);
    }

    public static Response from(int code, String msg) {
        return new Response(code, msg, null);
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

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Response{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

}

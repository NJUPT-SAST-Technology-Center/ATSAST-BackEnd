package com.sast.atSast.util;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: Xander
 * @Date: 2021/4/20 14:16
 * @Description: 传给前端的数据都为HttpResponse形式
 **/
@Data
@AllArgsConstructor
public class HttpResponse<T> {
    private boolean success;
    private String errMsg;
    private Integer errCode;
    private T data;

    public HttpResponse(boolean b, String errMsg, Integer errCode, Object o) {
    }

    public static <T> HttpResponse success(T data) {
        return new HttpResponse<>(true, null, null, data);
    }

    public static HttpResponse<Void> failure(String errMsg, Integer errCode) {
        return new HttpResponse<>(false, errMsg, errCode, null);
    }
}

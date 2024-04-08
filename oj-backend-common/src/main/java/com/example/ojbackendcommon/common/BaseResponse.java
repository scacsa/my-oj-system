package com.example.ojbackendcommon.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: 凌煜昂
 * @Date: 2023/11/7 21:57
 * @Description:
 */
@Data
public class BaseResponse<T> implements Serializable {

    private int code;

    private T data;

    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}

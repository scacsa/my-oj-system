package com.example.ojbackendcommon.exception;


import com.example.ojbackendcommon.common.ErrorCode;

/**
 * @Author: 凌煜昂
 * @Date: 2023/11/7 22:28
 * @Description:
 */
public class BusinessException extends RuntimeException {

    /**
     * 错误码
     */
    private final int code;

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public BusinessException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }

    public int getCode() {
        return code;
    }
}

package com.jackson.apiclientsdk.exception;

/**
 * 自定义异常类
 *
 * @author jackson
 */
public class ApiException extends Exception {

    private static final long serialVersionUID = 2942420535500634982L;
    private int code;

    public ApiException(int code, String message) {
        super(message);
        this.code = code;
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApiException(StatusCode statusCode) {
        super(statusCode.getMessage());
        this.code = statusCode.getCode();
    }

    public ApiException(StatusCode statusCode, String message) {
        super(message);
        this.code = statusCode.getCode();
    }

    public int getCode() {
        return code;
    }
}
package com.zqg.exception;

/**
 * 自定义异常类，需要抛出异常类
 */
public class CustomException extends  Exception {

    public String message;

    public CustomException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

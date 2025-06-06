package com.example.library.util;

import java.util.List;

public class Result<T> {
    private int code; // 状态码
    private String message; // 描述信息
    private T data; // 返回的数据

    // 私有构造函数，防止外部直接创建实例
    private Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    // 成功响应的静态方法
    public static <T> Result<T> success(T data) {
        return new Result<>(0, "操作成功", data);
    }

    // 成功响应的静态方法（无数据）
    public static Result<Void> success() {
        return new Result<>(0, "操作成功", null);
    }

    // 失败响应的静态方法
    public static <T> Result<T> error(String message) {
        return new Result<>(-1, message, null);
    }

    // 获取状态码
    public int getCode() {
        return code;
    }

    // 获取描述信息
    public String getMessage() {
        return message;
    }

    // 获取返回的数据
    public T getData() {
        return data;
    }
}
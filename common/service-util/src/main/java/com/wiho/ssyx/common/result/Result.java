package com.wiho.ssyx.common.result;

import lombok.Data;

/**
 * @Author wiho
 * @Date 2023/6/17 18:56
 * @Description 统一返回结果类
 * @Since version-1.0
 */
@Data
public class Result<T> {
    //状态码
    private Integer code;
    //信息
    private String message;
    //数据
    private T data;

    private Result() {
    }

    // 设置数据,返回对象的方法
    public static<T> Result<T> build(T data, ResultCodeEnum resultCodeEnum) {
        Result<T> result = new Result<>();
        if (data != null) {
            result.setData(data);
        }

        result.setCode(resultCodeEnum.getCode());
        result.setMessage(resultCodeEnum.getMessage());
        return result;
    }

    // 成功
    public static<T> Result<T> ok(T data) {
        Result<T> result = build(data, ResultCodeEnum.SUCCESS);
        return result;
    }
    public static<T> Result<T> ok() {
        Result<T> result = build(null, ResultCodeEnum.SUCCESS);
        return result;
    }

    // 失败
    public static<T> Result<T> fail(T data) {
        Result<T> result = build(data, ResultCodeEnum.FAIL);
        return result;
    }
    // 失败
    public static<T> Result<T> fail() {
        Result<T> result = build(null, ResultCodeEnum.FAIL);
        return result;
    }
}

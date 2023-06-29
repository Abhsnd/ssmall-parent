package com.wiho.ssyx.common.exception;

import com.wiho.ssyx.common.result.ResultCodeEnum;
import lombok.Data;

/**
 * @Author wiho
 * @Date 2023/6/17 19:04
 * @Description 自定义异常类
 * @Since version-1.0
 */
@Data
public class MyException extends RuntimeException{
    //异常状态码
    private Integer code;

    /**
     * 通过状态码和错误消息创建异常对象
     * @param message
     * @param code
     */
    public MyException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    /**
     * 接收枚举类型对象
     * @param resultCodeEnum
     */
    public MyException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }

    @Override
    public String toString() {
        return "MyException{" +
                "code=" + code +
                ", message=" + this.getMessage() +
                '}';
    }
}

package com.wiho.ssyx.common.exception;

import com.wiho.ssyx.common.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author wiho
 * @Date 2023/6/17 18:57
 * @Description 全局异常处理类
 * @Since version-1.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e) {
        e.printStackTrace();
        return Result.fail();
    }

    /**
     * @Author wiho
     * @Date 2023/6/17 19:10
     * @Description 自定义异常处理
     * @Param [e]
     * @Return com.wiho.ssyx.common.result.Result
     * @Since version-1.0
     */
    @ExceptionHandler(MyException.class)
    @ResponseBody
    public Result error(MyException e) {
        return Result.fail();
    }
}

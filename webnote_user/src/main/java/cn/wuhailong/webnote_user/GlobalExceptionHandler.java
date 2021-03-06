/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.wuhailong.webnote_user;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartException;

/**
 * 全局异常处理，异步
 * @author Administrator
 */
@ControllerAdvice
@RestController
public class GlobalExceptionHandler {
    
    /**
     * 处理文件大小受限的异常
     * @param e
     * @return
     */
    @ExceptionHandler(MultipartException.class)
    public String handleError1(MultipartException e) {
        return "BigSize";
    }

    
}

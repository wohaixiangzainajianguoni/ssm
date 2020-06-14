package com.zqg.handler;

import com.zqg.exception.CustomException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomExceptionHandler  implements HandlerExceptionResolver {
    /**
     *
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e  系统抛出的异常
     * @return
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
//       handler 就是处理器适配器，要执行的handler对象
        //


        CustomException customException=null;
        //如果是系统自定义的异常，直接取出异常信息，在页面展示
        if( e instanceof CustomException)
        {
             customException = (CustomException) e;
        }
        else {
//            如果不是自定义异常，构造一个自定义的异常（显示为未知错误）
            customException =new CustomException("未知错误");
        }

        String message = customException.getMessage();

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("error",message);

        modelAndView.setViewName("Error");


        return modelAndView;
    }
}

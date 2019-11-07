package shmily.Exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.method.HandlerMethod;

/**
 * @program: ShmilyDS
 * @description:
 * @author: ShmilyLSC
 * @create: 2019-10-31 18:18
 **/
@ControllerAdvice
public class ErrorExceptionAdvice {
    public void handlerError(Exception ex, HandlerMethod handlerMethod){

        System.out.println("统一异常处理");
        System.out.println(ex.getMessage());
        System.out.println(handlerMethod.getBean().getClass());
        System.out.println(handlerMethod.getMethod().getName());
    }
}

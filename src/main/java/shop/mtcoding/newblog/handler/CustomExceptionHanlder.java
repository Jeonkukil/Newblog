package shop.mtcoding.newblog.handler;

import shop.mtcoding.newblog.util.Script;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import shop.mtcoding.newblog.handler.ex.CustomException;

@RestControllerAdvice
public class CustomExceptionHanlder {

    // NullPointException <- RuntimeException
    @ExceptionHandler(CustomException.class)
    public String customException(CustomException e) {
        return Script.back(e.getMessage());
    }
}
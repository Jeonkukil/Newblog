package shop.mtcoding.newblog.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import shop.mtcoding.newblog.handler.ex.CustomException;
import shop.mtcoding.newblog.util.Script;

@RestControllerAdvice
public class CustomExceptionHanlder {

    // NullPointException <- RuntimeException
    public ResponseEntity<?> customException(CustomException e) {
        String responseBody = Script.back(e.getMessage());
        return new ResponseEntity<>(responseBody, e.getStatus());
    }
}
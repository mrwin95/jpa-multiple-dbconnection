package win.ddd.jpa.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import win.ddd.jpa.response.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

    public ApiResponse<Object> handleGeneralException(Exception ex, HttpServletRequest request) {
        return null;
    }
}

package win.ddd.jpa.response;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ResponseUtil {

    public static <T> ApiResponse<T> success(T data, String msg, String path) {
        return ApiResponse.<T>builder()
                .errorCode(0)
                .success(true)
                .data(data)
                .msg(msg)
                .path(path)
                .timestamp(System.currentTimeMillis())
                .build();
    }

    public static <T> ApiResponse<T> error(List<String> errors, String msg, int errorCode, String path) {
        return ApiResponse.<T>builder()
                .errorCode(errorCode)
                .errors(errors)
                .success(false)
                .data(null)
                .msg(msg)
                .path(path)
                .timestamp(System.currentTimeMillis())
                .build();
    }

    public static <T> ApiResponse<T> error(String error, String msg, int errorCode, String path) {
       return error(Collections.singletonList(error), msg, errorCode, path);
    }
}

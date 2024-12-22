package win.ddd.jpa.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class GeneralResponse<T> {

    private int code;
    private boolean success;
    private String msg;
    private T data;

    // can add more

//    private List<String> errors;
//    private long timestamp;
//    private String path;

//    public static <T> GeneralResponse<T> empty() {
//        return GeneralResponse.<T>builder()
//                .success(false)
//                .msg("")
//                .data(null)
//                .build();
//    }
//
//    public static <T> GeneralResponse<T> success(T data) {
//        return GeneralResponse.<T>builder()
//                .success(true)
//                .msg("success")
//                .data(data).build();
//    }
//
//    public static <T> GeneralResponse<T> success(String msg, T data) {
//        return GeneralResponse.<T>builder()
//                .success(true)
//                .msg(msg)
//                .data(data).build();
//    }
//
//    public static <T> GeneralResponse<T> error(String msg) {
//        return GeneralResponse.<T>builder()
//                .success(false)
//                .msg("error")
//                .build();
//    }
//
//    public static <T> GeneralResponse<T> error(String msg, T data) {
//        return GeneralResponse.<T>builder()
//                .success(false)
//                .msg(msg)
//                .data(null)
//                .build();
//    }
}

package win.ddd.jpa.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponse<T> {

    private boolean success;
    private String msg;
    private T data;
    private int errorCode;
    private List<String> errors;
    private long timestamp;
    private String path;

}

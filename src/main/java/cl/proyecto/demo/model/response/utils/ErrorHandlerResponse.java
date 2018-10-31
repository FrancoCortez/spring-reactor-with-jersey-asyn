package cl.proyecto.demo.model.response.utils;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@ToString
@Builder
public class ErrorHandlerResponse extends BaseResponse {
    private Object trace;
    private String message;
    private Throwable cause;
}

package cl.proyecto.demo.model.response.utils;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@ToString
@Builder
public class SuccessHandlerResponse extends BaseResponse {
    private String title;
    private Object data;
}

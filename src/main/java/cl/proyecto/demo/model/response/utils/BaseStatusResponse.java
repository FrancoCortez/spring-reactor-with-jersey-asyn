package cl.proyecto.demo.model.response.utils;

import lombok.*;

import javax.ws.rs.core.MediaType;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@ToString
@Builder
public class BaseStatusResponse implements Serializable {
    private Integer status;
    private MediaType type;
    private Object data;
}

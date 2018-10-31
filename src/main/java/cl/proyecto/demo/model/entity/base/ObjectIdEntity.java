package cl.proyecto.demo.model.entity.base;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@ToString
public class ObjectIdEntity implements Serializable {

    @Id
    private String _id;
    private AuditingEntity auditingEntity;
}

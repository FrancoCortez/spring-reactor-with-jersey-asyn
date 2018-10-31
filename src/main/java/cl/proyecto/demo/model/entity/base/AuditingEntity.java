package cl.proyecto.demo.model.entity.base;

import lombok.*;
import org.springframework.data.annotation.*;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@EqualsAndHashCode(callSuper = false)
public class AuditingEntity implements Serializable {

    @CreatedBy
    private String createdBy;
    @CreatedDate
    private Date createdDate;
    @LastModifiedBy
    private String lastModifiedBy;
    @LastModifiedDate
    private Date lastModfiedDate;
    @Version
    private Long version = 1L;
    private Boolean delete = true;

}

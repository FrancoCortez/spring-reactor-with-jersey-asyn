package cl.proyecto.demo.model.entity.domain;

import cl.proyecto.demo.model.entity.base.ObjectIdEntity;
import lombok.*;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
@ToString
@Document(collection = "typeUser")
public class TypeUserEntity extends ObjectIdEntity {
    @TextIndexed
    @NotNull
    @NotBlank
    private String name;
    private String description;
}

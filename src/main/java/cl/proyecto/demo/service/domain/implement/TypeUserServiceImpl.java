package cl.proyecto.demo.service.domain.implement;

import cl.proyecto.demo.model.entity.domain.TypeUserEntity;
import cl.proyecto.demo.model.response.utils.BaseStatusResponse;
import cl.proyecto.demo.service.base.BaseServiceImpl;
import cl.proyecto.demo.service.domain.interfaces.TypeUserService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class TypeUserServiceImpl extends BaseServiceImpl<TypeUserEntity, String> implements TypeUserService {

    public Mono<? extends BaseStatusResponse> testMostrar() {
        try {
            return this.okHandlerResponse();
        } catch (Exception ex) {
            return this.errorHandlerResponse(ex);
        }

    }
}

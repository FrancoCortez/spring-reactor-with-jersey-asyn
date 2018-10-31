package cl.proyecto.demo.service.domain.interfaces;

import cl.proyecto.demo.model.entity.domain.TypeUserEntity;
import cl.proyecto.demo.model.response.utils.BaseStatusResponse;
import cl.proyecto.demo.service.base.BaseService;
import reactor.core.publisher.Mono;

public interface TypeUserService extends BaseService<TypeUserEntity, String> {

    Mono<? extends BaseStatusResponse> testMostrar();
}

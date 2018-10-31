package cl.proyecto.demo.service.base;


import cl.proyecto.demo.model.entity.base.ObjectIdEntity;
import cl.proyecto.demo.model.response.utils.BaseStatusResponse;
import cl.proyecto.demo.model.response.utils.ErrorHandlerResponse;
import cl.proyecto.demo.model.response.utils.SuccessHandlerResponse;
import reactor.core.publisher.Mono;

import javax.ws.rs.core.MediaType;

public class BaseServiceImpl<T extends ObjectIdEntity, ID extends String> implements BaseService<T, ID> {

    protected Mono<BaseStatusResponse> errorHandlerResponse(Exception ex) {
        return Mono.justOrEmpty(BaseStatusResponse.builder()
                .status(400)
                .type(MediaType.APPLICATION_JSON_TYPE)
                .data(ErrorHandlerResponse.builder()
                        .message(ex.getMessage())
                        .trace(ex.getStackTrace())
                        .cause(ex.getCause())
                        .build())
                .build());
    }

    protected Mono<BaseStatusResponse> errorHandlerResponse(String msg) {
        return Mono.justOrEmpty(BaseStatusResponse.builder()
                .status(400)
                .type(MediaType.APPLICATION_JSON_TYPE)
                .data(ErrorHandlerResponse.builder()
                        .message(msg)
                        .build())
                .build());
    }

    protected Mono<BaseStatusResponse> errorHandlerResponse() {
        return Mono.justOrEmpty(BaseStatusResponse.builder()
                .status(400)
                .type(MediaType.APPLICATION_JSON_TYPE)
                .data(ErrorHandlerResponse.builder()
                        .message("Error Desconocido!!")
                        .build())
                .build());
    }

    protected Mono<BaseStatusResponse> okHandlerResponse(String title, Object data) {
        return Mono.justOrEmpty(BaseStatusResponse.builder()
                .status(200)
                .type(MediaType.APPLICATION_JSON_TYPE)
                .data(SuccessHandlerResponse.builder()
                        .title(title)
                        .data(data)
                        .build())
                .build());
    }

    protected Mono<BaseStatusResponse> okHandlerResponse(Object data) {
        return Mono.justOrEmpty(BaseStatusResponse.builder()
                .status(200)
                .type(MediaType.APPLICATION_JSON_TYPE)
                .data(SuccessHandlerResponse.builder()
                        .title("Exito")
                        .data(data)
                        .build())
                .build());
    }

    protected Mono<BaseStatusResponse> okHandlerResponse() {
        return Mono.justOrEmpty(BaseStatusResponse.builder()
                .status(200)
                .type(MediaType.APPLICATION_JSON_TYPE)
                .data(SuccessHandlerResponse.builder()
                        .title("Exito")
                        .data("El proceso se realizo con exito.")
                        .build())
                .build());
    }

}

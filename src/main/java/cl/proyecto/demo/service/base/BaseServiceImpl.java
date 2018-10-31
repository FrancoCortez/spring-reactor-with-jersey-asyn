package cl.proyecto.demo.service.base;


import cl.proyecto.demo.model.entity.base.ObjectIdEntity;
import cl.proyecto.demo.model.response.utils.BaseResponse;
import cl.proyecto.demo.model.response.utils.BaseStatusResponse;
import cl.proyecto.demo.model.response.utils.ErrorHandlerResponse;
import cl.proyecto.demo.model.response.utils.SuccessHandlerResponse;
import reactor.core.publisher.Mono;

import javax.ws.rs.core.MediaType;

public class BaseServiceImpl<T extends ObjectIdEntity, ID extends String> implements BaseService<T, ID> {

    protected Mono<? extends BaseResponse> errorHandlerResponse(Exception ex) {
        return Mono.justOrEmpty(ErrorHandlerResponse.builder()
                .message(ex.getMessage())
                .trace(ex.getStackTrace())
                .cause(ex.getCause())
                .build());
    }

    protected Mono<? extends BaseResponse> errorHandlerResponse(String msg) {
        return Mono.justOrEmpty(ErrorHandlerResponse.builder()
                .message(msg)
                .build());
    }

    protected <K extends ErrorHandlerResponse> Mono<? extends BaseResponse> errorHandlerResponse() {
        return Mono.justOrEmpty(ErrorHandlerResponse.builder()
                .message("Error Desconocido!!!")
                .build());
    }

    protected <K extends SuccessHandlerResponse> Mono<? extends BaseResponse> okHandlerResponse(String title, Object data) {
        return Mono.justOrEmpty(SuccessHandlerResponse.builder()
                .data(data)
                .title(title)
                .build());
    }

    protected <K extends SuccessHandlerResponse> Mono<? extends BaseResponse> okHandlerResponse(Object data) {
        return Mono.justOrEmpty(SuccessHandlerResponse.builder()
                .data(data)
                .title("Respuesta ok")
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

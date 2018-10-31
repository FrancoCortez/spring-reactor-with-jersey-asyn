package cl.proyecto.demo.api.base;

import cl.proyecto.demo.model.response.utils.BaseStatusResponse;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class BaseRouterHandler {

    protected Response response(BaseStatusResponse resp) {
        return Response
                .status(resp.getStatus())
                .entity(resp.getData())
                .type(resp.getType())
                .build();
    }

    protected Response response(Throwable error) {
        return Response
                .status(400)
                .entity(error.getMessage())
                .type(MediaType.APPLICATION_JSON_TYPE)
                .build();
    }


}

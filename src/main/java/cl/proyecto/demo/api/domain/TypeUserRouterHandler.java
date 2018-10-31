package cl.proyecto.demo.api.domain;

import cl.proyecto.demo.api.base.BaseRouterHandler;
import cl.proyecto.demo.service.domain.interfaces.TypeUserService;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;

@Component
@Path("/test")
@Produces({MediaType.APPLICATION_JSON})
public class TypeUserRouterHandler extends BaseRouterHandler {

    private final TypeUserService typeUserService;

    public TypeUserRouterHandler(final TypeUserService typeUserService) {
        this.typeUserService = typeUserService;
    }

    @GET
    @Path("/test2")
    public void test(@Suspended AsyncResponse asyncResponse) {
        this.typeUserService.testMostrar().subscribe(
                resp -> {
                    asyncResponse.resume(this.response(resp));
                },
                error -> {
                    asyncResponse.resume(response(error));
                }
        );
    }

}

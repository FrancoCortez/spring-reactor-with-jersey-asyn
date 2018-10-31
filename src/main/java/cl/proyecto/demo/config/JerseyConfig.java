package cl.proyecto.demo.config;

import cl.proyecto.demo.api.domain.TypeUserRouterHandler;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(TypeUserRouterHandler.class);
    }
}

package de.chkpnt;

import java.io.IOException;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.micronaut.http.annotation.*;

@Controller("/")
@OpenAPIDefinition(
        info = @Info(title = "example-service", version = "1.0.0")
)
public class ExampleController {
    private static final Logger LOG = LoggerFactory.getLogger(ExampleController.class);

    @Get("/ping")
    public String index() {
        return "{\"pong\":true, \"graal\": true}";
    }
}

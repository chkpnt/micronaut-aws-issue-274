package de.chkpnt;

import java.io.IOException;

import io.micronaut.http.HttpStatus;
import io.micronaut.validation.Validated;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.micronaut.http.annotation.*;

import javax.validation.Valid;

@Controller("/")
@Validated
@OpenAPIDefinition(
        info = @Info(title = "example-service", version = "1.0.0")
)
public class ExampleController {
    private static final Logger LOG = LoggerFactory.getLogger(ExampleController.class);

    @Post("/doSomething")
    @Status(HttpStatus.NO_CONTENT)
    public void doSomething(@Valid @Body Request request) {
        LOG.info("Request: {}", request);
    }

    @Get("/ping")
    public String index() {
        return "{\"pong\":true, \"graal\": true}";
    }
}

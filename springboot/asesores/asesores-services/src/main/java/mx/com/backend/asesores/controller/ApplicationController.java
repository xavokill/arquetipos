package mx.com.backend.asesores.controller;

import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import mx.com.backend.asesores.service.ApplicationService;

/**
 * Created by
 */
@RestController
@RequestMapping("")
@Api(value = "Applciation Asesores")
public class ApplicationController {

    private static final Logger log = LoggerFactory.getLogger(ApplicationController.class);

    @Autowired
    private ApplicationService applicationService;

    @GetMapping(produces = "application/json", value = { "/version" })
    public String getVersion() {
            return "1.0";
    }
}

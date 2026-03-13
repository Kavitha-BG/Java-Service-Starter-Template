
package com.starter.template.controller;

import com.starter.template.model.DataProcessorRequest;
import com.starter.template.model.DataProcessorResponse;
import com.starter.template.service.DataProcessorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/example")
public class DataProcessorController {

    private final DataProcessorService service;

    public DataProcessorController(DataProcessorService service){
        this.service = service;
    }

    @PostMapping
    public DataProcessorResponse process(@RequestBody DataProcessorRequest request){
        return service.process(request);
    }
}


package com.starter.template.service;

import com.starter.template.model.DataProcessorRequest;
import com.starter.template.model.DataProcessorResponse;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DataProcessorServiceImpl implements DataProcessorService {

    @Override
    public DataProcessorResponse process(DataProcessorRequest request){

        String requestId = UUID.randomUUID().toString();

        return new DataProcessorResponse(
                "SUCCESS",
                requestId
        );
    }
}

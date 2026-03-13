
package com.starter.template.service;

import com.starter.template.model.DataProcessorRequest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataProcessorServiceTest {

    private final DataProcessorService service = new DataProcessorServiceImpl();

    @Test
    void testProcess(){

        DataProcessorRequest request = new DataProcessorRequest();
        request.setUserId("123");
        request.setValue(42);

        var response = service.process(request);

        assertEquals("SUCCESS",response.getStatus());
        assertNotNull(response.getRequestId());
    }
}

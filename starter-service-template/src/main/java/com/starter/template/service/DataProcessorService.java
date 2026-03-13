
package com.starter.template.service;

import com.starter.template.model.DataProcessorRequest;
import com.starter.template.model.DataProcessorResponse;

public interface DataProcessorService {

    DataProcessorResponse process(DataProcessorRequest request);

}

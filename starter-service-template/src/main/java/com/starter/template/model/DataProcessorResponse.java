
package com.starter.template.model;

public class DataProcessorResponse {

    private String status;
    private String requestId;

    public DataProcessorResponse(String status,String requestId){
        this.status = status;
        this.requestId = requestId;
    }

    public String getStatus(){
        return status;
    }

    public String getRequestId(){
        return requestId;
    }
}

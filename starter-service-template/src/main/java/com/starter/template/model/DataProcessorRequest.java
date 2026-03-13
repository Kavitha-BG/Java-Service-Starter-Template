
package com.starter.template.model;

public class DataProcessorRequest {

    private String userId;
    private Integer value;

    public String getUserId(){
        return userId;
    }

    public void setUserId(String userId){
        this.userId = userId;
    }

    public Integer getValue(){
        return value;
    }

    public void setValue(Integer value){
        this.value = value;
    }
}

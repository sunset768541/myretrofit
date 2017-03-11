package com.example.sunset.usretrofit.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sunset on 2017/3/10.
 */

public class Contributer {
    private String reason;
    private Result result;
    private Integer errorCode;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

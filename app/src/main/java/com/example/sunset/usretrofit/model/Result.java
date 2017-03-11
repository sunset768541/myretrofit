
package com.example.sunset.usretrofit.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {

    private String stat;
    private List<Datum> data = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

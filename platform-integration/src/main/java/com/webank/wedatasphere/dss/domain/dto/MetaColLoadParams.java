package com.webank.wedatasphere.dss.domain.dto;

public class MetaColLoadParams extends SampleTableParams {
    private String metaid;

    public MetaColLoadParams(String metaid) {
        this.metaid = metaid;
    }

    public MetaColLoadParams() {
    }

    public String getMetaid() {
        return metaid;
    }

    public void setMetaid(String metaid) {
        this.metaid = metaid;
    }
}

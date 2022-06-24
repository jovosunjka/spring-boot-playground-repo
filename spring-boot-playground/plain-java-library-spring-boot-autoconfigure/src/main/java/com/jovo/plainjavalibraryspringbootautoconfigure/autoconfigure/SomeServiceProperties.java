package com.jovo.plainjavalibraryspringbootautoconfigure.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "plain-java-library.some-service")
public class SomeServiceProperties {
    private int serviceParam1;
    private int serviceParam2;
    private int serviceParam3;



    public int getServiceParam1() {
        return serviceParam1;
    }

    public void setServiceParam1(int serviceParam1) {
        this.serviceParam1 = serviceParam1;
    }

    public int getServiceParam2() {
        return serviceParam2;
    }

    public void setServiceParam2(int serviceParam2) {
        this.serviceParam2 = serviceParam2;
    }

    public int getServiceParam3() {
        return serviceParam3;
    }

    public void setServiceParam3(int serviceParam3) {
        this.serviceParam3 = serviceParam3;
    }
}

package com.jovo.plainjavalibrary.services.configs;

public class SomeServiceImpl1Config {
    private int serviceParam1;
    private int serviceParam2;
    private int serviceParam3;

    public SomeServiceImpl1Config(int serviceParam1, int serviceParam2, int serviceParam3) {
        this.serviceParam1 = serviceParam1;
        this.serviceParam2 = serviceParam2;
        this.serviceParam3 = serviceParam3;
    }

    public int getServiceParam1() {
        return serviceParam1;
    }

    public int getServiceParam2() {
        return serviceParam2;
    }

    public int getServiceParam3() {
        return serviceParam3;
    }
}

package com.jovo.plainjavalibrary.services.impl;

import com.jovo.plainjavalibrary.services.SomeService;
import com.jovo.plainjavalibrary.services.configs.SomeServiceImpl1Config;

public class SomeServiceImpl1 implements SomeService {

    private SomeServiceImpl1Config someServiceImpl1Config;

    public SomeServiceImpl1(SomeServiceImpl1Config someServiceImpl1Config) {
        this.someServiceImpl1Config = someServiceImpl1Config;
    }

    @Override
    public double someMethod(int param1, String param2) {
        if (someServiceImpl1Config.getServiceParam1() <= 5) {
            return 1.0;
        }
        else if (someServiceImpl1Config.getServiceParam2() <= 10) {
            return 2.0;
        }

        return 3.0;
    }
}

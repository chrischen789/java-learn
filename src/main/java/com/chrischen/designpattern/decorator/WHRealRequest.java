package com.chrischen.designpattern.decorator;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class WHRealRequest {

    private static Logger log = LoggerFactory.getLogger(WHRealRequest.class);

    private String apiDesc;

    private String methodName;

    public abstract String apiDefinition();

    public void showApiDesc() {
        log.debug("this is WHRealRequest!");
    }

}

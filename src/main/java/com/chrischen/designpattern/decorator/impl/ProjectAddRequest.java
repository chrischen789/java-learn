package com.chrischen.designpattern.decorator.impl;

import com.chrischen.designpattern.decorator.WHRealRequest;
import com.chrischen.designpattern.decorator.WHRealRequestDecorator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ProjectAddRequest extends WHRealRequestDecorator {

    private static Logger log = LoggerFactory.getLogger(ProjectAddRequest.class);

    private WHRealRequest whRealRequest;

    public ProjectAddRequest(WHRealRequest whRealRequest) {
        this.whRealRequest = whRealRequest;
    }

    @Override
    public String apiDefinition() {
        String originDef = whRealRequest.apiDefinition();
        String selfParam = originDef + " + Project Add Request Data Params";
        log.debug(selfParam);
        return selfParam;
    }
}

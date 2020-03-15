package com.chrischen.designpattern.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteWHRealRequest extends WHRealRequest {

    private static Logger log = LoggerFactory.getLogger(ConcreteWHRealRequest.class);

    @Override
    public String apiDefinition() {
        String defStr = "base params";
        log.debug("concrete wh real request params: {}", defStr);
        return defStr;
    }
}

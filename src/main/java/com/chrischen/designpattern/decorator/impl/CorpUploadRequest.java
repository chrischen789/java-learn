package com.chrischen.designpattern.decorator.impl;

import com.chrischen.designpattern.decorator.ConcreteWHRealRequest;
import com.chrischen.designpattern.decorator.WHRealRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CorpUploadRequest extends ConcreteWHRealRequest {

    private static Logger log = LoggerFactory.getLogger(ProjectAddRequest.class);

    private WHRealRequest whRealRequest;

    public CorpUploadRequest(WHRealRequest whRealRequest) {
        this.whRealRequest = whRealRequest;
    }

    @Override
    public String apiDefinition() {
        String originDef = whRealRequest.apiDefinition();
        String selfParam = originDef + " + Corp Upload Request Data Params";
        log.debug(selfParam);
        return selfParam;
    }

}

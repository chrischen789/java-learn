package com.chrischen.designpattern.strategy;

import com.chrischen.designpattern.decorator.ConcreteWHRealRequest;
import com.chrischen.designpattern.decorator.WHRealRequest;
import com.chrischen.designpattern.decorator.impl.CorpUploadRequest;
import com.chrischen.designpattern.decorator.impl.ProjectAddRequest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DecoratorTest {

    private static Logger log = LoggerFactory.getLogger(DecoratorTest.class);

    @Test
    public void test() {
        WHRealRequest whRealRequest = new ConcreteWHRealRequest();
        WHRealRequest projectAddRequest = new ProjectAddRequest(whRealRequest);
        log.debug(projectAddRequest.apiDefinition());

        WHRealRequest corpUploadRequest = new CorpUploadRequest(whRealRequest);
        log.debug(corpUploadRequest.apiDefinition());
    }

}

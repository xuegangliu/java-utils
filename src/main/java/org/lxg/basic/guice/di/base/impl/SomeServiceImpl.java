package org.lxg.basic.guice.di.base.impl;

import org.lxg.basic.guice.di.base.DataProcessor;
import org.lxg.basic.guice.di.base.SomeService;

public class SomeServiceImpl implements SomeService {

    @Override
    public String processData(final String first, final String second) {
        DataProcessor processor = (DataProcessor) new StringDataConcatenation();
        //do something
        String result = processor.process(first, second);
        //do something
        return result;
    }
}
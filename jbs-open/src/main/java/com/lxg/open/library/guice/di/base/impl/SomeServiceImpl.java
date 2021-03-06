package com.lxg.open.library.guice.di.base.impl;

import com.lxg.open.library.guice.di.base.DataProcessor;
import com.lxg.open.library.guice.di.base.SomeService;

/**
 * @author xuegangliu
 *  2017/3/16 0016.
 */
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

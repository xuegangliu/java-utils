package com.lxg.common.util;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**************************
 * @description: DateToolsTest
 * @author: xuegangliu
 * @date: 2019/3/6 15:20
 ***************************/
@Slf4j
public class DateToolsTest {

    @Test
    public void testDate1(){
        System.out.println(Math.random()*100/10);
//        for(int i=1;i<=12;i++) {
//            log.info("{}月第一天:{}",i,DateTools.getMonthFirstyDay(i,"yyyyMMdd"));
//        }
//        log.info("------------------------");
//        for(int i=1;i<=12;i++) {
//            log.info("{}月第一天:{}",i,DateTools.getMonthLastDay(i,"yyyyMMdd"));
//        }
    }

    @Test
    public void test111(){
        System.out.println(158394%1000);
        System.out.println(158394/1000);
    }

}

package com.xsj.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @author xsj
 * @create 2020-12-18 20:58
 */
public class IDUtils {
    public static String getId(){
        return UUID.randomUUID().toString().replace("-","");
    }
    @Test
    public void test(){
        System.out.println(getId());
        System.out.println(getId());
        System.out.println(getId());
    }
}

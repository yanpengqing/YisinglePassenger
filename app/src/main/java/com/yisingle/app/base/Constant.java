package com.yisingle.app.base;

/**
 * Created by jikun on 17/5/23.
 */

public class Constant {


    private static final String HTPP = "http://";
    private static final String IP = "119.23.51.14";
    private static final String PORT = "8080";


    public static String getBaseUrl() {

        return HTPP + IP + ":" + PORT + "/";
    }
}

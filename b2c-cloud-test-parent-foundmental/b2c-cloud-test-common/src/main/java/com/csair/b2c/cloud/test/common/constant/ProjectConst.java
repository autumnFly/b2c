package com.csair.b2c.cloud.test.common.constant;

/**
 * Created by yu on 2018/4/29.
 */
public class ProjectConst {
    public static final int REDIS_SESSION_EXPIRED_TIME = 3600;

    public static final String ZUUL_SERVICE_PREFIX_NO_SUFFIX = "http://b2c-cloud-test-zuul";
    public static final String ZUUL_SERVICE_PREFIX = ZUUL_SERVICE_PREFIX_NO_SUFFIX + "/zuul";
    public static final String CONFIG_SERVICE_PREFIX = "http://b2c-cloud-test-config";
    public static final String REDIS_SERVICE_PREFIX = "http://b2c-cloud-test-redis";

    public static final String CSAIR_HOST = "http://ec.test.csair.com";
    public static final String CSAIR_HOST_NO_SCHEMA = CSAIR_HOST.substring(7);
    public static final boolean DEBUG = false;
}

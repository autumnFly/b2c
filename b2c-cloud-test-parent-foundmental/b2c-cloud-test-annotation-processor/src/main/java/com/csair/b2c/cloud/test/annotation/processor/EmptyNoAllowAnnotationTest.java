package com.csair.b2c.cloud.test.annotation.processor;

import com.csair.b2c.cloud.test.annotation.processor.annotation.EmptyNoAllow;
// 这行导入勿删,否则这个类编译会失败
import com.csair.b2c.cloud.test.common.util.AssertUtils;

/**
 * Created on 2019/1/9.<br/>
 *
 * @author yudong
 */
public class EmptyNoAllowAnnotationTest {
    public static void main(String[] args) {
        getLength("aaa", "");
        getLength(null, "");
    }

    public static int getLength(@EmptyNoAllow(value = "name不能为空") String name, @EmptyNoAllow String desc) {
        return name.length() + desc.length();
    }
}

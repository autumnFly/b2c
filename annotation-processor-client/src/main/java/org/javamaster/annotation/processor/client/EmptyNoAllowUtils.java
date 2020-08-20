package org.javamaster.annotation.processor.client;

// AssertUtils类的导入勿删,否则这个类编译会失败

import com.csair.b2c.cloud.test.common.util.AssertUtils;
import org.javamaster.annotation.processor.annotation.EmptyNoAllow;


/**
 * Created on 2019/1/9.<br/>
 *
 * @author yudong
 */
public class EmptyNoAllowUtils {

    public static int getLength(@EmptyNoAllow(value = "name不能为空") String name, @EmptyNoAllow String desc) {
        System.out.println(AssertUtils.class);
        return name.length() + desc.length();
    }
}

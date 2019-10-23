package com.csair.b2c.cloud.test.learn.maven.validation;

import javax.validation.GroupSequence;
import javax.validation.groups.Default;

/**
 * Created on 2018/9/15.<br/>
 *
 * @author yudong
 */
@GroupSequence({Default.class, SecondCheck.class})
public interface OrderedChecks {
}

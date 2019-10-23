package com.csair.b2c.cloud.test.websocket.validation;

import javax.validation.GroupSequence;
import javax.validation.groups.Default;

@GroupSequence({ Default.class, CarChecksGroup.class, DriverChecksGroup.class })
public interface OrederedChecksGroup {

}

package com.csair.b2c.cloud.test.annotation.processor.service;

import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.TypeElement;
import java.util.Set;

/**
 * Created on 2019/1/22.<br/>
 *
 * @author yudong
 */
public interface RunOnce {
    void run(ProcessingEnvironment proEnv, Set<? extends TypeElement> annotations, RoundEnvironment roundEnv);
}

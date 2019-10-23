package com.csair.b2c.cloud.test.sys.repository;

import com.csair.b2c.cloud.test.sys.model.InsuranceInfoBean;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created on 2018/8/26.<br/>
 *
 * @author yudong
 */
@Repository
public interface InsureRepository extends MongoRepository<InsuranceInfoBean, String> {

    @Query("{\"type\":?0,\"inUsed\":\"1\",\"scope\":{\"$in\":[\"D\",\"ID\"]}}")
    InsuranceInfoBean findInsuranceInfo(String type);
}

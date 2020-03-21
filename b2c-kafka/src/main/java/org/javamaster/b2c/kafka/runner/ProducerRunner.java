package org.javamaster.b2c.kafka.runner;

import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFutureCallback;

/**
 * @author yudong
 * @date 2019/12/13
 */
@Slf4j
@Component
public class ProducerRunner implements CommandLineRunner {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @Override
    public void run(String... args) {
        JSONObject json = new JSONObject();
        json.put("cardId", "440106199505081480");
        json.put("userId", "U16042011265010759941");
        kafkaTemplate.send("mall_user_do_name_auth", json.toString()).addCallback(new ListenableFutureCallback<SendResult<String, Object>>() {
            @Override
            public void onFailure(Throwable throwable) {
                log.error(throwable.getMessage(), throwable);
            }

            @Override
            public void onSuccess(SendResult<String, Object> stringObjectSendResult) {
                log.info(stringObjectSendResult.toString());
            }
        });
    }

}

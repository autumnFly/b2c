package com.csair.b2c.cloud.test.websocket.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.util.concurrent.TimeUnit;

@Component
@ServerEndpoint(value = "/macro")
public class SocketHandler extends AbstractWebSocketHandler {
    Logger logger = LoggerFactory.getLogger(getClass());
    int i;

    @OnOpen
    public void onOpen(Session session) {
        logger.info("connect");
    }

    @OnClose
    public void onClose() {
        logger.info("close");
    }

    @OnMessage
    public void onMessage(String message, Session session) throws Exception {
        logger.info("receive:" + message + " from js");
        TimeUnit.SECONDS.sleep(2);
        session.getBasicRemote().sendText("send polo to js! " + i++);
    }

    @OnError
    public void onError(Session session, Throwable error) {
    }
}

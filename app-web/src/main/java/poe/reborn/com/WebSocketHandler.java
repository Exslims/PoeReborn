package poe.reborn.com;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * Exslims
 * 28.06.2016
 */
public class WebSocketHandler extends TextWebSocketHandler {
    Logger logger = Logger.getLogger(WebSocketHandler.class);
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        logger.info("Stage one#");
        session.sendMessage(new TextMessage("HELLO"));
    }
}

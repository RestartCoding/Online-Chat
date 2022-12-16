package com.xb.online.chat.conttroller;

import com.xb.online.chat.domain.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * @author jack
 */
@Controller
public class GreetingController {

    @MessageMapping("/message")
    @SendTo("/topic/message")
    public Message greeting(Message message) {
        return message;
    }
}

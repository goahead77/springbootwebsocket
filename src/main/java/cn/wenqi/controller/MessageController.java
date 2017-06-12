package cn.wenqi.controller;

import cn.wenqi.model.RequestModel;
import cn.wenqi.model.ResponseModel;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * @author wenqi
 */
@Controller
public class MessageController {

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public ResponseModel say(RequestModel model) {
        System.out.println(model);
        return new ResponseModel(200,"ID为："+model.getUid() +"的用户说："+model.getMessage());
    }

}

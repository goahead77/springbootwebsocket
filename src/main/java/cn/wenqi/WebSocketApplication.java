package cn.wenqi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Hello world!
 */

@Controller
@SpringBootApplication
public class WebSocketApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebSocketApplication.class,args);
    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/leader")
    public String leader(){
        return "leader";
    }
}

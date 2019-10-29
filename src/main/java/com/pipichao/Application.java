package com.pipichao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.socket.config.annotation.EnableWebSocket;

@SpringBootApplication
//@EnableWebSocket
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

//    即时对话通信实例
//    https://blog.csdn.net/shijiemozujiejie/article/details/78583514
//    websocket 前端测试地址
//    http://coolaf.com/tool/chattest
}

package com.pipichao.web.ws_jdk.websocket;

import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

///使用原生的jdk自带的websocket

@ServerEndpoint("/myWs")
@Component
public class WsServerEndpoint {
    @OnOpen
    public void onOpen(Session session) throws IOException {
        System.out.println("连接成功");
        session.getBasicRemote().sendText("收到连接");
    }

    @OnClose
    public void onClose(Session session) throws IOException{
        session.getBasicRemote().sendText("连接关闭");
        System.out.println("连接关闭");
    }
    @OnMessage
    public void onMsg(String text){
        System.out.println("servet 发送:"+text);
    }
//    @OnError
//    public void onError(Session session) throws IOException{
//        System.out.println("出错误了");
//    }
}

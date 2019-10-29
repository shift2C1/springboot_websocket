package com.pipichao.web.ws_spring.config;

//import org.springframework.stereotype.Component;

import org.springframework.web.socket.WebSocketSession;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

//@Component
public class WsSessionManager {
    private static ConcurrentHashMap<String, WebSocketSession> SESSION_POOL=new ConcurrentHashMap<>();
    public static void add(String key ,WebSocketSession webSocketSession){
        SESSION_POOL.put(key, webSocketSession);
    }
    public static WebSocketSession remove(String key) {
        // 删除 session
        return SESSION_POOL.remove(key);
    }
    public static void removeAndClose(String key) {
        WebSocketSession session = remove(key);
        if (session != null) {
            try {
                // 关闭连接
                session.close();
            } catch (IOException e) {
                // todo: 关闭出现异常处理
                e.printStackTrace();
            }
        }
    }
    public static WebSocketSession get(String key) {
        // 获得 session
        return SESSION_POOL.get(key);
    }
}

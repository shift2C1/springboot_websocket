package com.pipichao.web.ws_spring.interceptor;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

import java.util.HashMap;
import java.util.Map;

@Component
public class MyInterceptor implements HandshakeInterceptor {
    @Override
    public boolean beforeHandshake(ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse, WebSocketHandler webSocketHandler, Map<String, Object> attributes) throws Exception {
        System.out.println("握手开始");
        // 获得请求参数
//        HashMap<String, String> paramMap = HttpUtil.decodeParamMap(serverHttpRequest.getURI().getQuery(), "utf-8");
//        String uid = paramMap.get("token");
//        if (StrUtil.isNotBlank(uid)) {
//            // 放入属性域
//            attributes.put("token", uid);
//            System.out.println("用户 token " + uid + " 握手成功！");
//            return true;
//        }
        System.out.println("用户登录已失效");
        return true;
    }

    @Override
    public void afterHandshake(ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse, WebSocketHandler webSocketHandler, Exception e) {
        System.out.println("握手完成");
    }
}

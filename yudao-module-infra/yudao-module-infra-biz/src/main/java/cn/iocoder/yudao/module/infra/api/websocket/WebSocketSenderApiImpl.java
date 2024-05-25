package cn.iocoder.yudao.module.infra.api.websocket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;

/**
 * WebSocket 发送器的 API 实现类
 *
 * @author 芋道源码
 */
@Component
@Slf4j
public class WebSocketSenderApiImpl implements WebSocketSenderApi {


    @Override
    public void send(Integer userType, Long userId, String messageType, String messageContent) {
        log.info("发送消息给用户编号：{}，消息类型：{}，消息内容：{}", userId, messageType, messageContent);
    }

    @Override
    public void send(Integer userType, String messageType, String messageContent) {
        log.info("发送消息给用户类型：{}，消息类型：{}，消息内容：{}", userType, messageType, messageContent);
    }

    @Override
    public void send(String sessionId, String messageType, String messageContent) {
        log.info("发送消息给会话编号：{}，消息类型：{}，消息内容：{}", sessionId, messageType, messageContent);
    }

}

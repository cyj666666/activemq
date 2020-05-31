package com.mq.activemq.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import java.util.UUID;

/**
 * @Author: caoyunji
 * @Date: 2020/5/29 0:44
 */
@Component
public class Queue_producer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    public void produceMsg() {
        jmsMessagingTemplate.convertAndSend(queue, "你好：" + UUID.randomUUID().toString().substring(0, 6));
        System.out.println("入队成功！！");
    }

    @Scheduled(fixedRate = 2000)
    public void produceMsgSchesual() {
        jmsMessagingTemplate.convertAndSend(queue, "你好，定时入队：" + UUID.randomUUID().toString().substring(0, 6));
        System.out.println("定时入队成功！！");
    }
}

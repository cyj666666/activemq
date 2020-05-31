package com.mq.activemq.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

/**
 * @Author: caoyunji
 * @Date: 2020/5/29 0:40
 */
@Component
@EnableJms
public class mqConfigBean {

    @Value("${myqueue}")
    private String myqueue;

    @Bean
    public Queue queue() {
        return new ActiveMQQueue(myqueue);
    }


}

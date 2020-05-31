package com.activemq.consumer.mq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

/**
 * @Author: caoyunji
 * @Date: 2020/5/29 0:44
 */
@Component
public class Queue_cosumer {

    @JmsListener(destination = "${myqueue}")
    public void recieve(TextMessage textMessage) throws JMSException {

        System.out.println("消费队列值：" + textMessage.getText());

    }


}

package com.mq.activemq;

import com.mq.activemq.mq.Queue_producer;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;

@SpringBootTest
@RunWith(SpringRunner.class)
class QueueProduceTest {

    @Resource
    private Queue_producer queue_producer;

    @Test
    public void testSendQueue() {
        queue_producer.produceMsg();
    }
}

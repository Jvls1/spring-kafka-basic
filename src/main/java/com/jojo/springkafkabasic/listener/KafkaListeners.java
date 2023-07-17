package com.jojo.springkafkabasic.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author João Vitor Lopes
 */
@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "jojokafka",
            groupId = "groupId"
    )
    void listener(String data) {
        System.out.println("Listener received " + data + " \uD83C\uDF89");
    }
}


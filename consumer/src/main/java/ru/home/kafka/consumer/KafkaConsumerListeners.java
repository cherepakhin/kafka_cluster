package ru.home.kafka.consumer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import ru.home.kafka.dto.JsonMessage;

/**
 * Kafka consumers.
 */
@Component
@RequiredArgsConstructor
@Slf4j
public class KafkaConsumerListeners {

    // Ниже 2 получателя (handle1, handle2) для одного топика
    // Сообщения будут доставлены ОБОИМ получателям
    @KafkaListener(
            // Группа консюмера
            id = "consumer-group-1",
            // Топик
            topics = "${kafka.topics.test-topic}",
            // ВАЖНО: определяет фабрику, которую мы используем.
            // Иначе используется фабрика по умолчанию и многопоточность не работает
            containerFactory = "kafkaListenerContainerFactory")
    public void handle1(@Payload JsonMessage message) {
        printMessage(message, "consumer-group-1_handle1");
    }

    @KafkaListener(
            // Группа консюмера
            id = "consumer-group-2",
            // Топик
            topics = "${kafka.topics.test-topic}",
            // ВАЖНО: определить фабрику.
            // Иначе используется фабрика по умолчанию и многопоточность не работает
            containerFactory = "kafkaListenerContainerFactory")
    public void handle2(@Payload JsonMessage message) {
        printMessage(message, "consumer-group-2");
    }

    public void printMessage(JsonMessage message, String idConsumerGroup) {
        long number = message.getNumber();
        // Имя потока для интереса. Никакой функциональной ценности не несет.
        String currentThreadName = Thread.currentThread().getName();
        log.info("Получено idConsumerGroup={} сообщение {} в потоке: {} ", idConsumerGroup, message, currentThreadName);
    }

}
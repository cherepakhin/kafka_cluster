# kafka-cluster
https://habr.com/ru/articles/738874/

kafka-cluster$ ./gradlew :consumer:test
BUILD SUCCESSFUL in 7s


kafka-cluster$./gradlew :producer:test
BUILD SUCCESSFUL in 9s
2 actionable tasks: 1 executed, 1 up-to-date

Реальный тест
-----------------------------------------------------------
Отправка 10000 сообщений до Kafka на 192.168.1.20 дошло. Проверил Kafka UI (http://192.168.1.20:8960/ui/clusters/local/all-topics/topic1/messages?keySerde=String&valueSerde=String&limit=100)

Отправка
-----------------------------------------------------------
kafka-cluster$ ./gradlew :producer:bootRun

Прием
-----------------------------------------------------------
kafka-cluster/consumer$ ./gradlew bootRun

https://spring.io/guides/gs/multi-module
# Работа с Kafka
https://habr.com/ru/articles/738874/

Запуск Kafka consumer:

````shell
kafka-cluster$ ./gradlew :consumer:test
BUILD SUCCESSFUL in 7s
````

Запуск Kafka producer:

````shell
kafka-cluster$./gradlew :producer:test
BUILD SUCCESSFUL in 9s
2 actionable tasks: 1 executed, 1 up-to-date
````

Или так, через запуск spring boot приложений.

Отправка:

````shell
kafka-cluster$ ./gradlew :producer:bootRun
````

Прием:

````shell
kafka-cluster/consumer$ ./gradlew bootRun
````

Статья на тему [https://v.perm.ru/index.php/instrumenty-devops/work-with-kafka](https://v.perm.ru/index.php/instrumenty-devops/work-with-kafka).

Проект многомодульный [https://spring.io/guides/gs/multi-module](https://spring.io/guides/gs/multi-module).

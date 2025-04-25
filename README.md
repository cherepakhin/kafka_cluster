# kafka-cluster
https://habr.com/ru/articles/738874/

````shell
kafka-cluster$ ./gradlew :consumer:test
BUILD SUCCESSFUL in 7s
````

````shell
kafka-cluster$./gradlew :producer:test
BUILD SUCCESSFUL in 9s
2 actionable tasks: 1 executed, 1 up-to-date
````

Отправка:

````shell
kafka-cluster$ ./gradlew :producer:bootRun
````

Прием:

````shell
kafka-cluster/consumer$ ./gradlew bootRun
````

Проект многомодульный (https://spring.io/guides/gs/multi-module)[https://spring.io/guides/gs/multi-module]

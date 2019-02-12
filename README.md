# KafkaProducer


Spring boot web service as Kafka Producer.
Stream Log4j2 Logs to Apache Kafka  

# dependencies
```
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-log4j2</artifactId>
</dependency>

<dependency>
  <groupId>org.apache.kafka</groupId>
  <artifactId>kafka-log4j-appender</artifactId>
</dependency>
```  
    
You can send post request to test:

###### localhost:8080/kafka/sendRequest/transactionRequest
```
 {
    "transaction_id":"123335678",
    "amount":"5000",
    "user_name":"Rahul",
    "from_account":"2347789",
    "to_account":"3447789",
    "currency":"RS",
    "date":"1549898597941",
     "remark":"trasfer"
 }
```
    

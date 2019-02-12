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
  
  # Log4j2 Configuration
  
  ```
 <?xml version="1.0" encoding="UTF-8"?>
<Configuration status="info"
	name="spring-boot-log-to-kafka-example" packages="com.kafkaproducer">
	<Appenders>
		<Kafka name="kafkaAppender" topic="test">
			<JSONLayout />
			<Property name="bootstrap.servers">localhost:9092</Property>
			<RegexFilter regex=".*kafakatestlog.*" onMatch="ACCEPT"
				onMismatch="DENY" />
		</Kafka>

		<!--stdout/stderr included for testing Oozie log4j edits -->
		<Console name="stdout" target="SYSTEM_OUT">
			<PatternLayout
				pattern="%d{HH:mm:ss.SSS} %-5p [%-7t] %F:%L - %m%n" />
		</Console>
		<Console name="stderr" target="SYSTEM_ERR">
			<PatternLayout
				pattern="%d{HH:mm:ss.SSS} %-5p [%-7t] %F:%L - %m%n" />
			<Filters>
				<ThresholdFilter level="WARN" onMatch="ACCEPT" />
			</Filters>
		</Console>

	</Appenders>
	<Loggers>
		<Root level="INFO">
			<AppenderRef ref="kafkaAppender" />

			<!--stdout/stderr included for testing Oozie log4j edits -->
			<AppenderRef ref="stdout" />
			<AppenderRef ref="stderr" />
		</Root>
		<Logger name="org.apache.kafka" level="warn" />
	</Loggers>
</Configuration>
  ```

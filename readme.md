# Transactional Outbox Pattern

The Transactional Outbox Pattern is a design pattern used in distributed systems to ensure consistency between a database operation and an external system. 

## Overview
- **Problem**: Ensuring that changes made to a database are reliably propagated to external systems.
- **Solution**: When a database transaction occurs, instead of directly sending messages to external systems, the Transactional Outbox Pattern involves writing messages to an outbox table within the same database transaction. These messages are then asynchronously processed and sent to external systems.
- **Benefits**: Ensures atomicity between database changes and external system updates, improving reliability and consistency.

## Implementation Steps
1. **Create an Outbox Table**: Add a table to the database to store messages to be sent to external systems.
2. **Write Messages to the Outbox**: Within the same database transaction, write messages to the outbox table.
3. **Process Outbox Messages**: Asynchronously process messages from the outbox table and send them to external systems.
4. **Ensure Delivery**: Implement mechanisms to handle message retries and ensure delivery to external systems.

By following the Transactional Outbox Pattern, developers can achieve reliable and consistent communication between databases and external systems in distributed architectures.

```mermaid
graph LR
    A[Database] --> B[Outbox Table]
    B --> C((Broker))
    C --> D[Service: Post]
    C --> E[Service: Comments]
```

## Technology
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [MySQL](https://www.mysql.com)
- [Postgres](https://www.postgresql.org)
- [Docker Compose](https://docs.docker.com/compose/)
- [Kafka](https://kafka.apache.org)
- [Kafka Connect](https://docs.confluent.io/platform/current/connect/index.html)
- [Debezium MySQL Source Connector](https://docs.confluent.io/kafka-connectors/debezium-mysql-source/current/mysql_source_connector_config.html)
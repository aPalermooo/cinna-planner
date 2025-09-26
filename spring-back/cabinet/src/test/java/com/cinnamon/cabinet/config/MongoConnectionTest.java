package com.cinnamon.cabinet.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MongoConnectionTest {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    void testMongoConnection() {
        assertThat(mongoTemplate).isNotNull();
        String dbName = mongoTemplate.getDb().getName();
        System.out.println("✅ Connected to MongoDB database: " + dbName);
        assertThat(dbName).isNotBlank();
    }
}

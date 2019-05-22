package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
public class MyTestcontainersTests {

    @Container
    private PostgreSQLContainer postgresqlContainer = new PostgreSQLContainer()
            .withDatabaseName("foo")
            .withUsername("foo")
            .withPassword("secret");

    @Test
    void test() {
        assertTrue(postgresqlContainer.isRunning());
    }

    @org.junit.Test
    void oldTest() {
        Assert.fail("this should be a compile error");
    }

}

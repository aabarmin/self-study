package ru.mydesignstudio.spring.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@Transactional
@Sql("classpath:create-tables.sql")
@SpringJUnitConfig(InMemoryDataSourceConfiguration.class)
public class TransactionalTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void check_contextStarts() {
        assertNotNull(jdbcTemplate);
    }

    @Test
    void check_select() {
        jdbcTemplate.execute("select * from test");
    }
}

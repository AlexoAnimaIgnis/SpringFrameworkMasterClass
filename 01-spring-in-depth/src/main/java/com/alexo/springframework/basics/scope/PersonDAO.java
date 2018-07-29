package com.alexo.springframework.basics.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAO {

    @Autowired
    JdbcConnection jdbcConnection;

    public JdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(JdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}

package com.alexo.springframework.basics.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component

@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE
        ,proxyMode= ScopedProxyMode.TARGET_CLASS) // to reconcile different scope of related class
public class JdbcConnection {

    public JdbcConnection(){
        System.out.println("JDBC Connection");
    }
}

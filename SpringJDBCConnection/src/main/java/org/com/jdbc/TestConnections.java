package org.com.jdbc;

import java.sql.Connection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TestConnections {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext conn =
                new AnnotationConfigApplicationContext(DBConfig.class);

        DriverManagerDataSource ds =
                conn.getBean(DriverManagerDataSource.class);

        try {

            Connection con = ds.getConnection();

            if(con != null) {
                System.out.println("Database Connected Successfully");
            }

        } catch(Exception e) {

            System.out.println("Connection Failed");
            e.printStackTrace();

        }
    }
}
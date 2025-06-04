package com.example.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootApplication
public class LibraryApplication implements CommandLineRunner {

    @Autowired
    private DataSource dataSource;

    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        try(Connection conn = dataSource.getConnection()) {
            System.out.println("===== 数据库连接成功！=====");
            System.out.println("数据库URL: " + conn.getMetaData().getURL());
            System.out.println("数据库用户: " + conn.getMetaData().getUserName());
        } catch(Exception e) {
            System.err.println("===== 数据库连接失败！=====");
            e.printStackTrace();
        }
    }
}
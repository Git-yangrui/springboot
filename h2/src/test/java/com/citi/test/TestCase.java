package com.citi.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DataSourceAutoConfiguration.class})
@PropertySource("classpath:application-test.yml")
public class TestCase {

    @Autowired
    DataSource dataSource;


    @Test
    public void test1()  throws  Exception{
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet1 = statement.executeQuery("select * from USER");
       
      while(resultSet1.next()){
          int anInt = resultSet1.getInt(1);
//          String string = resultSet1.getString("2");
          int anInt1 = resultSet1.getInt(3);

          System.out.println(anInt);

//          System.out.println(string);
          System.out.println(anInt1);
      }
    }
}

package com.milan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/*
    @SpringBootApplication 标注主程序类
    @ImportResource 导入spring的配置文件beans.xml
 */
//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {
        //这是master
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }

}

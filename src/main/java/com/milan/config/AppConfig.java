package com.milan.config;

import com.milan.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 指明该类为配置类，代替spring配置文件
 */
@Configuration
public class AppConfig {

    //@Bean  相当于spring配置文件的bean标签，将方法的返回值添加到容器中，id是方法名
    @Bean
    public HelloService helloService(){
        return new HelloService();
    }

}

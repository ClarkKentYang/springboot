package com.milan.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @ConfigurationProperties    将本类中的属性与配置文件相关配置进行绑定
 * @Component   注入bean 新
 * @Validated   数据校验
 * @PropertySource(value = {"classpath:person.properties"}) 导入单独的配置文件
 */
@Component
@PropertySource(value = {"classpath:person.properties"})
@ConfigurationProperties(prefix = "person")
//@Validated

public class Person {

    //@Value一般用于普通的像配置文件取值
    //@Value("${person.username}")
    private String username;
    @Value("#{11*2}")
    private int age;
    @Value("true")
    private boolean marry;
    private Date birth;

    private List<String> list;
    private Map<String,Object> map;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarry() {
        return marry;
    }

    public void setMarry(boolean marry) {
        this.marry = marry;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", marry=" + marry +
                ", birth=" + birth +
                ", list=" + list +
                ", map=" + map +
                '}';
    }

    public Person(String username, int age, boolean marry, Date birth, List<String> list, Map<String, Object> map) {
        this.username = username;
        this.age = age;
        this.marry = marry;
        this.birth = birth;
        this.list = list;
        this.map = map;
    }

    public Person() {
    }
}

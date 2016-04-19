package com.sr;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class HelloService {
    private Integer age;

    public String sayHello() {
        return "Hello world!";
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }
}

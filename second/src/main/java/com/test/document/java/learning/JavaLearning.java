package com.test.document.java.learning;

import com.alibaba.fastjson.JSON;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author byron
 * @date 2019/12/31 16:54
 */
@SpringBootApplication
public class JavaLearning {
    public static void main(String[] args) {
        System.out.println("Let's start java learning!");
        System.out.println(JSON.toJSONString("hello"));
//        new SpringApplication(JavaLearning.class).run(args);
        SpringApplication.run(JavaLearning.class, args);
    }
}
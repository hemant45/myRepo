package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTutorialBasicsApplication {

	public static void main(String[] args) {
		ApplicationContext appContext =
                SpringApplication.run(SpringTutorialBasicsApplication.class, args);

        for (String appcon: appContext.getBeanDefinitionNames()
             ) {
            System.out.println("*****" + appcon);
        }
	}
}

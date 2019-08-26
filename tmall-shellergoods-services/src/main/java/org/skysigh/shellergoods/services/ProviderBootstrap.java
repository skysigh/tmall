package org.skysigh.shellergoods.services;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderBootstrap {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/spring.xml"});
        context.start();
        while (true) {
            Thread.sleep(5000);
        }
    }
}

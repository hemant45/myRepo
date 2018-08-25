package com.spring.messgaeservice;


import org.springframework.stereotype.Component;

@Component
public interface MessageService {
    boolean sendMessage (String msg, String rec);
}

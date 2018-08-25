package com.spring.messgaeservice;

public class EmailMessage implements MessageService {
    @Override
    public boolean sendMessage(String msg, String rec) {
        System.out.println (msg + " : EMail sent to : "+ rec);
        return true;
    }
}

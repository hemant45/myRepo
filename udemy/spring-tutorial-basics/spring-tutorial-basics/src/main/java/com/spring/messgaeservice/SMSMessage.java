package com.spring.messgaeservice;

public class SMSMessage implements MessageService{

    public boolean sendMessage(String msg, String rec){
        System.out.println (msg + " : SMS sent to : "+ rec);
        return true;
    }
}

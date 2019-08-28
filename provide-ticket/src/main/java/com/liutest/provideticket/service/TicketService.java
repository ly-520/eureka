package com.liutest.provideticket.service;

import org.springframework.stereotype.Service;

@Service
public class TicketService {
    public String testTicket(){
        System.out.println("端口8002");
        return "<厉害了，我的国>";
    }
}

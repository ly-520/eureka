package com.liutest.provideticket.controller;

import com.liutest.provideticket.service.TicketService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @Autowired
    TicketService ticketService;

    @GetMapping("/testTicket")
    public String Test() {
        return ticketService.testTicket();
    }
}

package com.bootcamp.jbtaxi.controller;

import com.bootcamp.jbtaxi.dto.WaitingDTO;
import com.bootcamp.jbtaxi.service.CallService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/call")
public class CallController {
  @Autowired
  private CallService callService;

  @MessageMapping("/taxi")
  public void callTaxi(@RequestBody WaitingDTO request) {
    
  }

  @MessageMapping("/waiting")
  public void waiting(@RequestBody WaitingDTO request) {
    
  }
}

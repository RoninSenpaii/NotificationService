package me.ronin.ns.controller;

import feign.RequestInterceptor;

import me.ronin.ns.client.PlayerClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {
    @Autowired
    PlayerClient client;


    @GetMapping("/player")
    public ResponseEntity<?> fetchPlayer(){
        return ResponseEntity.ok(client.fetchPlayer());
    }

}

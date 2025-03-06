package com.boostup.quotapi.controllers;

import com.boostup.quotapi.service.QuoteServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

    @Autowired
    private QuoteServices quoteService;

    @GetMapping("/getQuote")
    public ResponseEntity<String> getQuote() {
        String quote = quoteService.getRandomQuote();
        return ResponseEntity.ok(quote); 
    }
}

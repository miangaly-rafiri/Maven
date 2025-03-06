package com.boostup.quotapi.service;

import com.boostup.quotapi.models.Quote;
import com.boostup.quotapi.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random; 

 @Service
public class QuoteServices {

    @Autowired
    private QuoteRepository quoteRepository;

    public String getRandomQuote() {
        List<Quote> quotes = quoteRepository.findAll();
        if (quotes.isEmpty()) {
            return "Aucune citation disponible.";
        }
        Random random = new Random();
        Quote quote = quotes.get(random.nextInt(quotes.size()));
        return quote.getQuote(); 
    }
}

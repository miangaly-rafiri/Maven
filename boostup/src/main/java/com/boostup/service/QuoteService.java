package com.boostup.service;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteService {

    private final String API_URL = "http://localhost:8081/getQuote"; 

    @Autowired
    private RestTemplate restTemplate;


    public String getRandomQuote() {
        try {

            return restTemplate.getForObject(API_URL, String.class);
        } catch (Exception e) {
            
            return new String("Erreur lors de la récupération de la citation.");
        }
    }
}

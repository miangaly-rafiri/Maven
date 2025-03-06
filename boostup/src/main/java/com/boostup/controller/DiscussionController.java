package com.boostup.controller;

import com.boostup.model.Discussion;

import com.boostup.service.DiscussionService;
import com.boostup.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DiscussionController {

    @Autowired
    private DiscussionService discussionService;

    @Autowired
    private QuoteService quoteService;

    @GetMapping("/show")
    public String chat(Model model) {
        model.addAttribute("discussion", new Discussion());
        return "chat";
    }

    @PostMapping("/sendMessage")
    public String sendMessage(@RequestParam String username, @RequestParam String message, Model model) {
        
       String response = quoteService.getRandomQuote();

        if (response == null || response.isEmpty()) {
            System.out.println("Erreur: La citation est vide ou nulle.");
        } else {
            System.out.println("Citation récupérée : " + response);
        }

        discussionService.saveDiscussion(username, message, response);

        model.addAttribute("response", response);

        return "chat";
    }

    @GetMapping("/all")
    public String showDiscussions(Model model) {
        List<Discussion> discussions = discussionService.getAllDiscussions();
        model.addAttribute("discussions", discussions);
        return "Discussion";
    }
}

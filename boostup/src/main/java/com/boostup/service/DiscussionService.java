/*package com.boostup.service;

import com.boostup.model.Discussion;
import com.boostup.repository.DiscussionRepository;
import com.boostup.quotapi.models.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DiscussionService {

    @Autowired
    private DiscussionRepository discussionRepository;

    public void saveDiscussion(String username, String userMessage, Quote response) {
        Discussion discussion = new Discussion(username, userMessage, response.getQuote(), LocalDateTime.now());
        discussionRepository.save(discussion);
    }

    public List<Discussion> getAllDiscussions() {
        return discussionRepository.findAll();
    }
}*/


package com.boostup.service;

import com.boostup.model.Discussion;

import com.boostup.repository.DiscussionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DiscussionService {

    @Autowired
    private DiscussionRepository discussionRepository;

    public void saveDiscussion(String username, String userMessage, String response) {

       
        Discussion discussion = new Discussion(username, userMessage, response, LocalDateTime.now());
        discussionRepository.save(discussion);
    }

    public List<Discussion> getAllDiscussions() {
        return discussionRepository.findAll();
    }
}

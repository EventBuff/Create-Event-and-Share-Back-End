package com.SpringBootTest.controller;

import com.SpringBootTest.domain.Event;
import com.SpringBootTest.domain.EventRepository;
import com.SpringBootTest.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yanli on 11/6/16.
 */

@RestController
public class EventDetailController {
    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/eventDetail")
    public EventDetail eventDetail(Integer eventid){
        //if event exist
        if(eventRepository.findByEventid(eventid) != null &&
                //if user exist
                userRepository.findByUserid(eventRepository.findByEventid(eventid).getCreatorid()).getUsername() != null){
            return new EventDetail(eventRepository.findByEventid(eventid),
                    userRepository.findByUserid(eventRepository.findByEventid(eventid).getCreatorid()).getUsername());
        }
        else return null;
    }

}

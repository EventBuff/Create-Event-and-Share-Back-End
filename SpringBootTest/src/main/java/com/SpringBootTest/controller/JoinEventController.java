package com.SpringBootTest.controller;

import com.SpringBootTest.domain.EventRepository;
import com.SpringBootTest.domain.Event;
import com.SpringBootTest.domain.UserEventRepository;
import com.SpringBootTest.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yanli on 11/6/16.
 */

@RestController
public class JoinEventController {

    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserEventRepository userEventRepository;

    @RequestMapping("/eventDetail/join")
    public String joinEvent(Integer eventid, Integer userid){
        //if event and user exist
         if(eventRepository.findByEventid(eventid) != null && userRepository.findByUserid(userid) != null
                 //if this event is not closed
                 && eventRepository.findByEventid(eventid).getIsclose() == false
                 //if user is not the creator
                 && eventRepository.findByEventid(eventid).getCreatorid() != userid){
             //if it has joined this event, just return else save then return
             if(userEventRepository.findByEventidAndParticipantid(eventid, userid) == null) {
                 userEventRepository.save(new com.SpringBootTest.domain.UserEvent(eventid, userid));
             }
             return "You are joined this event!";
        }
        else return "You cannot join this event!";
    }
}

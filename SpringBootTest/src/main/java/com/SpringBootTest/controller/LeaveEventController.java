package com.SpringBootTest.controller;

import com.SpringBootTest.domain.Event;
import com.SpringBootTest.domain.EventRepository;
import com.SpringBootTest.domain.UserEventRepository;
import com.SpringBootTest.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yanli on 11/7/16.
 */

@RestController
public class LeaveEventController {

    @Autowired
    private UserEventRepository userEventRepository;
    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/eventDetail/leave")
    public String leaveEvent(Integer eventid, Integer userid){
        //If event and user exist
        if(eventRepository.findByEventid(eventid) != null && userRepository.findByUserid(userid) !=null
                //if user has participated in this event
                && userEventRepository.findByEventidAndParticipantid(eventid, userid) !=null
                //if this event is not closed
                && eventRepository.findByEventid(eventid).getIsclose() == false
                //if user is not creator
                && eventRepository.findByEventid(eventid).getCreatorid() != userid){
            userEventRepository.deleteByEventidAndParticipantid(eventid, userid);
            return "You leave the event successfully!";
        }
        else return "You cannot leave this event!";
    }
}

package com.cinnamon.cabinet.controller.planner;


import com.cinnamon.cabinet.domain.event.GenericEvent;
import com.cinnamon.cabinet.mapper.event.GenericEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planner")
public class EventController {

    @Autowired
    GenericEventRepository eventRepo;

    @GetMapping("/test")
    public String test() {
        return "Test";
    }

    @GetMapping("/all")
    public List<GenericEvent> all() {
        return eventRepo.findAll();
    }

}

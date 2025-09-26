package com.cinnamon.cabinet.controller.planner;


import com.cinnamon.cabinet.domain.planner.event.GenericEvent;
import com.cinnamon.cabinet.mapper.planner.GenericEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.UUID;

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

    @PostMapping("/create")
    public ResponseEntity<GenericEvent> create(@RequestBody GenericEvent event) {
        return ResponseEntity
                .created(URI.create("/planner/" + event.getId()))
                .body(eventRepo.save(event));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> delete(@RequestBody List<UUID> id) {
        if (id.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }
        eventRepo.deleteAllById(id);
        return ResponseEntity.ok().build();
    }

}

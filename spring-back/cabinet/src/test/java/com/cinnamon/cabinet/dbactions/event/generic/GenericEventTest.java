package com.cinnamon.cabinet.dbactions.event.generic;

import com.cinnamon.cabinet.domain.event.GenericEvent;
import com.cinnamon.cabinet.mapper.event.GenericEventRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class GenericEventTest {

    @Autowired
    private GenericEventRepository eventRepo;

    @Test
    public void createAndRead() {
        List<GenericEvent> events =  new ArrayList<>();

        events.add(new GenericEvent("Test","This is a Test", Set.of("Apple","Banana"),LocalDate.now(), LocalDate.now().plusDays(1)));
        events.add(new GenericEvent("Event","This is another Test", Set.of("Banana"),LocalDate.now().minusDays(1), LocalDate.now()));
        events.add(new GenericEvent("Test Day", "This is also another Test", Set.of("Apple","Pear"), LocalDate.now().plusWeeks(1), LocalDate.now().plusWeeks(1) ));

        // save and capture persisted events (with IDs)
        List<GenericEvent> savedEvents = eventRepo.saveAll(events);

        // Check by ID
        Optional<GenericEvent> returnEvent = eventRepo.findById(savedEvents.get(1).getId());
        assertThat(returnEvent.isEmpty()).isFalse();
        assertThat(returnEvent.get().getName()).isEqualTo("Event");

        // Check by ID all
        List<UUID> ids = new ArrayList<>();
        for  (GenericEvent event : savedEvents) {
            ids.add(event.getId());
        }

        List<GenericEvent> returnEvents = eventRepo.findAllById(ids);
        assertThat(returnEvents.size()).isEqualTo(events.size());
        assertThat(returnEvents)
                .extracting(GenericEvent::getName)
                .containsExactlyInAnyOrder("Test", "Event", "Test Day");

        //Clean Database
        eventRepo.deleteAllById(ids);
        returnEvents = eventRepo.findAllById(ids);
        assertThat(returnEvents.size()).isEqualTo(0);

    }

    @Test
    public void update() {
        //Create Test Event
        GenericEvent event =  new GenericEvent("Pre-Update","This is a Test", Set.of("Apple","Banana"),LocalDate.now(), LocalDate.now().plusDays(1));

        eventRepo.save(event);

        //Check Test Event
        Optional<GenericEvent> returnEvent =  eventRepo.findById(event.getId());
        assertThat(returnEvent.isEmpty()).isFalse();
        assertThat(returnEvent.get().getName()).isEqualTo("Pre-Update");

        //Update Test Event
        GenericEvent updatedEvent = returnEvent.get();
        updatedEvent.setName("Updated Test");
        eventRepo.save(updatedEvent);

        returnEvent =  eventRepo.findById(updatedEvent.getId());
        assertThat(returnEvent.isEmpty()).isFalse();
        assertThat(returnEvent.get().getName()).isEqualTo("Updated Test");

        //Clean Database
        eventRepo.deleteById(event.getId());
        returnEvent =  eventRepo.findById(event.getId());
        assertThat(returnEvent.isEmpty()).isTrue();
    }

    @Test
    public void delete() {
        GenericEvent event =  new GenericEvent("Temporary","This is a Test", Set.of("Apple","Banana"),LocalDate.now(), LocalDate.now().plusDays(1));

        eventRepo.save(event);

        Optional<GenericEvent> returnEvent =  eventRepo.findById(event.getId());
        assertThat(returnEvent.isEmpty()).isFalse();
        assertThat(returnEvent.get().getName()).isEqualTo("Temporary");

        eventRepo.delete(event);
        returnEvent =  eventRepo.findById(event.getId());
        assertThat(returnEvent.isEmpty()).isTrue();
    }
}

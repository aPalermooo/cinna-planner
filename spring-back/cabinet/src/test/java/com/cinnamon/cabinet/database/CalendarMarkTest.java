package com.cinnamon.cabinet.database;

import com.cinnamon.cabinet.domain.planner.CalendarMark;
import com.cinnamon.cabinet.mapper.planner.GenericEventRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class CalendarMarkTest {

    @Autowired
    private GenericEventRepository eventRepo;

    @Test
    public void createAndRead() {
        List<CalendarMark> events =  new ArrayList<>();

        events.add(new CalendarMark("Test","This is a Test", Set.of("Apple","Banana")));
        events.add(new CalendarMark("Event","This is another Test", Set.of("Banana")));
        events.add(new CalendarMark("Test Day", "This is also another Test", Set.of("Apple","Pear")));

        // save and capture persisted events (with IDs)
        List<CalendarMark> savedEvents = eventRepo.saveAll(events);

        // Check by ID
        Optional<CalendarMark> returnEvent = eventRepo.findById(savedEvents.get(1).getId());
        assertThat(returnEvent.isEmpty()).isFalse();
        assertThat(returnEvent.get().getTitle()).isEqualTo("Event");

        // Check by ID all
        List<UUID> ids = new ArrayList<>();
        for  (CalendarMark event : savedEvents) {
            ids.add(event.getId());
        }

        List<CalendarMark> returnEvents = eventRepo.findAllById(ids);
        assertThat(returnEvents.size()).isEqualTo(events.size());
        assertThat(returnEvents)
                .extracting(CalendarMark::getTitle)
                .containsExactlyInAnyOrder("Test", "Event", "Test Day");

        //Clean Database
        eventRepo.deleteAllById(ids);
        returnEvents = eventRepo.findAllById(ids);
        assertThat(returnEvents.size()).isEqualTo(0);

    }

    @Test
    public void update() {
        //Create Test Event
        CalendarMark event =  new CalendarMark("Pre-Update","This is a Test", Set.of("Apple","Banana"));

        eventRepo.save(event);

        //Check Test Event
        Optional<CalendarMark> returnEvent =  eventRepo.findById(event.getId());
        assertThat(returnEvent.isEmpty()).isFalse();
        assertThat(returnEvent.get().getTitle()).isEqualTo("Pre-Update");

        //Update Test Event
        CalendarMark updatedEvent = returnEvent.get();
        updatedEvent.setTitle("Updated Test");
        eventRepo.save(updatedEvent);

        returnEvent =  eventRepo.findById(updatedEvent.getId());
        assertThat(returnEvent.isEmpty()).isFalse();
        assertThat(returnEvent.get().getTitle()).isEqualTo("Updated Test");

        //Clean Database
        eventRepo.deleteById(event.getId());
        returnEvent =  eventRepo.findById(event.getId());
        assertThat(returnEvent.isEmpty()).isTrue();
    }

    @Test
    public void delete() {
        CalendarMark event =  new CalendarMark("Temporary","This is a Test", Set.of("Apple","Banana"));

        eventRepo.save(event);

        Optional<CalendarMark> returnEvent =  eventRepo.findById(event.getId());
        assertThat(returnEvent.isEmpty()).isFalse();
        assertThat(returnEvent.get().getTitle()).isEqualTo("Temporary");

        eventRepo.delete(event);
        returnEvent =  eventRepo.findById(event.getId());
        assertThat(returnEvent.isEmpty()).isTrue();
    }
}

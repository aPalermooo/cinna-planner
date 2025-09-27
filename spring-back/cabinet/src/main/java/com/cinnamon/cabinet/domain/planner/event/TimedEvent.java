package com.cinnamon.cabinet.domain.planner.event;

import com.cinnamon.cabinet.domain.util.Address;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;
import java.util.UUID;

public class TimedEvent extends AllDayEvent {

    private LocalTime  startTime;
    private LocalTime endTime;

    public TimedEvent() {
        super();
    }

    public TimedEvent(UUID id, String title, String description, Set<String> tags,
                      LocalDate dateStart, LocalDate dateEnd, Address location,
                      LocalTime startTime, LocalTime endTime) {
        super(id, title, description, tags, dateStart, dateEnd, location);
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public TimedEvent(String title, String description, Set<String> tags,
                      LocalDate dateStart, LocalDate dateEnd, Address location,
                      LocalTime startTime, LocalTime endTime) {
        this(null, title, description, tags, dateStart, dateEnd, location, startTime, endTime);
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
}

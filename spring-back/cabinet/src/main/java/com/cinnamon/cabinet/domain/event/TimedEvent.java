package com.cinnamon.cabinet.domain.event;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public class TimedEvent extends GenericEvent {

    private LocalTime  startTime;
    private LocalTime endTime;

    public TimedEvent(String name, String description, Set<String> tags, LocalDate dateStart, LocalDate dateEnd) {
        super(name, description, tags, dateStart, dateEnd);
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

package com.cinnamon.cabinet.domain.event;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class TimedEvent extends GenericEvent {

    private LocalTime  startTime;
    private LocalTime endTime;

    public TimedEvent(UUID id, String name, String description, Set<String> tags, LocalDate dateStart, LocalDate dateEnd) {
        super(id, name, description, tags, dateStart, dateEnd);
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

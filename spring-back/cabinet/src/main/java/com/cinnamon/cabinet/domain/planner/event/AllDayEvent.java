package com.cinnamon.cabinet.domain.planner.event;


import com.cinnamon.cabinet.domain.planner.CalendarMark;
import com.cinnamon.cabinet.domain.util.Address;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

@Document (collection = "events")
public class AllDayEvent extends CalendarMark {

    private LocalDate dateStart;
    private LocalDate dateEnd;
    private Address location;

    // Persistence constructor
    public AllDayEvent() {
        super();
    }

    // All constructor
    public AllDayEvent(UUID id, String title, String description, Set<String> tags, LocalDate dateStart, LocalDate dateEnd, Address location) {
        super(id, title, description, tags);
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.location = location;
    }

    // Typical constructor
    public AllDayEvent(String title, String description, Set<String> tags, LocalDate dateStart, LocalDate dateEnd, Address location) {
        this(null, title, description, tags, dateStart, dateEnd, location);
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public void setDateStart(LocalDate date) {
        this.dateStart = date;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        this.location = location;
    }
}

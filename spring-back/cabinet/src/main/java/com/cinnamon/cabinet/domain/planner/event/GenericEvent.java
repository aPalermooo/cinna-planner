package com.cinnamon.cabinet.domain.planner.event;


import com.cinnamon.cabinet.domain.util.Address;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Document (collection = "events")
public class GenericEvent {

    @Id
    private UUID id;
    private String title;
    private String description;
    private Set<String> tags;
    private LocalDate dateStart;
    private LocalDate dateEnd;
    private Address location;

    // Persistence constructor
    public GenericEvent() {
        this.id = UUID.randomUUID(); // auto-generate UUID if none provided
        this.tags = new HashSet<>(); // init tagSet
    }

    // All constructor
    public GenericEvent(UUID id, String title, String description, Set<String> tags, LocalDate dateStart, LocalDate dateEnd, Address location) {
        this.id = id != null ? id : UUID.randomUUID();
        this.title = title;
        this.description = description;
        this.tags = tags != null ? tags : new HashSet<>();
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.location = location;
    }

    // Typical constructor
    public GenericEvent(String title, String description, Set<String> tags, LocalDate dateStart, LocalDate dateEnd, Address location) {
        this(null, title, description, tags, dateStart, dateEnd, location);
    }

    public void setId(UUID Id) {
        this.id = (Id != null ? Id : UUID.randomUUID());
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<String> getTags() {
        return tags;
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

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public void appendTags(Set<String> tags) {
        this.tags.addAll(tags);
    }

    public void removeTags(Set<String> tags) {
        for (String tag : tags) {
            this.tags.remove(tag);
        }
    }

    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        this.location = location;
    }
}

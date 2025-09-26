package com.cinnamon.cabinet.domain.event;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Document (collection = "events")
public class GenericEvent {

    @Id
    private UUID id;
    private String name;
    private String description;
    private Set<String> tags;
    private LocalDate dateStart;
    private LocalDate dateEnd;

    // Persistence constructor for Spring Data
    public GenericEvent() {
        // Needed by Spring Data
    }

    public GenericEvent(UUID id, String name, String description, Set<String> tags, LocalDate dateStart, LocalDate dateEnd) {
        this.id = id != null ? id : UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.tags = tags != null ? tags : new HashSet<>();
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

    // Your regular constructor
    public GenericEvent(String name, String description, Set<String> tags, LocalDate dateStart, LocalDate dateEnd) {
        this(null, name, description, tags, dateStart, dateEnd);
    }

    public void setId(UUID Id) {
        this.id = (Id != null ? Id : UUID.randomUUID());
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}

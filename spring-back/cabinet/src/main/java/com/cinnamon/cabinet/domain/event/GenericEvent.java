package com.cinnamon.cabinet.domain.event;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

@Document
public class GenericEvent {

    @Id
    final private UUID id;
    private String name;
    private String description;
    final private Set<String> tags;
    private LocalDate dateStart;
    private LocalDate dateEnd;

    public GenericEvent(String name, String description, Set<String> tags, LocalDate dateStart, LocalDate dateEnd) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.tags = tags;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
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

    public void appendTags(Set<String> tags) {
        this.tags.addAll(tags);
    }

    public void removeTags(Set<String> tags) {
        for (String tag : tags) {
            this.tags.remove(tag);
        }
    }
}

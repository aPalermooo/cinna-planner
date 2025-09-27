package com.cinnamon.cabinet.domain.planner;

import org.springframework.data.annotation.Id;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class CalendarMark {
    @Id
    protected UUID id;
    protected String title;
    protected String description;
    protected Set<String> tags;

    public CalendarMark() {
        this.id = UUID.randomUUID(); // auto-generate UUID if none provided
        this.tags = new HashSet<>(); // init tagSet
    }

    public CalendarMark(UUID id, String title, String description, Set<String> tags) {
        this.id = id != null ? id : UUID.randomUUID();
        this.title = title;
        this.description = description;
        this.tags = tags != null ? tags : new HashSet<>();
    }

    // Typical constructor
    public CalendarMark(String title, String description, Set<String> tags) {
        this(null, title, description, tags);
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

package com.cinnamon.cabinet.domain.planner.task;

import com.cinnamon.cabinet.domain.planner.CalendarMark;

import java.time.LocalDate;

public class GenericTask extends CalendarMark {

    private LocalDate dueDate;

    public GenericTask() {
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "GenericTask{" +
                "dueDate=" + dueDate +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", tags=" + tags +
                '}';
    }
}

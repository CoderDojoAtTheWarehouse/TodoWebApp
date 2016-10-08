package com.coderdojowarehouse.todo;

import java.time.LocalDate;

public class TodoItem {

    private String description;

    private LocalDate completedDate;

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public LocalDate getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(final LocalDate completedDate) {
        this.completedDate = completedDate;
    }
}

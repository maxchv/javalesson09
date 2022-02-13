package org.itstep.controller.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Data
public class Task {
    private String id;
    private String title;
    private LocalDate deadline;

    public Task() {
        this.id = UUID.randomUUID().toString();
    }

    public Task(String title, LocalDate deadline) {
        this();
        this.title = title;
        this.deadline = deadline;
    }

}

package org.launchcode.codingevents.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Created by Chris Bay
 */
public class Event {

    private int id;
    private static int nextId = 1;

    @Size(min=3)
    private String name;

    @Size(max=256)
    private String description;

    @NotBlank
    @Email
    private String contactEmail;

    public Event(String name, String description, String contactEmail) {
        this();
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
    }

    private Event() {
        this.id = nextId;
        nextId++;
    }

    public int getId() {
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

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
}

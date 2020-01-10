package org.launchcode.codingevents.models;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Chris Bay
 */
@Entity
public class Event extends AbstractEntity {

    @Size(min=3, message="Name must be at least 3 characters long")
    private String name;

    @Size(max=256, message="Description is too long. Please limit to 256 characters")
    private String description;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    @ManyToOne
    @NotNull(message = "Category is required")
    private EventCategory category;

    public Event(String name, String description, String contactEmail,
                 EventCategory category) {
        this();
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.category = category;
    }

    public Event() {}

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

    public EventCategory getCategory() {
        return category;
    }

    public void setCategory(EventCategory category) {
        this.category = category;
    }

}

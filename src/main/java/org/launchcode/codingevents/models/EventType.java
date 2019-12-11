package org.launchcode.codingevents.models;

/**
 * Created by Chris Bay
 */
public enum EventType {

    CONFERENCE("conference"),
    MEETUP("meetup");

    private final String name;

    EventType(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}

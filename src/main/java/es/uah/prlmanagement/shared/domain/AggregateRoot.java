package es.uah.prlmanagement.shared.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class AggregateRoot {

    private List<DomainEvent> events = new ArrayList<>();

    public List<DomainEvent> pullEvents() {
        List<DomainEvent> events = this.events;
        this.events = Collections.emptyList();
        return events;
    }

    protected void registerEvent(final DomainEvent event) {
        this.events.add(event);
    }
}

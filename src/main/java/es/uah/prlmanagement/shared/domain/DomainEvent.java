package es.uah.prlmanagement.shared.domain;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class DomainEvent {

    private String aggregateId;

    private String eventId;

    private String occurredOn;

    public DomainEvent(String aggregateId) {
        this.aggregateId = aggregateId;
        this.eventId     = UUID.randomUUID().toString();
        this.occurredOn  = LocalDateTime.now().toString();
    }

    public abstract String eventName();

    public String aggregateId() {
        return aggregateId;
    }

    public String eventId() {
        return eventId;
    }

    public String occurredOn() {
        return occurredOn;
    }
}

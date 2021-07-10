package es.uah.prlmanagement.shared.domain;

import java.util.List;

public interface EventPublisher {

    void execute(final List<DomainEvent> events);
}

package es.uah.prlmanagement.shared.domain;

import java.util.List;

public interface EventPublisher {

    void execute(List<DomainEvent> events);
}

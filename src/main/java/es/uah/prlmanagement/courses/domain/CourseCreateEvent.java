package es.uah.prlmanagement.courses.domain;

import es.uah.prlmanagement.shared.domain.DomainEvent;

import java.util.Objects;

public class CourseCreateEvent extends DomainEvent {

    private final String name;

    private final String category;

    public CourseCreateEvent(final String aggregateId, final String name, final String category) {
        super(aggregateId);
        this.name = name;
        this.category = category;
    }

    @Override
    public String eventName() {
        return "course.created";
    }

    public String name() {
        return name;
    }

    public String category() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CourseCreateEvent that = (CourseCreateEvent) o;
        return name.equals(that.name) &&
            category.equals(that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category);
    }
}

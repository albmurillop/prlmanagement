package es.uah.prlmanagement.courses.domain;

import es.uah.prlmanagement.shared.domain.DomainEvent;

import java.util.Objects;

public class CourseCreateEvent extends DomainEvent {

    private String name;

    private String category;

    public CourseCreateEvent(String aggregateId, String name, String category) {
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

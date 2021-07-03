package es.uah.prlmanagement.courses.domain;

import es.uah.prlmanagement.shared.domain.AggregateRoot;
import es.uah.prlmanagement.shared.domain.Identifier;

import java.util.Objects;

public class Course extends AggregateRoot {

    private Identifier id;

    private CourseName name;

    private CourseCategory category;

    private Course(Identifier id, CourseName name, CourseCategory category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public static Course create(Identifier id, CourseName name, CourseCategory category) {
        Course course = new Course(id, name, category);
        course.registerEvent(new CourseCreateEvent(id.value(), name.value(), category.value()));
        return course;
    }

    public Identifier id() {
        return id;
    }

    public CourseName name() {
        return name;
    }

    public CourseCategory category() {
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
        Course course = (Course) o;
        return id.equals(course.id) &&
            name.equals(course.name) &&
            category.equals(course.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, category);
    }
}

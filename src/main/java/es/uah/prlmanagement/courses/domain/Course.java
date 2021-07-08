package es.uah.prlmanagement.courses.domain;

import es.uah.prlmanagement.shared.domain.AggregateRoot;
import es.uah.prlmanagement.shared.domain.Identifier;
import es.uah.prlmanagement.trainings.domain.Training;

import java.util.List;
import java.util.Objects;

public class Course extends AggregateRoot {

    private Identifier id;

    private CourseName name;

    private CourseCategory category;

    private List<Training> trainings;

    private Course(Identifier id, CourseName name, CourseCategory category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public Course(Identifier id, CourseName name, CourseCategory category, List<Training> trainings) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.trainings = trainings;
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

    public List<Training> trainings() {
        return trainings;
    }

    public Integer duration() {
        return trainings.stream().mapToInt(training -> training.duration().value()).sum();
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

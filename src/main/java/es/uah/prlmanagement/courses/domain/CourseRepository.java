package es.uah.prlmanagement.courses.domain;

import es.uah.prlmanagement.shared.domain.Identifier;

import java.util.List;
import java.util.Optional;

public interface CourseRepository {

    List<Course> findAll();

    Optional<Course> findOne(Identifier id);

    void save(Course course);
}

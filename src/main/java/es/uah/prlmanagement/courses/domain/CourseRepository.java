package es.uah.prlmanagement.courses.domain;

import es.uah.prlmanagement.shared.domain.Identifier;

import java.util.List;
import java.util.Optional;

public interface CourseRepository {

    List<Course> findAll();

    Optional<Course> findOne(final Identifier id);

    void save(final Course course);
}

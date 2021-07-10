package es.uah.prlmanagement.students.domain;

import es.uah.prlmanagement.shared.domain.Identifier;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {

    List<Student> findAll();

    Optional<Student> findOne(final Identifier id);

    void save(final Student student);
}

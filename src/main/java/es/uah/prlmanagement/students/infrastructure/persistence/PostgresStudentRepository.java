package es.uah.prlmanagement.students.infrastructure.persistence;

import es.uah.prlmanagement.shared.domain.Identifier;
import es.uah.prlmanagement.students.domain.Student;
import es.uah.prlmanagement.students.domain.StudentRepository;
import es.uah.prlmanagement.students.infrastructure.mapper.StudentMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PostgresStudentRepository implements StudentRepository {

    private final StudentJpaRepository jpaRepository;

    private final StudentMapper mapper;

    public PostgresStudentRepository(final StudentJpaRepository jpaRepository, final StudentMapper mapper) {
        this.jpaRepository = jpaRepository;
        this.mapper = mapper;
    }

    @Override
    public List<Student> findAll() {
        return mapper.toDomainList(jpaRepository.findAll());
    }

    @Override
    public Optional<Student> findOne(final Identifier id) {
        return jpaRepository.findById(id.value()).map(mapper::toDomain);
    }

    @Override
    public void save(final Student student) {
        jpaRepository.save(mapper.toEntity(student));
    }
}

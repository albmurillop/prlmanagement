package es.uah.prlmanagement.students.infrastructure.persistence;

import es.uah.prlmanagement.shared.domain.Identifier;
import es.uah.prlmanagement.students.domain.Student;
import es.uah.prlmanagement.students.domain.StudentRepository;
import es.uah.prlmanagement.students.infrastructure.mapper.StudentMapper;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MongoStudentRepository implements StudentRepository {

    private final MongoTemplate mongoTemplate;

    private final StudentMapper mapper;

    public MongoStudentRepository(MongoTemplate mongoTemplate, StudentMapper mapper) {
        this.mongoTemplate = mongoTemplate;
        this.mapper = mapper;
    }

    @Override
    public List<Student> findAll() {
        return mapper.toDomainList(mongoTemplate.findAll(StudentDocument.class, StudentDocument.COLLECTION_NAME));
    }

    @Override
    public Optional<Student> findOne(Identifier id) {
        final Query query = Query.query(Criteria.where(StudentDocument.ID).is(id.value()));
        mongoTemplate.findOne(query, StudentDocument.class, StudentDocument.COLLECTION_NAME);
        return Optional.empty();
    }

    @Override
    public void save(Student student) {
        mongoTemplate.save(mapper.toDocument(student));
    }
}

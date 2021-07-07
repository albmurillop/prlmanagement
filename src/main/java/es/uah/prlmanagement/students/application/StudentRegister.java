package es.uah.prlmanagement.students.application;

import es.uah.prlmanagement.shared.domain.EventPublisher;
import es.uah.prlmanagement.shared.domain.Service;
import es.uah.prlmanagement.students.domain.Student;
import es.uah.prlmanagement.students.domain.StudentRepository;

@Service
public class StudentRegister {

    private final StudentRepository repository;

    private final EventPublisher eventPublisher;

    public StudentRegister(StudentRepository repository, EventPublisher eventPublisher) {
        this.repository = repository;
        this.eventPublisher = eventPublisher;
    }

    public void execute(Student student) {
        repository.save(student);
        eventPublisher.execute(student.pullEvents());
    }
}

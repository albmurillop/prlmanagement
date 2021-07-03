package es.uah.prlmanagement.students.application;

import es.uah.prlmanagement.shared.domain.Service;
import es.uah.prlmanagement.students.domain.Student;
import es.uah.prlmanagement.students.domain.StudentRepository;

@Service
public class StudentRegister {

    private final StudentRepository repository;

    public StudentRegister(StudentRepository repository) {
        this.repository = repository;
    }

    public void execute(Student student) {
        repository.save(student);

        // TODO: Event publish
    }
}

package es.uah.prlmanagement.students.application.register;

import es.uah.prlmanagement.shared.domain.EmployeeId;
import es.uah.prlmanagement.shared.domain.EventPublisher;
import es.uah.prlmanagement.shared.domain.Identifier;
import es.uah.prlmanagement.shared.domain.Service;
import es.uah.prlmanagement.students.domain.Student;
import es.uah.prlmanagement.students.domain.StudentActive;
import es.uah.prlmanagement.students.domain.StudentDepartment;
import es.uah.prlmanagement.students.domain.StudentEmail;
import es.uah.prlmanagement.students.domain.StudentFullname;
import es.uah.prlmanagement.students.domain.StudentIncorporatedDate;
import es.uah.prlmanagement.students.domain.StudentLocation;
import es.uah.prlmanagement.students.domain.StudentPosition;
import es.uah.prlmanagement.students.domain.StudentRepository;

@Service
public class StudentRegister {

    private final StudentRepository repository;

    private final EventPublisher eventPublisher;

    public StudentRegister(StudentRepository repository, EventPublisher eventPublisher) {
        this.repository = repository;
        this.eventPublisher = eventPublisher;
    }

    public void execute(StudentRegisterCommand studentRegisterCommand) {
        Student student = Student.register(
            new Identifier(studentRegisterCommand.id()),
            new StudentFullname(studentRegisterCommand.fullname()),
            new EmployeeId(studentRegisterCommand.employeeId()),
            new StudentEmail(studentRegisterCommand.email()),
            new StudentActive(studentRegisterCommand.active()),
            new StudentIncorporatedDate(studentRegisterCommand.incorporatedDate()),
            new StudentDepartment(studentRegisterCommand.department()),
            new StudentPosition(studentRegisterCommand.position()),
            new StudentLocation(studentRegisterCommand.location())
        );

        repository.save(student);
        eventPublisher.execute(student.pullEvents());
    }
}

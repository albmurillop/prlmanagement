package es.uah.prlmanagement.students.infrastructure.mapper;

import es.uah.prlmanagement.shared.domain.EmployeeId;
import es.uah.prlmanagement.shared.domain.Identifier;
import es.uah.prlmanagement.students.domain.Student;
import es.uah.prlmanagement.students.domain.StudentActive;
import es.uah.prlmanagement.students.domain.StudentDepartment;
import es.uah.prlmanagement.students.domain.StudentEmail;
import es.uah.prlmanagement.students.domain.StudentFullname;
import es.uah.prlmanagement.students.domain.StudentIncorporatedDate;
import es.uah.prlmanagement.students.domain.StudentLocation;
import es.uah.prlmanagement.students.domain.StudentPosition;
import es.uah.prlmanagement.students.infrastructure.StudentDTO;
import es.uah.prlmanagement.students.infrastructure.persistence.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentMapper {

    public Student toDomain(StudentEntity student) {
        return new Student(
            new Identifier(student.getId()),
            new StudentFullname(student.getFullname()),
            new EmployeeId(student.getEmployeeId()),
            new StudentEmail(student.getEmail()),
            new StudentActive(student.isActive()),
            new StudentIncorporatedDate(student.getIncorporatedDate()),
            new StudentDepartment(student.getDepartment()),
            new StudentPosition(student.getPosition()),
            new StudentLocation(student.getLocation())
        );
    }

    public Student toDomain(StudentDTO student) {
        return new Student(
            new Identifier(student.id()),
            new StudentFullname(student.fullname()),
            new EmployeeId(student.employeeId()),
            new StudentEmail(student.email()),
            new StudentActive(student.active()),
            new StudentIncorporatedDate(student.incorporatedDate()),
            new StudentDepartment(student.department()),
            new StudentPosition(student.position()),
            new StudentLocation(student.location())
        );
    }

    public List<Student> toDomainList(List<StudentEntity> students) {
        return students.stream().map(this::toDomain).collect(Collectors.toList());
    }

    public StudentEntity toEntity(Student student) {
        return new StudentEntity(
            student.id().value(),
            student.fullname().value(),
            student.employeeId().value(),
            student.email().value(),
            student.active().value(),
            student.incorporatedDate().value(),
            student.department().value(),
            student.position().value(),
            student.position().value()
        );
    }
}

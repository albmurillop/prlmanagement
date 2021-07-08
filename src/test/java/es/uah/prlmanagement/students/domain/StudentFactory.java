package es.uah.prlmanagement.students.domain;

import es.uah.prlmanagement.shared.domain.EmployeeId;
import es.uah.prlmanagement.shared.domain.Identifier;

import java.time.LocalDateTime;
import java.util.UUID;

public class StudentFactory {

    public static Student example() {
        return new Student(
            new Identifier(UUID.randomUUID().toString()),
            new StudentFullname("Alberto Murillo"),
            new EmployeeId(UUID.randomUUID().toString()),
            new StudentEmail("alberto.murillo@uah.es"),
            new StudentActive(Boolean.TRUE),
            new StudentIncorporatedDate(LocalDateTime.now()),
            new StudentDepartment("COMP"),
            new StudentPosition("Engineer"),
            new StudentLocation("Madrid")
        );
    }
}

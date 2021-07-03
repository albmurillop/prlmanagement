package es.uah.prlmanagement.students.domain;

import es.uah.prlmanagement.shared.domain.DomainException;

public class StudentDepartmentInvalid extends DomainException {

    public StudentDepartmentInvalid(String department) {
        super(String.format("The department is invalid: %s", department));
    }
}

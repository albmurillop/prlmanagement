package es.uah.prlmanagement.students.domain;

import es.uah.prlmanagement.shared.domain.DomainException;

public class StudentEmailInvalid extends DomainException {

    public StudentEmailInvalid(String department) {
        super(String.format("The email is invalid: %s", department));
    }
}

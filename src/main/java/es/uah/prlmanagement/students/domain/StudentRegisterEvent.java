package es.uah.prlmanagement.students.domain;

import es.uah.prlmanagement.shared.domain.DomainEvent;

import java.util.Objects;

public class StudentRegisterEvent extends DomainEvent {

    private String fullname;

    private String employeeId;

    private String email;

    public StudentRegisterEvent(String aggregateId, String fullname, String employeeId, String email) {
        super(aggregateId);
        this.fullname = fullname;
        this.employeeId = employeeId;
        this.email = email;
    }

    @Override
    public String eventName() {
        return "student.registered";
    }

    public String fullname() {
        return fullname;
    }

    public String employeeId() {
        return employeeId;
    }

    public String email() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StudentRegisterEvent that = (StudentRegisterEvent) o;
        return fullname.equals(that.fullname) &&
            employeeId.equals(that.employeeId) &&
            email.equals(that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullname, employeeId, email);
    }
}

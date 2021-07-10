package es.uah.prlmanagement.students.domain;

import es.uah.prlmanagement.shared.domain.AggregateRoot;
import es.uah.prlmanagement.shared.domain.EmployeeId;
import es.uah.prlmanagement.shared.domain.Identifier;

public class Student extends AggregateRoot {

    private final Identifier id;

    private final StudentFullname fullname;

    private final EmployeeId employeeId;

    private final StudentEmail email;

    private final StudentActive active;

    private final StudentIncorporatedDate incorporatedDate;

    private final StudentDepartment department;

    private final StudentPosition position;

    private final StudentLocation location;

    public Student(Identifier id, StudentFullname fullname, EmployeeId employeeId, StudentEmail email,
                   StudentActive active, StudentIncorporatedDate incorporatedDate, StudentDepartment department,
                   StudentPosition position, StudentLocation location) {
        this.id = id;
        this.fullname = fullname;
        this.employeeId = employeeId;
        this.email = email;
        this.active = active;
        this.incorporatedDate = incorporatedDate;
        this.department = department;
        this.position = position;
        this.location = location;
    }

    public static Student register(Identifier id, StudentFullname fullname, EmployeeId employeeId, StudentEmail email,
                                   StudentActive active, StudentIncorporatedDate incorporatedDate,
                                   StudentDepartment department, StudentPosition position, StudentLocation location) {
        Student student = new Student(id, fullname, employeeId, email, active, incorporatedDate, department, position,
            location);
        student.registerEvent(new StudentRegistered(id.value(), fullname.value(), employeeId.value(),
            email.value()));
        return student;
    }

    public Identifier id() {
        return id;
    }

    public StudentFullname fullname() {
        return fullname;
    }

    public EmployeeId employeeId() {
        return employeeId;
    }

    public StudentEmail email() {
        return email;
    }

    public StudentActive active() {
        return active;
    }

    public StudentIncorporatedDate incorporatedDate() {
        return incorporatedDate;
    }

    public StudentDepartment department() {
        return department;
    }

    public StudentPosition position() {
        return position;
    }

    public StudentLocation location() {
        return location;
    }
}

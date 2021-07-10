package es.uah.prlmanagement.students.application.register;

import java.time.LocalDateTime;

public class StudentRegisterCommand {

    private final String id;

    private final String fullname;

    private final String employeeId;

    private final String email;

    private final Boolean active;

    private final LocalDateTime incorporatedDate;

    private final String department;

    private final String position;

    private final String location;

    public StudentRegisterCommand(final String id, final String fullname, final String employeeId, final String email,
                                  final Boolean active, final LocalDateTime incorporatedDate, final String department,
                                  final String position, final String location) {
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

    public String id() {
        return id;
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

    public Boolean active() {
        return active;
    }

    public LocalDateTime incorporatedDate() {
        return incorporatedDate;
    }

    public String department() {
        return department;
    }

    public String position() {
        return position;
    }

    public String location() {
        return location;
    }
}

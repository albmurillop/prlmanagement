package es.uah.prlmanagement.students.application.register;

import java.time.LocalDateTime;

public class StudentRegisterCommand {

    private String id;

    private String fullname;

    private String employeeId;

    private String email;

    private Boolean active;

    private LocalDateTime incorporatedDate;

    private String department;

    private String position;

    private String location;

    public StudentRegisterCommand(String id, String fullname, String employeeId, String email, Boolean active,
                                  LocalDateTime incorporatedDate, String department, String position, String location) {
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

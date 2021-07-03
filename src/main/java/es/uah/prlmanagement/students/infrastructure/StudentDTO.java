package es.uah.prlmanagement.students.infrastructure;

import java.time.LocalDateTime;

public class StudentDTO {

    private String id;

    private String fullname;

    private String employeeId;

    private String email;

    private Boolean active;

    private LocalDateTime incorporatedDate;

    private String department;

    private String position;

    private String location;

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

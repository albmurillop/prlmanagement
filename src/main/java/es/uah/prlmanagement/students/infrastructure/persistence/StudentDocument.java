package es.uah.prlmanagement.students.infrastructure.persistence;

import java.time.LocalDateTime;

public class StudentDocument {

    public static final String ID = "id";
    public static final String COLLECTION_NAME = "students";

    private String id;

    private String fullname;

    private String employeeId;

    private String email;

    private boolean active;

    private LocalDateTime incorporatedDate;

    private String department;

    private String position;

    private String location;

    public StudentDocument(String id, String fullname, String employeeId, String email, boolean active,
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

    public String getId() {
        return id;
    }

    public StudentDocument setId(String id) {
        this.id = id;
        return this;
    }

    public String getFullname() {
        return fullname;
    }

    public StudentDocument setFullname(String fullname) {
        this.fullname = fullname;
        return this;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public StudentDocument setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public StudentDocument setEmail(String email) {
        this.email = email;
        return this;
    }

    public boolean isActive() {
        return active;
    }

    public StudentDocument setActive(boolean active) {
        this.active = active;
        return this;
    }

    public LocalDateTime getIncorporatedDate() {
        return incorporatedDate;
    }

    public StudentDocument setIncorporatedDate(LocalDateTime incorporatedDate) {
        this.incorporatedDate = incorporatedDate;
        return this;
    }

    public String getDepartment() {
        return department;
    }

    public StudentDocument setDepartment(String department) {
        this.department = department;
        return this;
    }

    public String getPosition() {
        return position;
    }

    public StudentDocument setPosition(String position) {
        this.position = position;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public StudentDocument setLocation(String location) {
        this.location = location;
        return this;
    }
}

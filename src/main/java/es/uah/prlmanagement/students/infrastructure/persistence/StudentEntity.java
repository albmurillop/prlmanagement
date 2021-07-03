package es.uah.prlmanagement.students.infrastructure.persistence;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "students")
public class StudentEntity {

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "fullname", nullable = false)
    private String fullname;

    @Column(name = "employeeId", nullable = false)
    private String employeeId;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "active", nullable = false)
    private boolean active;

    @Column(name = "incorporatedDate", nullable = false)
    private LocalDateTime incorporatedDate;

    @Column(name = "department", nullable = false)
    private String department;

    @Column(name = "position", nullable = false)
    private String position;

    @Column(name = "location", nullable = false)
    private String location;

    public StudentEntity(String id, String fullname, String employeeId, String email, boolean active,
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

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LocalDateTime getIncorporatedDate() {
        return incorporatedDate;
    }

    public void setIncorporatedDate(LocalDateTime incorporatedDate) {
        this.incorporatedDate = incorporatedDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

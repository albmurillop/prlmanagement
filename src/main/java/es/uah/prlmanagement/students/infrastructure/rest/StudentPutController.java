package es.uah.prlmanagement.students.infrastructure.rest;

import es.uah.prlmanagement.students.application.StudentRegister;
import es.uah.prlmanagement.students.infrastructure.StudentDTO;
import es.uah.prlmanagement.students.infrastructure.mapper.StudentMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentPutController {

    private final StudentRegister register;

    private final StudentMapper mapper;

    public StudentPutController(StudentRegister register, StudentMapper mapper) {
        this.register = register;
        this.mapper = mapper;
    }

    @PutMapping("")
    public ResponseEntity<?> execute(@RequestBody StudentDTO student) {
        register.execute(mapper.toDomain(student));
        return ResponseEntity.ok().build();
    }
}
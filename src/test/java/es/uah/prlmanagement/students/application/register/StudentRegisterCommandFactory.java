package es.uah.prlmanagement.students.application.register;

import es.uah.prlmanagement.students.application.register.StudentRegisterCommand;

import java.time.LocalDateTime;
import java.util.UUID;

public class StudentRegisterCommandFactory {

    public static StudentRegisterCommand example() {
        return new StudentRegisterCommand(UUID.randomUUID().toString(), "Alberto Murillo",
            UUID.randomUUID().toString(), "alberto.murillo@uah.es", Boolean.TRUE, LocalDateTime.now(),
            "COMP", "Engineer", "Madrid");
    }
}

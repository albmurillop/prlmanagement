package es.uah.prlmanagement.students.domain;

import es.uah.prlmanagement.shared.domain.DateTimeVO;

import java.time.LocalDateTime;

public class StudentIncorporatedDate extends DateTimeVO {

    public StudentIncorporatedDate(LocalDateTime value) {
        super(value);
    }
}

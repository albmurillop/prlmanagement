package es.uah.prlmanagement.students.domain;

import es.uah.prlmanagement.shared.domain.StringVO;

public class StudentDepartment extends StringVO {

    public static final int MINIMUM_LENGTH = 4;

    public StudentDepartment(String value) {
        super(value);
        ensureValidDepartment(value);
    }

    private void ensureValidDepartment(String value) {
        if (value.length() != MINIMUM_LENGTH) {
            throw new StudentDepartmentInvalid(value);
        }
    }
}

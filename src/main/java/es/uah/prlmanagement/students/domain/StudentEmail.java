package es.uah.prlmanagement.students.domain;

import es.uah.prlmanagement.shared.domain.StringVO;

import java.util.regex.Pattern;

public class StudentEmail extends StringVO {

    public static final String PATTERN = "^(.+)@uah.es";

    public StudentEmail(String value) {
        super(value);
        ensureEmailValid(value);
    }

    private void ensureEmailValid(String value) {
        if (!Pattern.compile(PATTERN).matcher(value).matches()) {
            throw new StudentEmailInvalid(value);
        }
    }
}

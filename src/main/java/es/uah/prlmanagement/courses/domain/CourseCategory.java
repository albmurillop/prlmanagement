package es.uah.prlmanagement.courses.domain;

import es.uah.prlmanagement.shared.domain.StringVO;

public class CourseCategory extends StringVO {

    public CourseCategory(String value) {
        super(value);
        ensureValidCategory(value);
    }

    private void ensureValidCategory(String value) {
        try {
            CourseCategoryType.valueOf(value);
        } catch (IllegalArgumentException exception) {
            throw new CourseCategoryNotExist(value);
        }
    }
}

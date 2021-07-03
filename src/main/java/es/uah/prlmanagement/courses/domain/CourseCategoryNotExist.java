package es.uah.prlmanagement.courses.domain;

import es.uah.prlmanagement.shared.domain.DomainException;

public class CourseCategoryNotExist extends DomainException {

    public CourseCategoryNotExist(String category) {
        super(String.format("The course category does not exist: %s", category));
    }
}

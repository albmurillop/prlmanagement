package es.uah.prlmanagement.trainings.domain;

import es.uah.prlmanagement.shared.domain.DomainException;

public class TrainingDurationInvalid extends DomainException {

    public TrainingDurationInvalid(Integer duration) {
        super(String.format("The training duration is invalid: %d", duration));
    }
}

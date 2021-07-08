package es.uah.prlmanagement.trainings.domain;

import es.uah.prlmanagement.shared.domain.IntegerVO;

public class TrainingDuration extends IntegerVO {

    private static final Integer DURATION_MIN = 1;
    private static final Integer DURATION_MAX = 120;

    public TrainingDuration(Integer value) {
        super(value);
        ensureValidDuration(value);
    }

    private void ensureValidDuration(Integer value) {
        if (value < DURATION_MIN || value > DURATION_MAX) {
            throw new TrainingDurationInvalid(value);
        }
    }
}

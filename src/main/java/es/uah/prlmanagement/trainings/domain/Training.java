package es.uah.prlmanagement.trainings.domain;

import es.uah.prlmanagement.shared.domain.AggregateRoot;
import es.uah.prlmanagement.shared.domain.Identifier;

import java.util.Objects;

public class Training extends AggregateRoot {

    private Identifier id;

    private TrainingName name;

    private TrainingDuration duration;

    public Training(Identifier id, TrainingName name, TrainingDuration duration) {
        this.id = id;
        this.name = name;
        this.duration = duration;
    }

    public static Training create(Identifier id, TrainingName name, TrainingDuration duration) {
        return new Training(id, name, duration);
    }

    public Identifier id() {
        return id;
    }

    public TrainingName name() {
        return name;
    }

    public TrainingDuration duration() {
        return duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Training training = (Training) o;
        return id.equals(training.id) &&
            name.equals(training.name) &&
            duration.equals(training.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, duration);
    }
}

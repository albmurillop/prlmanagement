package es.uah.prlmanagement.courses.domain;

import es.uah.prlmanagement.shared.domain.Identifier;
import es.uah.prlmanagement.trainings.domain.Training;
import es.uah.prlmanagement.trainings.domain.TrainingDuration;
import es.uah.prlmanagement.trainings.domain.TrainingName;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class CourseFactory {

    public static Course example() {
        return new Course(
            new Identifier(UUID.randomUUID().toString()),
            new CourseName("Course name"),
            new CourseCategory(CourseCategoryType.GENERAL.name()),
            trainings()
        );
    }

    private static List<Training> trainings() {
        return Arrays.asList(
            new Training(
                new Identifier(UUID.randomUUID().toString()),
                new TrainingName("Training name"),
                new TrainingDuration(15)
            ),
            new Training(
                new Identifier(UUID.randomUUID().toString()),
                new TrainingName("Training alternative name"),
                new TrainingDuration(30)
            )
        );
    }

}

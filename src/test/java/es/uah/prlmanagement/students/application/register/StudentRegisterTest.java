package es.uah.prlmanagement.students.application.register;

import es.uah.prlmanagement.shared.domain.EventPublisher;
import es.uah.prlmanagement.students.domain.StudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class StudentRegisterTest {

    private StudentRegister studentRegister;

    @Mock
    private StudentRepository repository;

    @Mock
    private EventPublisher eventPublisher;

    @BeforeEach
    void setUp() {
        this.studentRegister = new StudentRegister(this.repository, this.eventPublisher);
    }

    @Test
    void shouldRegisterAStudent() {
        this.studentRegister.execute(StudentRegisterCommandFactory.example());

        verify(this.repository, times(1)).save(any());
        verify(this.eventPublisher, times(1)).execute(any());
    }
}

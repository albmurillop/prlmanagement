package es.uah.prlmanagement;

import es.uah.prlmanagement.shared.domain.Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(
    includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Service.class),
    value = "es.uah"
)
public class PrlmanagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrlmanagementApplication.class, args);
    }

}

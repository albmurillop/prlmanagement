package es.uah.prlmanagement.shared.infrastructure.message;

import es.uah.prlmanagement.shared.domain.DomainEvent;
import es.uah.prlmanagement.shared.domain.EventPublisher;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RabbitEventPublisher implements EventPublisher {

    @Value("${uah.rabbitmq.exchange}")
    private String exchange;

    @Value("${uah.rabbitmq.routingkey}")
    private String routingkey;

    private final AmqpTemplate rabbitTemplate;

    public RabbitEventPublisher(AmqpTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void execute(List<DomainEvent> events) {
        events.forEach(event -> rabbitTemplate.convertAndSend(exchange, routingkey, events));
    }
}

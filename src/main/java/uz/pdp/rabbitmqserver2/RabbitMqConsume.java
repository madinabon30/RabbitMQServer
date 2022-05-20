package uz.pdp.rabbitmqserver2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.annotation.RabbitListeners;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import uz.pdp.rabbitmqserver2.model.Order;

@Component
public class RabbitMqConsume {

    @RabbitListener(queues = "rabbitMq.topic.queue.name")
    public void consumeMessage(
            @RequestBody Order order
    ){

        try {
            System.out.println(new ObjectMapper().writeValueAsString(order));
            return;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println("no message qqqqq");

    }

}

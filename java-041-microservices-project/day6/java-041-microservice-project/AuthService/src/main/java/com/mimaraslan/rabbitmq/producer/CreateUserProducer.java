package com.mimaraslan.rabbitmq.producer;

import com.mimaraslan.rabbitmq.model.AuthSaveModel;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateUserProducer {

    private final RabbitTemplate rabbitTemplate;

    public void save (AuthSaveModel model){
        rabbitTemplate.convertAndSend("direct-exchange-auth",
                "binding-auth-save", model);
    }

}

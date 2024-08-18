package com.mimaraslan.rabbitmq.producer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mimaraslan.rabbitmq.model.AuthSaveModel;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;


@Component
@RequiredArgsConstructor
public class CreateUserProducer {
/*
    private final RabbitTemplate rabbitTemplate;

    public void save (AuthSaveModel model){
        rabbitTemplate.convertAndSend("direct-exchange-auth",
                "binding-auth-save", model);
    }
*/

    private final RabbitTemplate rabbitTemplate;
    private final ObjectMapper objectMapper;

    public void save(AuthSaveModel authSaveModel) {
        try {

            byte[] jsonBytes = objectMapper.writeValueAsBytes(authSaveModel);
            MessageProperties messageProperties = new MessageProperties();
            messageProperties.setContentType(MessageProperties.CONTENT_TYPE_JSON);
            Message message = new Message(jsonBytes, messageProperties);

            rabbitTemplate.send("direct-exchange-auth", "binding-auth-save", message);
        } catch (Exception e) {
            throw new RuntimeException("Message conversion to JSON failed", e);
        }
    }


}

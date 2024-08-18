package com.mimaraslan.rabbitmq.producer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mimaraslan.rabbitmq.model.AuthSaveModel;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateUserProducer {

    private final RabbitTemplate rabbitTemplate;
    private final ObjectMapper objectMapper;

    public void save (AuthSaveModel model){

        try {

            byte[] infoBytes =  objectMapper.writeValueAsBytes(model);
            MessageProperties messageProperties = new MessageProperties();
            //messageProperties.setContentType("application/json");
            messageProperties.setContentType(MessageProperties.CONTENT_TYPE_JSON);
            Message message = new Message(infoBytes, messageProperties);

            rabbitTemplate.convertAndSend("direct-exchange-auth",
                    "binding-auth-save", model);

        } catch (Exception e){
            throw new RuntimeException("Message conversion failed", e);
        }

    }

}
package com.mimaraslan.rabbitmq.consumer;

import com.mimaraslan.rabbitmq.model.AuthSaveModel;
import com.mimaraslan.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateUserConsumer {

    private final UserProfileService userProfileService;

    @RabbitListener(queues = "queue-auth")
    public void createUserFromQueue(AuthSaveModel model) {

        System.out.println("AuthSaveModel from Rabbit MQ : "
                            + model.getUsername());

       userProfileService.save(model);
    }

}
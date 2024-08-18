package com.mimaraslan.rabbitmq.consumer;

import com.mimaraslan.dto.request.UserProfileSaveRequestDto;
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

   //     System.out.println("AuthSaveModel ===========> "+model.getUsername());

   //     userProfileService.saveRabbit(model);

        System.out.println("AuthSaveModel From Rabbit MQ: " + model);
        userProfileService.save(
                UserProfileSaveRequestDto.builder()
                        .email(model.getEmail())
                        .username(model.getUsername())
                        .authId(model.getAuthId())
                        .build() );

        /*
        UserProfile.builder()
                .authId(model.getAuthId())
                .username(model.getUsername())
                .email(model.getEmail())
                .build()
        */
    }

}

package com.mimaraslan.config;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    String directExchangeAuth = "direct-exchange-auth";
    String bindingAuthSave = "binding-auth-save";
    String queueAuth = "queue-auth";

    @Bean
    DirectExchange directExchange() {
        return new DirectExchange(directExchangeAuth);
    }

    @Bean
    Binding bindDirectExchangeQueueAuth  (final Queue queueAuth,
                                          final DirectExchange directExchangeAuth) {
        return BindingBuilder
                .bind(queueAuth)
                .to(directExchangeAuth)
                .with(bindingAuthSave);
    }

    @Bean
    Queue queueAuth() {
        return new Queue(queueAuth);
    }

    @Bean
    public MessageConverter messageConverter(){
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
        RabbitTemplate template = new RabbitTemplate(connectionFactory);
        template.setMessageConverter(messageConverter());
        return template;
    }

}

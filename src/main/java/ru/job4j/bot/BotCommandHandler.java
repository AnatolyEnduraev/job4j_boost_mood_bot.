package ru.job4j.bot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class BotCommandHandler {

    @PostConstruct
    public void init() {
    }

    @PreDestroy
    public void destroy() {
    }
}







package ru.job4j.bot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import ru.job4j.bmb.content.Content;

@Component
public class BotCommandHandler {

    @PostConstruct
    public void init() {
        System.out.println("[BotCommandHandler] Загружаем список команд");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("[BotCommandHandler] Очищаем кэш команд");
    }

    public void receive(Content content) {
    }
}







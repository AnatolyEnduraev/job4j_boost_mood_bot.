package ru.job4j.bot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class TelegramBotService {

    @PostConstruct
    public void init() {
        System.out.println("[TelegramBotService] Инициализируем бота");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("[TelegramBotService] Завершаем работу бота");
    }
}



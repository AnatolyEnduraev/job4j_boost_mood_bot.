package ru.job4j.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class ReminderService {

    @PostConstruct
    public void init() {
        System.out.println("[RemindService] Запускаем планировщик напоминаний");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("[RemindService] Останавливаем планировщик");
    }
}


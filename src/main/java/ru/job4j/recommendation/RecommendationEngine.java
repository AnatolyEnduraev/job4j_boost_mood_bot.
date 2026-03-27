package ru.job4j.recommendation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class RecommendationEngine {

    @PostConstruct
    public void init() {
        System.out.println("[RecommendationEngine] Загружаем модели рекомендаций");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("[RecommendationEngine] Освобождаем память модели");
    }
}


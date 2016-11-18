package com.spring.configuration;

import com.spring.knights.BraveKnight;
import com.spring.knights.Knight;
import com.spring.quests.Quest;
import com.spring.quests.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightQuestConfig {

    @Bean
    public Knight braveKnight() {
        return new BraveKnight(dragonQuest());
    }

    @Bean
    public Quest dragonQuest() {
        return new SlayDragonQuest(System.out);
    }
}
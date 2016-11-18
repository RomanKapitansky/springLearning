package com.spring.knights;

import com.spring.quests.Quest;

public class BraveKnight implements Knight{

    private Quest quest;

    public BraveKnight (Quest quest) {
        this.quest = quest;
    }

    public void embark() {
        quest.embark();
    }
}
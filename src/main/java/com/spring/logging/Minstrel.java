package com.spring.logging;

import java.io.PrintStream;

/**
 * Created by rkapitansky on 11/18/2016.
 */
public class Minstrel {
    private PrintStream printStream;

    public Minstrel(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void singBeforeQuest() {
        printStream.println("So the quest begins!");
    }

    public void singAfterQuest() {
        printStream.println("Tee hee hee, the brave knight did embark on a quest");
    }
}

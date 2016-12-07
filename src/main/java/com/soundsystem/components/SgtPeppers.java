package com.soundsystem.components;

import com.soundsystem.interfaces.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * Created by rkapitansky on 12/7/2016.
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println(".. " + title + " disc by " + artist + " is playing loud !! ");
    }
}
package com.cursor.musicplayer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.module.Configuration;

public class Main {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);

        musicPlayer.playClassicalMusic();
        System.out.println("\n");
        musicPlayer.playRockMusic();


    }
}
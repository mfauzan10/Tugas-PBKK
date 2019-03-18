package com.fauzan.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fauzan.model.Songs;
import com.fauzan.model.JazzSongs;

public class MainApp {

	public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Obj.xml");
		
		Songs songs = context.getBean("Songs1",Songs.class);
		JazzSongs jazzSong = (JazzSongs) songs;
		jazzSong.SongDetil();
		
		context.close();		
	}

}

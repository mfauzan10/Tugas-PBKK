package com.fauzan.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Songs1")
public class JazzSongs implements Songs {

	final String genre="Jazz";
	private String Singer;
	private String Author;
	
	private ReleasedYearSongs SoYear;
	
	@Autowired
	public JazzSongs(ReleasedYearSongs soYear) {
		SoYear=soYear;
	}
	
	public JazzSongs() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public JazzSongs(String singer, String author) {
		super();
		Singer = singer;
		Author = author;
	}
	
	


	@Override
	public String toString() {
		return "JazzSongs [genre=" + genre + ", Singer=" + Singer + ", Author=" + Author + "]";
	}



	public String getSinger() {
		return Singer;
	}



	public void setSinger(String singer) {
		Singer = singer;
	}



	public String getAuthor() {
		return Author;
	}



	public void setAuthor(String author) {
		Author = author;
	}


	
	public String getGenre() {
		return genre;
	}



	@Override
	public void SongDetil() {
		// TODO Auto-generated method stub
		System.out.println(this.toString());
	}

}
package com.fauzan.model;


public class RockSongs implements Songs {
	
	final String genre="Rock";
	private String Singer;
	private String Author;

	public RockSongs() {
		// TODO Auto-generated constructor stub
	}
	
	public RockSongs(String singer, String author) {
		super();
		Singer = singer;
		Author = author;
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
		
	}

}

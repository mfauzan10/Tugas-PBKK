package com.fauzan.model;

import org.springframework.stereotype.Component;

@Component
public class Songs1980 implements ReleasedYearSongs {

	final int YearRelease = 1980;
	
	public Songs1980() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Songs1980 [YearRelease=" + YearRelease + "]";
	}


	@Override
	public void ReleaseYear() {
		// TODO Auto-generated method stub
		System.out.println(this.toString());
	}

}

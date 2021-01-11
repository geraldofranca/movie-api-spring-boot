package com.mentor.news.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Movie implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String original_language;
	private String original_title;
	private String overview;
	private String poster_path;
	private Date release_date;
	private String title;
	private Number vote_average;
	private Number vote_count;
	private Number popularity;
	
	public Movie() {
		
	}

	public Movie(String id, String original_language, String original_title, String overview, String poster_path,
			Date release_date, String title, Number vote_average, Number vote_count, Number popularity) {
		super();
		this.id = id;
		this.original_language = original_language;
		this.original_title = original_title;
		this.overview = overview;
		this.poster_path = poster_path;
		this.release_date = release_date;
		this.title = title;
		this.vote_average = vote_average;
		this.vote_count = vote_count;
		this.popularity = popularity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOriginalLanguage() {
		return original_language;
	}

	public void setOriginalLanguage(String original_language) {
		this.original_language = original_language;
	}

	public String getOriginalTitle() {
		return original_title;
	}

	public void setOriginalTitle(String original_title) {
		this.original_title = original_title;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getPosterPath() {
		return poster_path;
	}

	public void setPosterPath(String poster_path) {
		this.poster_path = poster_path;
	}

	public Date getReleaseDate() {
		return release_date;
	}

	public void setReleaseDate(Date release_date) {
		this.release_date = release_date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Number getVoteAverage() {
		return vote_average;
	}

	public void setVoteAverage(Number vote_average) {
		this.vote_average = vote_average;
	}

	public Number getVoteCount() {
		return vote_count;
	}

	public void setVote_count(Number vote_count) {
		this.vote_count = vote_count;
	}

	public Number getPopularity() {
		return popularity;
	}

	public void setPopularity(Number popularity) {
		this.popularity = popularity;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}

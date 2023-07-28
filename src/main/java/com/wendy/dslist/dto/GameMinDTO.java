package com.wendy.dslist.dto;

import com.wendy.dslist.entities.Game;
import com.wendy.dslist.projection.GameMinProjection;

public class GameMinDTO {
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;

	public GameMinDTO() {

	}

	public GameMinDTO(Long id, String title, Integer year, String imgUrl, String shortDescription) {
		this.id = id;
		this.title = title;
		this.year = year;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
	}

	public GameMinDTO(Game game) {
		id = game.getId();
		title = game.getTitle();
		year = game.getYear();
		imgUrl = game.getImgUrl();
		shortDescription = game.getShortDescription();
	}

	public GameMinDTO(GameMinProjection gameMinProjection) {
		id = gameMinProjection.getId();
		title = gameMinProjection.getTitle();
		year = gameMinProjection.getGameYear();
		imgUrl = gameMinProjection.getImgUrl();
		shortDescription = gameMinProjection.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
}

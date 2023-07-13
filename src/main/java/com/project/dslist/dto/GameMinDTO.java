package com.project.dslist.dto;

import com.project.dslist.entities.Game;

public class GameMinDTO {

    private Long id;
    private String tittle;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO (){
    }

    public GameMinDTO(Game entity) {
        this.id = entity.getId();
        this.tittle = entity.getTitle();
        this.year = entity.getYear();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTittle() {
        return tittle;
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

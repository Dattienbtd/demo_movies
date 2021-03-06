package com.gotasoft.movies.data;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

import java.io.Serializable;

/**
 * Created by dattien on 9/17/17.
 */
@Entity(nameInDb = "Product")
public class Product implements Serializable {
    static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String name;
    private String userId;
    private String nameEng;
    private String language;
    private String genre;
    private String director;
    private String actors;
    private String plot;
    private String active;
    private String categoryId;
    private String img;
    private String created;
    private String modified;
    private String count;
    private String tubeId;
    private String description;
    private String imdbRating;
    private String poster;
    private String trailerId;
    private Boolean isAdd;
    @Generated(hash = 1360976772)
    public Product(String id, String name, String userId, String nameEng,
            String language, String genre, String director, String actors,
            String plot, String active, String categoryId, String img,
            String created, String modified, String count, String tubeId,
            String description, String imdbRating, String poster, String trailerId,
            Boolean isAdd) {
        this.id = id;
        this.name = name;
        this.userId = userId;
        this.nameEng = nameEng;
        this.language = language;
        this.genre = genre;
        this.director = director;
        this.actors = actors;
        this.plot = plot;
        this.active = active;
        this.categoryId = categoryId;
        this.img = img;
        this.created = created;
        this.modified = modified;
        this.count = count;
        this.tubeId = tubeId;
        this.description = description;
        this.imdbRating = imdbRating;
        this.poster = poster;
        this.trailerId = trailerId;
        this.isAdd = isAdd;
    }
    @Generated(hash = 1890278724)
    public Product() {
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUserId() {
        return this.userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getNameEng() {
        return this.nameEng;
    }
    public void setNameEng(String nameEng) {
        this.nameEng = nameEng;
    }
    public String getLanguage() {
        return this.language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getGenre() {
        return this.genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getDirector() {
        return this.director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getActors() {
        return this.actors;
    }
    public void setActors(String actors) {
        this.actors = actors;
    }
    public String getPlot() {
        return this.plot;
    }
    public void setPlot(String plot) {
        this.plot = plot;
    }
    public String getActive() {
        return this.active;
    }
    public void setActive(String active) {
        this.active = active;
    }
    public String getCategoryId() {
        return this.categoryId;
    }
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
    public String getImg() {
        return this.img;
    }
    public void setImg(String img) {
        this.img = img;
    }
    public String getCreated() {
        return this.created;
    }
    public void setCreated(String created) {
        this.created = created;
    }
    public String getModified() {
        return this.modified;
    }
    public void setModified(String modified) {
        this.modified = modified;
    }
    public String getCount() {
        return this.count;
    }
    public void setCount(String count) {
        this.count = count;
    }
    public String getTubeId() {
        return this.tubeId;
    }
    public void setTubeId(String tubeId) {
        this.tubeId = tubeId;
    }
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getImdbRating() {
        return this.imdbRating;
    }
    public void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }
    public String getPoster() {
        return this.poster;
    }
    public void setPoster(String poster) {
        this.poster = poster;
    }
    public String getTrailerId() {
        return this.trailerId;
    }
    public void setTrailerId(String trailerId) {
        this.trailerId = trailerId;
    }
    public Boolean getIsAdd() {
        return this.isAdd;
    }
    public void setIsAdd(Boolean isAdd) {
        this.isAdd = isAdd;
    }


    
}

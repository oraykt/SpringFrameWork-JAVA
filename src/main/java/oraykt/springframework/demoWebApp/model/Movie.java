package oraykt.springframework.demoWebApp.model;

import org.bson.types.ObjectId;

import java.util.Date;

public class Movie {

    private String title;
    private String category;
    private String country;
    private Integer year;
    private Date createAt;
    private ObjectId director_id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public ObjectId getDirector_id() {
        return director_id;
    }

    public void setDirector_id(ObjectId director_id) {
        this.director_id = director_id;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", country='" + country + '\'' +
                ", year=" + year +
                ", createAt=" + createAt +
                ", director_id=" + director_id +
                '}';
    }
}
package com.hand.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Film implements Serializable {
    private Short filmId;

    private String title;

    private Date releaseYear;

    private Byte languageId;

    private Byte originalLanguageId;

    private Byte rentalDuration;

    private BigDecimal rentalRate;

    private Short length;

    private BigDecimal replacementCost;

    private String rating;

    private String specialFeatures;

    private Date lastUpdate;

    private String description;

    private static final long serialVersionUID = 1L;

    public Short getFilmId() {
        return filmId;
    }

    public void setFilmId(Short filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Date releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Byte getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Byte languageId) {
        this.languageId = languageId;
    }

    public Byte getOriginalLanguageId() {
        return originalLanguageId;
    }

    public void setOriginalLanguageId(Byte originalLanguageId) {
        this.originalLanguageId = originalLanguageId;
    }

    public Byte getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(Byte rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public BigDecimal getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
    }

    public Short getLength() {
        return length;
    }

    public void setLength(Short length) {
        this.length = length;
    }

    public BigDecimal getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating == null ? null : rating.trim();
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures == null ? null : specialFeatures.trim();
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Film other = (Film) that;
        return (this.getFilmId() == null ? other.getFilmId() == null : this.getFilmId().equals(other.getFilmId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getReleaseYear() == null ? other.getReleaseYear() == null : this.getReleaseYear().equals(other.getReleaseYear()))
            && (this.getLanguageId() == null ? other.getLanguageId() == null : this.getLanguageId().equals(other.getLanguageId()))
            && (this.getOriginalLanguageId() == null ? other.getOriginalLanguageId() == null : this.getOriginalLanguageId().equals(other.getOriginalLanguageId()))
            && (this.getRentalDuration() == null ? other.getRentalDuration() == null : this.getRentalDuration().equals(other.getRentalDuration()))
            && (this.getRentalRate() == null ? other.getRentalRate() == null : this.getRentalRate().equals(other.getRentalRate()))
            && (this.getLength() == null ? other.getLength() == null : this.getLength().equals(other.getLength()))
            && (this.getReplacementCost() == null ? other.getReplacementCost() == null : this.getReplacementCost().equals(other.getReplacementCost()))
            && (this.getRating() == null ? other.getRating() == null : this.getRating().equals(other.getRating()))
            && (this.getSpecialFeatures() == null ? other.getSpecialFeatures() == null : this.getSpecialFeatures().equals(other.getSpecialFeatures()))
            && (this.getLastUpdate() == null ? other.getLastUpdate() == null : this.getLastUpdate().equals(other.getLastUpdate()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFilmId() == null) ? 0 : getFilmId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getReleaseYear() == null) ? 0 : getReleaseYear().hashCode());
        result = prime * result + ((getLanguageId() == null) ? 0 : getLanguageId().hashCode());
        result = prime * result + ((getOriginalLanguageId() == null) ? 0 : getOriginalLanguageId().hashCode());
        result = prime * result + ((getRentalDuration() == null) ? 0 : getRentalDuration().hashCode());
        result = prime * result + ((getRentalRate() == null) ? 0 : getRentalRate().hashCode());
        result = prime * result + ((getLength() == null) ? 0 : getLength().hashCode());
        result = prime * result + ((getReplacementCost() == null) ? 0 : getReplacementCost().hashCode());
        result = prime * result + ((getRating() == null) ? 0 : getRating().hashCode());
        result = prime * result + ((getSpecialFeatures() == null) ? 0 : getSpecialFeatures().hashCode());
        result = prime * result + ((getLastUpdate() == null) ? 0 : getLastUpdate().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", filmId=").append(filmId);
        sb.append(", title=").append(title);
        sb.append(", releaseYear=").append(releaseYear);
        sb.append(", languageId=").append(languageId);
        sb.append(", originalLanguageId=").append(originalLanguageId);
        sb.append(", rentalDuration=").append(rentalDuration);
        sb.append(", rentalRate=").append(rentalRate);
        sb.append(", length=").append(length);
        sb.append(", replacementCost=").append(replacementCost);
        sb.append(", rating=").append(rating);
        sb.append(", specialFeatures=").append(specialFeatures);
        sb.append(", lastUpdate=").append(lastUpdate);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.hand.Model;

import java.io.Serializable;

public class Film_actorKey implements Serializable {
    private Short actorId;

    private Short filmId;

    private static final long serialVersionUID = 1L;

    public Short getActorId() {
        return actorId;
    }

    public void setActorId(Short actorId) {
        this.actorId = actorId;
    }

    public Short getFilmId() {
        return filmId;
    }

    public void setFilmId(Short filmId) {
        this.filmId = filmId;
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
        Film_actorKey other = (Film_actorKey) that;
        return (this.getActorId() == null ? other.getActorId() == null : this.getActorId().equals(other.getActorId()))
            && (this.getFilmId() == null ? other.getFilmId() == null : this.getFilmId().equals(other.getFilmId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getActorId() == null) ? 0 : getActorId().hashCode());
        result = prime * result + ((getFilmId() == null) ? 0 : getFilmId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", actorId=").append(actorId);
        sb.append(", filmId=").append(filmId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
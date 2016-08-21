package com.hand.Model;

import java.io.Serializable;
import java.util.Date;

public class Film_actor extends Film_actorKey implements Serializable {
    private Date lastUpdate;

    private static final long serialVersionUID = 1L;

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
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
        Film_actor other = (Film_actor) that;
        return (this.getActorId() == null ? other.getActorId() == null : this.getActorId().equals(other.getActorId()))
            && (this.getFilmId() == null ? other.getFilmId() == null : this.getFilmId().equals(other.getFilmId()))
            && (this.getLastUpdate() == null ? other.getLastUpdate() == null : this.getLastUpdate().equals(other.getLastUpdate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getActorId() == null) ? 0 : getActorId().hashCode());
        result = prime * result + ((getFilmId() == null) ? 0 : getFilmId().hashCode());
        result = prime * result + ((getLastUpdate() == null) ? 0 : getLastUpdate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lastUpdate=").append(lastUpdate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
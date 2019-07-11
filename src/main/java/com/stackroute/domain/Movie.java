package com.stackroute.domain;

public class Movie {

    Actor actor, actress;

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void setActress(Actor actress) {
        this.actress = actress;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                ", actress=" + actress +
                '}';
    }
}

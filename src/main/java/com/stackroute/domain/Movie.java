package com.stackroute.domain;

public class Movie {

    Actor actor, actress, sidekick;

    public Movie(){

    }

    public Movie(Actor actor, Actor actress, Actor sidekick) {
        this.actor = actor;
        this.actress = actress;
        this.sidekick = sidekick;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void setActress(Actor actress) {
        this.actress = actress;
    }

    public void setSidekick(Actor sidekick) {
        this.sidekick = sidekick;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                ", actress=" + actress +
                ", sidekick=" + sidekick +
                '}';
    }
}

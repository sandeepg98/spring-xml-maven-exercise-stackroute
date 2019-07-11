package com.stackroute.domain;

public class Movie {

    Actor actor, actress, sidekick;

    public Movie(Actor actor, Actor actress, Actor sidekick) {
        this.actor = actor;
        this.actress = actress;
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

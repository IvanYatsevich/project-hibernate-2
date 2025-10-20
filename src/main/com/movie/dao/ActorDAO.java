package main.com.movie.dao;

import main.com.movie.entity.Actor;
import org.hibernate.SessionFactory;

public class ActorDAO extends AbstractDAO<Actor> {
    public ActorDAO(SessionFactory sessionFactory) {
        super(Actor.class, sessionFactory);
    }
}

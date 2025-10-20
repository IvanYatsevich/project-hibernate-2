package main.com.movie.dao;

import main.com.movie.entity.Store;
import org.hibernate.SessionFactory;

public class StoreDAO extends AbstractDAO<Store> {
    public StoreDAO(SessionFactory sessionFactory) {
        super(Store.class, sessionFactory);
    }
}

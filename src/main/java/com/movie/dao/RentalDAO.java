package com.movie.dao;

import com.movie.entity.Rental;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class RentalDAO extends AbstractDAO<Rental> {
    public RentalDAO(SessionFactory sessionFactory) {
        super(Rental.class, sessionFactory);
    }

    public Rental getAnyUnreturnedRental() {
        Query<Rental> guery= getCurrentSession().createQuery("select r from Rental r where r.returnDate is null", Rental.class);
        guery.setMaxResults(1);
        return guery.getSingleResult();

    }
}

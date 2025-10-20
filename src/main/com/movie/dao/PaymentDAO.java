package main.com.movie.dao;

import main.com.movie.entity.Payment;
import org.hibernate.SessionFactory;

public class PaymentDAO extends AbstractDAO<Payment> {
    public PaymentDAO(SessionFactory sessionFactory) {
        super(Payment.class, sessionFactory);
    }
}

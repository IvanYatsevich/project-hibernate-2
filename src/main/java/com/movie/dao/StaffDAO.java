package com.movie.dao;

import com.movie.entity.Staff;
import org.hibernate.SessionFactory;

public class StaffDAO extends AbstractDAO<Staff> {
    public StaffDAO(SessionFactory sessionFactory) {
        super(Staff.class, sessionFactory);
    }
}

package com.in28minutes.learning.jpa.jpain10steps.service;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional // each method would be involved in a transaction
public class UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert (User user){
        entityManager.persist(user);
        return user.getId();
    }
}

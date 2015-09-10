package com.persefone.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.persefone.domain.User;

@Component
public class UserRepository {
	
	@PersistenceContext
	private EntityManager em;

	@Transactional
	public User getUser(Long idUser)
	{
	    return em.find(User.class, idUser);
	}
}

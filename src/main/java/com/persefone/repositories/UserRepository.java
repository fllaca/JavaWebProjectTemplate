package com.persefone.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.persefone.domain.User;

public class UserRepository {
	
	@PersistenceContext(unitName="jpa")
	private EntityManager em;

	@Transactional
	public User getUser(Long idUser)
	{
	    return em.find(User.class, idUser);
	}
}

package com.cg.repository;

import javax.persistence.EntityManager;

import com.cg.entities.User;

public class IUserRepositoryImpl implements IUserRepository {
	
			//Starting JPA LifeCycle
			private EntityManager em;
			
	
	public IUserRepositoryImpl() {
				super();
				em = JPAUtil.getEntityManager();
			}
	
	@Override
	public User addNewUser(User user) {
		em.persist(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		em.merge(user);
		return user;
	}

	@Override
	public User deleteUser(long id) {
		em.remove(id);
		return null;
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}

}

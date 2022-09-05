package com.cg.repository;

import javax.persistence.EntityManager;

import com.cg.entities.Admin;

public class IAdminRepositoryImpl implements IAdminRepository
{
	private EntityManager em;
	
	
	public IAdminRepositoryImpl() {
		super();
		em= JPAUtil.getEntityManager();
	}

	@Override
	public Admin addAdmin(Admin admin) {
		em.persist(admin);
		return admin;
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		em.merge(admin);
		return admin;
	}

	@Override
	public Admin searchAdmin(int id) {
		Admin admin=em.find(Admin.class, id);
		return admin;
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}
	
	
	

}

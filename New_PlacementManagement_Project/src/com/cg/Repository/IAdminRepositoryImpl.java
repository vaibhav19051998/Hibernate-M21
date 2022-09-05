package com.cg.Repository;

import javax.persistence.EntityManager;

import com.cg.entities.Admin;

public class IAdminRepositoryImpl implements IAdminRepository
{
	//for JPA LifeCycle
	private EntityManager em;
	
		//use Constructor
		public IAdminRepositoryImpl() 
		{
		em=JPAUtil.getEntityManager();
		}

	
	@Override
	public Admin addNewAdmin(Admin admin) 
	{
		em.persist(admin);
		return admin;
	}

	@Override
	public Admin updateAdmin(Admin admin) 
	{
		em.merge(admin);
		return admin;
	}
	@Override
		public Admin deleteAdmin(long id) 
		{
			em.remove(id);
	        return null;
		}

		@Override
		public void beginTransaction() 
		{
			em.getTransaction().begin();	
		}

		@Override
		public void commitTransaction() 
		{
			em.getTransaction().commit();	
		}
	}

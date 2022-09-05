package com.cg.Repository;

import javax.persistence.EntityManager;

import com.cg.entities.Certificate;

public class ICertificateRepositoryImpl implements ICertificateRepository
{
	//we are going to use EntityManager method-CRUD
		private EntityManager em;
		
		//default constructor	
		public ICertificateRepositoryImpl() {
		super();
		em = JPAUtil.getEntityManager();
	}
	
	//ICertificateRepositoryImpl  is  Add unimplemented method
		// to add=>persist(obj name);
		@Override
		public Certificate addCertificate(Certificate certificate) {
			em.persist(certificate);
			return certificate;
		}
		@Override
		public Certificate updateCertificate(Certificate certificate) {
			em.merge(certificate);
			return certificate;
		}
		@Override
		public Certificate searchCertificate(long id) {
			Certificate certificate = em.find(Certificate.class, id);
			return certificate;
		}
		@Override
		public Certificate deleteCertificate(long id) {
			em.remove(id);
			return deleteCertificate(id);
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

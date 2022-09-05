package com.cg.services;

import com.cg.Repository.ICertificateRepository;
import com.cg.Repository.ICertificateRepositoryImpl;
import com.cg.entities.Certificate;

public class ICertificateServicesImpl implements ICertificateServices 
{
	//1: Establishing connection
		private ICertificateRepository ce;
		//default constructor
			public ICertificateServicesImpl()
			{
				super();
				ce =new ICertificateRepositoryImpl();
				
			}
	//2:we are going to use EntityManager method-CRUD
		@Override
		public Certificate addCertificate(Certificate certificate) {
			ce.beginTransaction();
			ce.addCertificate(certificate);
			ce.commitTransaction();
			return certificate;
		}
		@Override
		public Certificate updateCertificate(Certificate certificate) {
			ce.beginTransaction();
			ce.updateCertificate(certificate);
			ce.commitTransaction();
			return certificate;
		}
		@Override
		public Certificate searchCertificate(long id) {
			ce.beginTransaction();
			Certificate certificate = ce.searchCertificate(id);
			ce.commitTransaction();
			return certificate;
		}
		@Override
		public Certificate deleteCertificate(long id) {
			ce.beginTransaction();
			Certificate certificate = ce.deleteCertificate(id);
			ce.commitTransaction();
			return certificate;
		}
	

}

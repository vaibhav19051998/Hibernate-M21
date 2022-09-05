package com.cg.services;

import com.cg.entities.Certificate;

public interface ICertificateServices {
	//by default all the method are abstract in the Interface
		 Certificate  addCertificate(Certificate certificate) ; //Certificate
		 Certificate  updateCertificate(Certificate certificate) ; //Certificate
		 Certificate  searchCertificate(long id); //Certificate
		 Certificate deleteCertificate(long id);//Certificate


}

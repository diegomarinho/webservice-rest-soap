package com.webservice.soap;

import javax.jws.WebService;

/**
 * @author Diego Almeida
 */
@WebService(name = "UserSoapService",targetNamespace = "http://webservice-rest-soap.org")
public interface UserSoapService {

    public long countUser();


}

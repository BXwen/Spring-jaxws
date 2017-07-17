package com.db.ws;

import com.db.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * @author Xiaowen
 **/
@Service
@WebService(serviceName="myWebService")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class MyWebService {

    @Autowired
    private TestService testService;

    @WebMethod(operationName="say")
    public String say(@WebParam(name = "message") String msg) {
       return "response: Hello, " + testService.sayHello(msg);
    }

}

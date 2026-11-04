
package service;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;

@WebService(name = "CalculWS")
public interface ICalculatrice {

    @WebMethod(operationName = "addition")
    int somme(
            @WebParam(name = "a") int a,
            @WebParam(name = "b") int b
    );

    @WebMethod(operationName = "multiplication")
    int multiplication(
            @WebParam(name = "a") int a,
            @WebParam(name = "b") int b
    );

    @WebMethod(operationName = "soustraction")
    int soustraction(
            @WebParam(name = "a") int a,
            @WebParam(name = "b") int b
    );

    @WebMethod(operationName = "division")
    int division(
            @WebParam(name = "a") int a,
            @WebParam(name = "b") int b
    );
}

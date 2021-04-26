package webServices;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CustomWebService {
    @WebMethod
    int sum(int a, int b);

    @WebMethod
    int div(int a, int b);

    @WebMethod
    int mul(int a, int b);
}

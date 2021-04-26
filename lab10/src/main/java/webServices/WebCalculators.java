package webServices;

import calculators.IntegerCalculator;

import javax.jws.WebService;

@WebService(endpointInterface = "webServices.CustomWebService")
public class WebCalculators implements CustomWebService {
    @Override
    public int sum(int a, int b) {
        return IntegerCalculator.sum(a, b);
    }

    @Override
    public int div(int a, int b) {
        return IntegerCalculator.div(a, b);
    }

    @Override
    public int mul(int a, int b) {
        return IntegerCalculator.mul(a, b);
    }
}

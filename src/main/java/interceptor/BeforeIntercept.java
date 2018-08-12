package interceptor;

import advice.MethodInvocation;
import expression.PointCut;

import java.lang.reflect.Method;

public class BeforeIntercept extends AbstractAspectjInterceptor implements MethodIntercept {


    public BeforeIntercept(Method method, PointCut cut) {
        super(method, cut);
    }

    public Object invoke(MethodInvocation invocation) {

        return invocation.proceed();
    }
}
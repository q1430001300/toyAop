package expression;

import java.lang.reflect.Method;

public class StringExpressionDiscovery implements ExpressionDiscovery {


    private String packageName;


    private String className;


    private String returnName;


    private String argsName;







    public Boolean match(Method method) {
        return null;
    }
}
package ProxyDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicSubject implements InvocationHandler{
    private Object obj;
    public DynamicSubject()
    {
    }
    public DynamicSubject(Object obj){
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before request");
        method.invoke(obj, args);
        System.out.println("after request");
        return null;
    }
}

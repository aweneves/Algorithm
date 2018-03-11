package ProxyDemo;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        DynamicSubject ds = new DynamicSubject(subject);
        Subject p = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),ds);
//        System.out.println(proxy instanceof Proxy);
        p.request();
    }
}

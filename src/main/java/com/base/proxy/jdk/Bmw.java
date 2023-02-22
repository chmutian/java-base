package com.base.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**Ø
 * @author :mutian
 * @date :2023/2/22Ø
 * @description :Bmw
 */
public class Bmw implements Car{

    @Override
    public void show() {
        System.out.println("bmw");
    }

    public static void main(String[] args) {
        Bmw bmw = new Bmw();

        Car car = (Car) Proxy.newProxyInstance(bmw.getClass().getClassLoader(), bmw.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("代理逻辑");
                return method.invoke(bmw, args);
            }
        });
        car.show();
    }

}

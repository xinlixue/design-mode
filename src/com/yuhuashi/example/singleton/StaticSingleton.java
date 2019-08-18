package com.yuhuashi.example.singleton;

/**
 * @program: design-mode
 * @description: 静态内部类, 对静态域使用延迟初始化
 * @author: Mr.Feng
 * @create: 2019-08-19 00:10
 **/
public class StaticSingleton {
  private static class SingletonHolder {
    private static final StaticSingleton INSTANCE = new StaticSingleton();
  }

  private StaticSingleton() {
  }

  public static final StaticSingleton getInstance() {
    return SingletonHolder.INSTANCE;
  }
}

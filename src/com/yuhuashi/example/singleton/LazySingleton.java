package com.yuhuashi.example.singleton;

/**
 * @program: design-mode
 * @description: LazySingleton
 * @author: Mr.Feng
 * @create: 2019-08-19 00:01
 **/
public class LazySingleton {

  /**
   * 懒汉式，线程安全
   */
  private volatile static LazySingleton instance;

  private LazySingleton() {
  }

  /**
   * 双检锁/双重校验锁 DCL，即 double-checked locking
   */
  public static LazySingleton getSingleton() {
    if (null == instance) {
      synchronized (LazySingleton.class) {
        if (null == instance) {
          instance = new LazySingleton();
        }
      }
    }
    return instance;
  }

}

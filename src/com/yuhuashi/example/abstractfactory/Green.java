package com.yuhuashi.example.abstractfactory;

/**
 * @program: design-mode
 * @description:
 * @author: Mr.Feng
 * @create: 2019-08-18 23:39
 **/
public class Green implements Color{
  @Override
  public void fill() {
    System.out.println("Inside Green::fill() method.");
  }
}

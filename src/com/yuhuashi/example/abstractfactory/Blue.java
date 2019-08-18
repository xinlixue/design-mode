package com.yuhuashi.example.abstractfactory;

/**
 * @program: design-mode
 * @description:
 * @author: Mr.Feng
 * @create: 2019-08-18 23:40
 **/
public class Blue implements Color{
  @Override
  public void fill() {
    System.out.println("Inside Blue::fill() method.");
  }
}

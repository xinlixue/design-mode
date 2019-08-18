package com.yuhuashi.example.abstractfactory;


/**
 * @program: design-mode
 * @description:
 * @author: Mr.Feng
 * @create: 2019-08-18 23:28
 **/
public class Circle implements Shape {
  @Override
  public void draw() {
    System.out.println("Inside Circle::draw() method.");
  }
}

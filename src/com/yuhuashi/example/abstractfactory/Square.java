package com.yuhuashi.example.abstractfactory;


/**
 * @program: design-mode
 * @description:
 * @author: Mr.Feng
 * @create: 2019-08-18 23:27
 **/
public class Square implements Shape {


  @Override
  public void draw() {
    System.out.println("Inside Square::draw() method.");
  }
}

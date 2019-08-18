package com.yuhuashi.example.factory;

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

package com.yuhuashi.example.abstractfactory;

/**
 * @program: design-mode
 * @description: 为 Color 和 Shape 对象创建抽象类来获取工厂
 * @author: Mr.Feng
 * @create: 2019-08-18 23:41
 **/
public abstract class AbstractFactory {

  public abstract Color getColor(String color);

  public abstract Shape getShape(String shape);

}

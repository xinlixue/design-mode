package com.yuhuashi.example.abstractfactory;

/**
 * @program: design-mode
 * @description:
 * @author: Mr.Feng
 * @create: 2019-08-18 23:44
 **/
public class ColorFactory  extends AbstractFactory{
  @Override
  public Color getColor(String color) {
    if(color == null){
      return null;
    }
    if(color.equalsIgnoreCase("RED")){
      return new Red();
    } else if(color.equalsIgnoreCase("GREEN")){
      return new Green();
    } else if(color.equalsIgnoreCase("BLUE")){
      return new Blue();
    }
    return null;
  }

  @Override
  public Shape getShape(String shape) {
    return null;
  }
}

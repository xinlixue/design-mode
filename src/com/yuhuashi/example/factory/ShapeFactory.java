package com.yuhuashi.example.factory;

/**
 * @program: design-mode
 * @description: 创建一个工厂，生成基于给定信息的实体类的对象。
 * @author: Mr.Feng
 * @create: 2019-08-18 23:28
 **/
public class ShapeFactory {

  public Shape getShape(String shapeType) {
    if (shapeType == null) {
      return null;
    }
    if ("CIRCLE".equalsIgnoreCase(shapeType)) {
      return new Circle();
    } else if ("RECTANGLE".equalsIgnoreCase(shapeType)) {
      return new Rectangle();
    } else if ("SQUARE".equalsIgnoreCase(shapeType)) {
      return new Square();
    }
    return null;
  }


}

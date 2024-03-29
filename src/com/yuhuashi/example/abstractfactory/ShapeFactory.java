package com.yuhuashi.example.abstractfactory;

/**
 * @program: design-mode
 * @description: 创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象
 * @author: Mr.Feng
 * @create: 2019-08-18 23:41
 **/
public class ShapeFactory extends AbstractFactory {
  @Override
  public Color getColor(String color) {
    return null;
  }

  @Override
  public Shape getShape(String shapeType) {
    if (shapeType == null) {
      return null;
    }
    if (shapeType.equalsIgnoreCase("CIRCLE")) {
      return new Circle();
    } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
      return new Rectangle();
    } else if (shapeType.equalsIgnoreCase("SQUARE")) {
      return new Square();
    }
    return null;
  }
}

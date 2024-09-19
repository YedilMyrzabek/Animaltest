package org.example;

import java.util.List;

public class ShapePrinter {
    public static void printInfo(Shape shape){
        try {
            System.out.println(shape.getInfo());
            System.out.println(ShapeCalculator.CalculateArea(shape));
        }catch (Exception e){
            e.printStackTrace();
        }finally {

        }
    }

    public static void printInfo(List<Shape> shapeList){
        for (Shape shape : shapeList){
            printInfo(shape);
        }
    }

    public static void printInfo(IGetInfo info){
        System.out.println(info.getInfo());
    }
}

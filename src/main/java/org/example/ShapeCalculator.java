package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class ShapeCalculator {
    public static double CalculateArea(Shape shape){
        if(shape instanceof Rigtengle){
            return ((Rigtengle) shape).sideA * ((Rigtengle) shape).sideB;
        }else if(shape instanceof Circle) {
            return ((Circle) shape).radius * ((Circle) shape).radius * Math.PI;
        }else {
            throw new RuntimeException("Shape type not supported");
        }
    }

    public static List<Shape> FilterShapes(List<Shape> shapeList,double minArea,double maxArea){
        return shapeList.stream().filter(shape -> CalculateArea(shape) > minArea && CalculateArea(shape) < maxArea)
                .collect(Collectors.toList());
    }

    public static List<Shape> FilterShapes(List<Shape> shapeList,String infoPart){
        return shapeList.stream().filter(shape -> shape.name.contains(infoPart) || shape.color.contains(infoPart))
                .toList();
    }
}

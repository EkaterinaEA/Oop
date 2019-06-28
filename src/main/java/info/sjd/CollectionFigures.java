package info.sjd;

import info.sjd.circle.Circle;
import info.sjd.square.Square;
import info.sjd.triangle.Triangle;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static info.sjd.PrintArea.log;

public class CollectionFigures {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List collectionFigures = new ArrayList();

        collectionFigures.add(new Circle(5));
        collectionFigures.add(new Square(6));
        collectionFigures.add(new Triangle(1,2,3));
        collectionFigures.add(new Circle(10));
        collectionFigures.add(new Square(11));
        collectionFigures.add(new Triangle(4,5,6));

        for (Object figure : collectionFigures){

            if (figure.getClass().equals(Circle.class)){
                log.info("type of figure: circle");
            } else if (figure.getClass().equals(Square.class)){
                log.info("type of figure: square");
            } else log.info("type of figure: triangle");

            log.info("area: " + String.valueOf(figure.getClass().getMethod("getArea").invoke(figure)));
        }

        double listArea[] = new double[collectionFigures.size()];

        for (int i=0; i<collectionFigures.size(); i++){
            listArea[i] = Double.parseDouble(collectionFigures.get(i).getClass().getMethod("getArea").invoke(collectionFigures.get(i)).toString());
        }

        Arrays.sort(listArea);
        log.info("Min: " + listArea[0]);
        log.info("Max: " + listArea[listArea.length-1]);

    }

}

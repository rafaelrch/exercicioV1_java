package entities;

public class Rectangle {

    public double width;
    public double height;

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return (width * 2) + (height * 2);
    }

    public double diagonal(){
        double numForRaiz = (width * width) + (height * height);
        return Math.sqrt(numForRaiz);
    }

    public String toString(){
        return "AREA = "
                + String.format("%.2f", area())
                + " PERIMETER = "
                + String.format("%.2f", perimeter())
                + " DIAGONAL = "
                + String.format("%.2f", diagonal());
    }
}

class Circle{
    double r;
    final double pie = 3.14;

    Circle (double radius){
        this.r = radius;
    }

    void modifyRadius (double r1){
        r=r1;
    }

    double areaCircle(){
        return pie*r*r;
    }

    double cicumference(){
        return pie*r;
    }

}

class MethodReturning {
    public static void main(String []args){
        Circle c1 =  new Circle(12);

        System.out.println("This is the area of the circle: " + c1.areaCircle());
        System.out.println("This is the circumference of circle: " + c1.cicumference());
        c1.modifyRadius(14);
        System.out.println("This is the area of the circle: " + c1.areaCircle());
        System.out.println("This is the circumference of circle: " + c1.cicumference());
    }
}
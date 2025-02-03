abstract class Shape {
    public abstract void draw();
}


class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class Day3_Q4 {
    public static void main(String[] args) {
        Shape[] s = new Shape[4];
        s[0] = new Circle();
        s[1] = new Rectangle();
        s[2] = new Circle();
        s[3] = new Rectangle();

        for (int i=0;i<s.length;i++) {
            s[i].draw(); 
        }
    }
}
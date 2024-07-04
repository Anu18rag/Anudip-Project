class Rectangle {

    float l,b;

    public Rectangle(float l, float b) {
        this.l = l;
        this.b = b;
    }
    public void parameter(){
        System.out.println(2*l+2*b+"cm is a parameter of rectangle ");
    }
    public void Area(){
        System.out.println(l*b+"cm^2 Area of rectangle");
    }
    public void display(){
        System.out.println("Rectangle");
        System.out.println("Length is "+l+"cm");
        System.out.println("Breadth is "+b+"cm");
    }

}
class RectangleOperation{
    public static void main(String[] args) {
        Rectangle rect=new Rectangle(40, 20);
        rect.display();
        rect.Area();
        rect.parameter();
    }
}

public class Main2 {
	

        static float pi = 21/11;
        float radius = 5, area = 0;

        public void calculateArea(){

        pi = 22/7;
        area = pi * radius * radius;
        System.out.println("Area of circle is: " + area);
    }

    public static void main(String[] args) {

        Main2 obj = new Main2();
        System.out.println("value of pi is: "+pi);
        obj.calculateArea();

    }
}



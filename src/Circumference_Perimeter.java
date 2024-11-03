public class Circumference_Perimeter {
    public static void main(String[] args) {

        // First define the sides of the triangle //
            // If you want to have the user add their own numbers use Scanner!! //
        double Side1 = 13;
        double Side2 = 15;
        double Base = 20;

        // Second Compute the Perimeter //
        double Perimeter;
        Perimeter = Side1 + Side2 + Base;
        System.out.println("The Perimeter of the triangle is: " + Perimeter);

        // Identify PI //
        final double PI = 3.1415926;
        // final makes this absolute, can't change the value of PI from now on //

        // Identify Radius //
        double Radius = 13;

        // Identify Circumference //
        double Circumference;

        // Compute Circumference //
        Circumference = 2 * PI * Radius;
        System.out.println("The Circumference of the circle is: " + Circumference);
        // If you want to round it off to the nearest whole number:
        // System.out.println("The Circumference of the circle is: " + Math.round(Circumference)); //

        // If you want to round off to the nearest 10th:
        // System.out.println("The Circumference of the circle is: " + Math.round(Circumference*100.)/100.);

    }
}

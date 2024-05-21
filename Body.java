import java.util.Scanner;
public class Body {
    public static void main(String[] args) {
        double kg,size,result;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your weight: ");
        kg=input.nextDouble();
        System.out.println("Please enter your height: ");
        size=input.nextDouble();

        result=kg / (size * size);

        System.out.println("Your body mass index: " + result);
    }
}

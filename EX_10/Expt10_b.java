import java.util.Scanner;

final class InterestCalculator {
    private double principal;
    private double time;

    InterestCalculator(double p, double t) {
        this.principal = p;
        this.time = t;
    }

    public final void showSimpleInterest(float rate) {
        double si = (principal * time * rate) / 100;
        System.out.printf("Simple Interest: %.2f%n", si);
    }

    public final void showCompoundInterest(float rate) {
        double amount = principal * Math.pow((1 + rate / 100), time);
        double ci = amount - principal;
        System.out.printf("Compound Interest: %.2f%n", ci);
    }
}

public class Expt10_b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final float ANNUAL_RATE = 2.5f;

        System.out.print("Enter Principal: ");
        double p = input.nextDouble();
        
        System.out.print("Enter Time (years): ");
        double t = input.nextDouble();

        InterestCalculator calc = new InterestCalculator(p, t);
        
        System.out.println(" Results ");
        calc.showSimpleInterest(ANNUAL_RATE);
        calc.showCompoundInterest(ANNUAL_RATE);
        
        input.close();
    }
}
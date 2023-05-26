
public class Main {
    public static void main(String[] args) {

        // (период в годах, сумма кредита в рублях)
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("1 год , 1 миллион рублей");
        System.out.println (service.calculate (1, 1000000));

        System.out.println ("2 годa , 1 миллион рублей");
        System.out.println (service.calculate (2, 1000000));

        System.out.println ("3 год , 1 миллион рублей");
        System.out.println (service.calculate(3, 1000000));
    }
}
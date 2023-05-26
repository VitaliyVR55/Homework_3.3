public class CreditPaymentService {
        public int calculate(int period, int summKredit) {
            double percent = 0.0999;
            double percentd = percent / 12;
            double periodd = (double) period;
            periodd = -(periodd * 12);
            double summKreditd = (double) summKredit;
            double paymentd;
            double x = 1 + percentd; // скобки знаменателя
            double y = Math.pow(x, periodd); // скобки в степени
            double z = 1 - y; // знаменатель
            double a = percentd / z; // дробь
            paymentd = summKreditd * a;
            int payment = (int) paymentd;
            return payment;
        }

}

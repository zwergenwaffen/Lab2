import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task5 {
    public static void main(String[] args)
    {
       double price = 9.99;
       double grossPrice = (price * 1.23F);

       double totalPrice = grossPrice * 10000;
       System.out.println(totalPrice);

       double normalPrice = totalPrice/1.23F;

       System.out.println("Gross price: "+grossPrice);
       System.out.println("Total price: " + totalPrice);
       System.out.println("Total price with no VAT: "+ normalPrice);

       System.out.println("Above is results using BigDecimal:");

        Accurate accurate = new Accurate();
        BigDecimal grossPriceBD = accurate.getGrossPrice();
        BigDecimal totalPriceBD = accurate.getTotalPrice();
        BigDecimal totalNetPriceBD = accurate.getTotalNetPrice();

        System.out.println("Gross price: "+grossPriceBD);
        System.out.println("Total price: " + totalPriceBD);
        System.out.println("Total price with no VAT: "+ totalNetPriceBD);
    }
}
class Accurate
{
    BigDecimal price = new BigDecimal("9.99");
    BigDecimal tax = new BigDecimal("1.23");
    BigDecimal amount = new BigDecimal("10000");
    
    BigDecimal grossPrice = price.multiply(tax).setScale(2, RoundingMode.HALF_EVEN);;
    BigDecimal totalPrice = grossPrice.multiply(amount).setScale(2, RoundingMode.HALF_EVEN);
    BigDecimal totalNetPrice = totalPrice.divide(tax, 2, RoundingMode.HALF_EVEN);;

    public BigDecimal getGrossPrice() {return grossPrice;}
    public BigDecimal getTotalPrice() {return totalPrice;}
    public BigDecimal getTotalNetPrice() {return totalNetPrice;}
}


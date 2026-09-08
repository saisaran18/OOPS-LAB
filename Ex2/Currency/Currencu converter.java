package currency;

import java.util.*;
import java.text.DecimalFormat;

public class CurrencyConverter
{
   double rupee, dollar, euro, yen;
   Scanner sc = new Scanner(System.in);
   DecimalFormat f = new DecimalFormat("##.###");

   public void converterInrToEuro()
   {
     System.out.println("Enter amount in rupees");
     rupee = sc.nextFloat();
     euro = rupee / 80;
     System.out.println("Euro : " + f.format(euro));
   }

   public void converterEuroToInr()
   {
     System.out.println("Enter amount in Euro");
     euro = sc.nextFloat();
     rupee = euro * 80;
     System.out.println("Rupees : " + f.format(rupee));
   }

   public void converterInrToDollar()
   {
     System.out.println("Enter amount in rupees");
     rupee = sc.nextFloat();
     dollar = rupee / 66;
     System.out.println("Dollar : " + f.format(dollar));
   }

   public void converterDollarToInr()
   {
     System.out.println("Enter amount in dollar");
     dollar = sc.nextFloat();
     rupee = dollar * 66;
     System.out.println("Rupees : " + f.format(rupee));
   }

   public void converterInrToYen()
   {
     System.out.println("Enter amount in rupees");
     rupee = sc.nextFloat();
     yen = rupee / 0.61;
     System.out.println("Yen : " + f.format(yen));
   }

   public void converterYenToInr()
   {
     System.out.println("Enter amount in yen");
     yen = sc.nextFloat();
     rupee = yen * 0.61;
     System.out.println("Rupees : " + f.format(rupee));
   }
}
class FooCorporation {

  public static void main(String[] arguments){

      double Emp1 = TotalPay(7.50 , 35);
      double Emp2 = TotalPay(8.20 , 47);
      double Emp3 = TotalPay(10.00 , 73);
      System.out.println("Your basic pay is Emp1" + Emp1);
      System.out.println("Your basic pay is Emp2" + Emp1);
      System.out.println("Your basic pay is Emp3" + Emp1);
  }

  public static double TotalPay(double basepay , double hoursworked){

      double extrahours;
      double extrarate = 1.5;
      double weekhours= 40;
      if (hoursworked > weekhours)
      {
        extrahours = hoursworked - weekhours;

        return (basepay * hoursworked) + (extrahours * basepay * extrarate);
      }

      return basepay * hoursworked;

  }

}

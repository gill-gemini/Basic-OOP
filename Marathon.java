/*Assignment No 3*/
class Marathon {


  public static void main (String[] arguments) {
    String[] names = {
      "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
      "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
      "Aaron", "Kate"
    };

    int[] times = {
      341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
      343, 317, 265
    };

    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i] + ": " + times[i]);
    }

    int result = fastestrunner(times);
    int r4 = secondfastestrunner(times);
    System.out.println(result + ":::" + times[result]);
    System.out.println("result2 + :::" + r4);
  }

  public static int fastestrunner(int[] timing){
    int index=0;
    int lowest;
    int tru= 0;


    for(int i=0;i<timing.length;i++)
    {
      tru =0;
      for(int j= 1; j<timing.length; j++){
          //System.out.println(timing[j]);
          if(timing[i] < timing[j])
          {
              tru =1;
          }

      }
      /*Condition to check and store the index for smallest value*/
      if(tru == 1 && timing[i] < timing[index])
        index=i;
    }
    return index;
  }

  public static int secondfastestrunner(int[] timing){
    int result = fastestrunner(timing);
    int r2;
    int r3=1000;

          System.out.println("fastest runner" + timing[result]);
    for(int i=0;i<timing.length;i++)
    {
      r2 = timing[i] - timing[result];
      if(r2==0)
        continue;

      System.out.println(r2 +"..." + timing[i]);
      if(r2 < r3)
        r3= r2;

      System.out.println(r3 +"... New");
    }

    //System.println.out("second fastesr"+r3);
    return r3 + timing[result];
  }

}

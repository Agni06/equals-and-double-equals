class app
  {

    public static void main(String,args[])
    {
double d1 = 4.3;
      double d2  = 4.3;
      System.out.println(d1==d2);
      //return false
      Integer i1 = 2;
      Integer i2 = 2;
      System.out.println(i1==i2);
     // return true

      double d3 = 4.3;
      double d4  = 4.3;
      System.out.println(d1.equals(d2));
      //return true
      Integer i3 = 2;
      Integer i4 = 2;
      System.out.println(i1.equals(i2));
     // return true

      String s1 = "Agni";
      String s2 = "Agni";
      System.out,println(s1==s2);
      //return true;
      
       String s3 = "Agni";
      String s4 = "Agni";
      System.out,println(s1.equals(s2));
      //return true;


      String s5 = "Agni";
      String s6 = "AgniCharan";


      System.out.println(s5==s6.substring(0,4));
      //return false;

      String s7 = "Agni";
      String s8 = "AgniCharan";


      System.out.println(s5.equals(s6.substring(0,4)));
      //return false;
      
      
      
      
      

      
    }
  }

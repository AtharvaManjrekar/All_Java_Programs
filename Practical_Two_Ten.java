public class Practical_Two_Ten{
    public static void main(String[] args) {
      String str = "atharva";
     int vCount = 0 , cCount = 0;
      System.out.println(str.toLowerCase());
      for(int i=0;i<str.length();i++)
      {
         if(str.charAt(i) =='a'|| str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) =='o' || str.charAt(i)=='u')
         {
                  vCount++;
        }
        else{
            cCount++;
        }
    }
        System.out.println("The number of vowels are :"+vCount);
        System.out.println("The number of consonant is :"+cCount);
    }
}

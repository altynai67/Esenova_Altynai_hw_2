public class Main{
        public static void main(String[]args){
          System.out.println(walk(29,15));
          System.out.println(walk(17,27));
          System.out.println(walk(46,-6));
          System.out.println(walk(24,-10));
          System.out.println(walk(15,35));
          System.out.println(" ");

        }

        public static String walk (int age, int temperature) {
            if ((age > 20 && age < 45) && (temperature > -20 && temperature < 30)){
                return ("Можно идти гулять");
            } else if (age < 20 && (temperature > 0 && temperature < 28)){
                return ("Можно идти гулять");
            } else if(age > 45 && (temperature > -10 && temperature < 25)){
                return ("Можно идти гулять");
            } else {
                return ("Оставайтесь дома");
            }
        }
  // дз на сообразительность
         public static int generateRandomAge(){
         return(int)(Math.random()*50);
              }

        }
import java.util.Random;

public class Runner {
    public static void main(String[] args) {
        Fighter a= new Fighter("Winson",10,120,100,12.5);
        Fighter b =new Fighter("Jonathan", 20,110,95,20.9);

        Random rnd=new Random();
        int randm=rnd.nextInt(2)+1;

       if(randm==1) {
           System.out.println("First gamer is "+a.name);
           Match match1 = new Match(a, b, 90, 120);
           match1.run();
       }
        else {

           System.out.println("First gamer is "+b.name);
            Match match2 = new Match(b, a, 90, 120);
            match2.run();
        }






    }
}

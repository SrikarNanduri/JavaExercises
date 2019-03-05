import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class SimpleDateFormatExample {
     private static int counter = 0;
    public static void main(String[] args){
        SimpleDateFormatExample simpleDateFormatExample = new SimpleDateFormatExample();
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                counter = 0;
            }
        },0,10000);
        String userInput;
         do
             {

            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMddyy");

            String formatted = String.format("%04d", counter);
            String id = simpleDateFormat.format(date) + formatted;
            counter++;
            System.out.println(id);
                 System.out.println(id.substring(id.length() - 4));
                 Scanner scanner = new Scanner(System.in);
                 System.out.println("User input: ");
                 userInput =scanner.nextLine();
        }while(userInput.equalsIgnoreCase("y"));

    }

}

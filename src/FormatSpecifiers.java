
public class FormatSpecifiers {

    public static void main(String args[]){
        /*For Example we have multiple integers and we want to show them inside our string
        Consider a case where there are 2 different people with their ages and we want toshow their ages inside a string
        To achive this what we do is we concat them to the string. For example*/

        int david = 13;
        int dawson = 11;
        int dillon = 4;
        int gordon = 2;

        String s1 = "The ages of the people are " + david + ", " + dawson + ", " + dillon
                + ", and " + gordon + " years old";
        System.out.println(s1);
        // This is way too attenction to detail how can we do it easily
        //We can use formatting. It will help you focus on what you want to produce but not on the details

        String s2 = String.format("The ages of the people are %d, %d, %d, and %d years old", david, dawson, dillon, gordon);
        System.out.println(s2);
        //This will produce the same output as before but without concentrating on how we are doing but focusing on what to do.


        //It also gives yuo more control for example consider this example

        double avgDiff = ((david - dawson) + (dawson - dillon) + (dillon - gordon)) / 3.0d;

        //If we use the normal string concat lets see what the output will be
        String s3 = "The average age between each is " + avgDiff + " years";
        System.out.println(s3);
        //This will give you 3.666666666666665 but that is irrelevant in this case as we just want to show the average
        //So what we can do is use format to specifi how many decimal places you want to show

        String s4 = String.format("The average age between each is %.1f years", avgDiff);
        System.out.println(s4);

        /*So as you can see we used %d and %.1f as you can see the format specifiers will have
        a Format specifier start % and a conversion d for %d but that's not it as we seen for float
        its %.1f here there's .1 which can be called as precision. We can also add width, which specifies how minimum charaters to display
        theres flags and argument index's too

                 Meaning        Type              Example Value       Result
      d          Decimal        Integral           32                  32
      o          Octal          Integral           32                  40(octal value)
      x and X    Hex            Integral           32                  20(hex value)
      f          Decimal        Floating Point     123.0               123.000000
      e and E    Scientific     Floating Point     123.0               1.230000e+02
                 Notation
      s          String         General            "Hello"              Hello
                                                   Impliment            Return value of
                                                   Formattable          format method*/
        //Lets know more about flags now.
    }

}

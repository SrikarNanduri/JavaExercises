import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String args[]){
        StringJoiner stringJoiner = new StringJoiner(", ");
        stringJoiner.add("Alpha");
        stringJoiner.add("Beta");
        stringJoiner.add("Gamma");
        String theResule = stringJoiner.toString();
        System.out.println(theResule);

        /*This will give us the result as    Alpha, Beta, Gamma
        So stringJoiner is useful when you know that there will be a sequence ot values that will be added to the  string.
        So what we are doing here is that we are passing a delimeter to the stringJoiner saying that we need ", " (a comma and a space) as the separator and we add the values*/

        // We can also chain the values for example

        StringJoiner stringJoinerChain = new StringJoiner(", ");
        stringJoinerChain.add("Alpha").add("Beta").add("Gamma");
        String theChainResult = stringJoinerChain.toString();
        System.out.println(theChainResult);
        //This will give us the same output as before


        //We can also specify starting an ending along with the separator to the StringJoiner

        StringJoiner stringJoinerStartEnd = new StringJoiner(", ", "{", "}");
        stringJoinerStartEnd.add("Alpha").add("Beta").add("Gamma");
        String theStartEndResult = stringJoinerStartEnd.toString();
        System.out.println(theStartEndResult);
        // This will print the result as {Alpha, Beta, Gamma}

        //Now consider a case like this [Alpha], [Gamma], [Beta] for this case we can consider like this
        StringJoiner stringJoinerCase = new StringJoiner("], [", "[", "]");
        stringJoinerCase.add("Alpha").add("Beta").add("Gamma");
        String theCaseResult = stringJoinerCase.toString();
        System.out.println(theCaseResult);
        // This will print something like this [Alpha], [Beta], [Gamma]. We can play around woth stringJoiner more for cases like this.


        //What if there is an empty string. Consider a case where we didn't add any value after we specify the sarting an ending along with the separator
        StringJoiner stringJoinerEmpty = new StringJoiner(", ", "{", "}");
        String theEmptyResult = stringJoinerEmpty.toString();
        System.out.println(theEmptyResult);
        //This will return an empty string with just start and end values in our case it will be {}
        //What if we want to customize it and return a separate string when its empty that is when there is no add() called. We can use setEmptyValue
        StringJoiner stringJoinerEmpty2 = new StringJoiner(", ", "{", "}");
        stringJoinerEmpty2.setEmptyValue("EMPTY");
        //stringJoinerEmpty2.add("Alpha");
        String theEmptyResult2 = stringJoinerEmpty2.toString();
        System.out.println(theEmptyResult2);
        //This will print EMPTY as there is no value added. Uncomment the add() call and you will see that It wont print EMPTY.

        //What if we do call add() but with an empty string like add("") it will still return empty as we did call add(). So the thing to understand  is that if add is called the setEmptyValue will not be
        //called. So if you add an empty value inside add() then it will return the empty value not the EMPTY. Remember that.

    }
}

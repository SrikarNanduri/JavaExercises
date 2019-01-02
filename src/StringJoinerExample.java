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

    }
}

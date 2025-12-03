import java.util.*;

public class wordFrequency{
    /*
    input: group of strings - list - each string in each line can have many words
    output: unique words sorted in the descending order of their frequencies 
    */
    
    public static List<Map.Entry<String, Integer>> sortWordFrequency(List<String> lines){
        //method to sort the words based on their frequencies   

        if (lines == null || lines.isEmpty()){ //no input
            return Collections.emptyList();
        }

        Map<String, Integer> count = new HashMap<>(); //holds the count of each word
        
        for (String l : lines){
            String[] words = l.toLowerCase().split("\\s+"); //splitting where there is one or more spaces
            for (String word: words){ 
                if (!word.isEmpty()){ //check if the user enters empty string or not
                    //when first encountered, the default 0 is stored and on next encounter, the value is incremented by 1 each time
                    count.put(word, count.getOrDefault(word, 0) + 1);
                }
            }
        } //returns a map with word & its count
        
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(count.entrySet()); //every entry in the map is sent to the new list as (word, count) for sorting
        // in (word, count), word is the key and count is the value
        
        sortedList.sort(
            (a,b) -> {
                int c = b.getValue().compareTo(a.getValue()); //sorting desc order of frequency
                if (c!=0) return c;
                return a.getKey().compareTo(b.getKey()); //sorting alphabetically if they have same frequency
            }
        );
        return sortedList;
    }
    
    public static void main (String[] args){
        /*
        //to take input from user

        Scanner sc = new Scanner(System.in);
        List<String> input = new ArrayList<>();
        System.out.println("Enter the lines of strings (enter 'END' to finish): ")
        while (true){
            String l = sc.nextLine();
            if (l.equalsIgnoreCase ("END")) break;
            input.add(l);
        }
        */

        List<String> input = Arrays.asList(
            "apple  mango  apple banana guava     ",
            "mango  apple apple apple banana mango grapes"
        ); //input

        List<Map.Entry<String, Integer>> result = sortWordFrequency(input);
        
        for (Map.Entry<String, Integer> entry : result){
            System.out.println(entry.getKey()+ " : " + entry.getValue());
        }
    }
}
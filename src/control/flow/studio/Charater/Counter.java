package control.flow.studio.Charater;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Counter {
    public static void main(String[] args){

        String quote="If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
//        creates hashMap
        HashMap<String, Integer> quoteMap= new HashMap<>();
//        splits string into characters in an array
        String[] charactersInString = quote.split("");
//  goes through array and adds to hashmap
        for (String c: charactersInString) {
            if(!quoteMap.containsKey(c)){
               quoteMap.put(c,1);
//           if character is already in hashMap add +1 to count
            }else{quoteMap.put(c, quoteMap.get(c)+1);
            }

        }
//        returns each key value pair
        for(Map.Entry<String, Integer> keyValue: quoteMap.entrySet()){
            System.out.println(keyValue.getKey()+":"+keyValue.getValue());
        }





    }
}

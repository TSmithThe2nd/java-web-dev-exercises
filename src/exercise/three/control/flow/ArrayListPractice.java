package exercise.three.control.flow;

public class ArrayListPractice {
    public static Integer getEven(Integer[] arr){
        Integer number=0;
        for(Integer i: arr){
            if(i%2==0){
                number=number+i;
            }

        }
        return number;

    }
}

import java.util.ArrayList;
import java.util.List;

public class DuplicateElementsRemove{

    public static void main(String[] args){
        int[] originalArr = {10,9,6,2,8,3,7,5,5,6,6,7,7,8,8,9,9,10,10};
        
        List<Integer> duplicateRemoved = new ArrayList<>();
        int arrLength = originalArr.length-1;
        for(int i = 0; i < arrLength; i++){
            if(originalArr[i]!=originalArr[i+1]){
                if(!duplicateRemoved.contains(originalArr[i])){
                    duplicateRemoved.add(originalArr[i]);
                    
                }                
            }                      
        }
    if(!duplicateRemoved.contains(originalArr[arrLength])){
        duplicateRemoved.add(originalArr[arrLength]);
    }
        
        for(int i:duplicateRemoved){
            System.out.println(i);
        }        
    }
}
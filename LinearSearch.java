public class LinearSearch {
    
    //Linear Search that returns the index of the first found element
    //Returns -1 if the element is not found
    public static int linearSearch(int[] inputArray, int targetNum) {
        
        int length = inputArray.length;
        
        for(int i = 0; i < length; i++) {
            
            if(targetNum == inputArray[i]) {
                
                return i;
                
            }
            
        }
        
        return -1;
        
    }
    
}

public class BinarySearch {
    
    public static int binarySearch(int[] inputArray, int targetNum) {
        
        int left = 0;
        int right = inputArray.length;
        
        int index;
        int num;

        //If the number is too high, change the right value
        //If the number is too low, change the left value
        while(left <= right) {
            
            index = (left + right) / 2;
            num = inputArray[index];

            if(num == targetNum) {

                return index;
                
            } else if(num < targetNum) {
                
                left = index + 1;
                
            } else {
                
                right =  index - 1;
                
            }
            
        }

        return -1;
        
    }
    
}

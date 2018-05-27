public class SearchTesting {
    
    private final static int SIZE = 100;
    
    public static void main(String[] args) {
        
        //Initialize the sorted testing array
        int[] testArray = new int[SIZE];
        
        for(int i = 0; i < SIZE; i++) {
            
            testArray[i] = i;
        
        }
        
        int targetNum = (int)(Math.random() * SIZE);
        
        //Search for the target value
        //int index = LinearSearch.linearSearch(testArray, targetNum);
        int index = BinarySearch.binarySearch(testArray, targetNum);
        
        System.out.println(index);
        
    }
    
}

public class SearchTesting {
    
    private final static int SIZE = 100;
    private final static int MAX_VALUE = 1000;
    
    public static void main(String[] args) {
        
        //Initialize the testing array and fill it with random integers
        int[] testArray = new int[SIZE];
        
        for(int i = 0; i < testArray.length; i++) {
            
            testArray[i] = (int)(Math.random() * MAX_VALUE);
        
        }
        
        int targetNum = (int)(Math.random() * MAX_VALUE);
        
        int index = LinearSearch.linearSearch(testArray, targetNum);
        
        System.out.println(index);
        
    }
    
}

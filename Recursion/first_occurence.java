public class first_occurence {
    public static int firstOccu(int arr[], int key, int i){
        // base case
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }
        return firstOccu(arr, key, i + 1);
    }
    public static void main(String args[]){
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(firstOccu(arr, 10, 0));
    }    
}
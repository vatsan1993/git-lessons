public class Sample4 {
    public static void main(String[] args) {
        int[] arr = {3,6,7,8,3,8,8};
        int result = 1;
        for(int value : arr){
            result *= value;
        }
        System.out.println("Result: "+ result);
    }
}

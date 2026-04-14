public  class Sample3{
    public static void main(String[] args) {
        int[] arr = { 2,56,63,67,4};
        int total = 0;
        for(int value: arr){
            total += value;
        }

        System.out.println("total: "+ total);
    }
}
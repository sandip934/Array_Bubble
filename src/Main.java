public class Main {
    public static void main(String[] args) {

        int [] arr = {10,30,20,50,60,40};

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]+" ");
        }

        int passes = arr.length - 1;
        int comps = arr.length - 1;

        for(int i = 0;i < passes; i++){
            for(int j = 0; j <(comps - 1);j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
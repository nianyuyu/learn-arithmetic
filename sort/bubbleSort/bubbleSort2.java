public class bubbleSort2{
    public static void main(String[] args) {
        int[] arr = {4,3,0,9,1,6};
        bubble(arr);
    }
    public static void bubble(int arr[]){
        if(arr.length<2 || arr==null){
            return;
        }
        for(int i=arr.length-1;i>0;i--){
            for(int j=0;j<i ;j++ ){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        show(arr);
    }
    public static void swap(int[] arr,int a,int b){
        int c=0;
        c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
    }
    public static void show(int[] arr){
        for(int i:arr){
            System.out.print(i);
        }
    }
}
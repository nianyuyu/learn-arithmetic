class bubbleSort{
    public static void main(String args[]){
        int[] arr = {3,5,2,7,9,0};
        bubble(arr);
    }
    public static void bubble(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
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
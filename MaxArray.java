class MaxArray{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int max=arr[0];
        int max2=-1;
        int max3=-1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        System.out.println("Maximum value in array  :" + max);
        for(int i=1; i<arr.length;i++)
        {
            if(arr[i]>max2 && arr[i]!=max)
            max2=arr[i];
        }
        System.out.println("second maximum value :" + max2);
        for(int i=1; i<arr.length;i++)
        {
            if(arr[i]>max3 && arr[i]!=max2 && arr[i]!=max)
            max3=arr[i];
        }System.out.println("Third maximum value :" + max3);
    }
}
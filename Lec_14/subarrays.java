public class subarrays {
    public static void main(String[] args) {
        int arr[] = {11,23,31,74,158,390};
        int target = 158;

        int res = bs(arr,target);
        if(res==-1){
            System.out.println("element not found");
        }
        else System.out.println("element found-->" + res);
    }

    public static int bs(int arr[], int target){
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = (left+right)/2;

            // 1st cond is wether our mid is the target or not
            if(arr[mid]==target) return mid;
            // checking our target in the right hand side
            if(arr[mid]<target) left = mid+1;
            // checking our element in left hand side
            else right = mid-1;
        }
        return -1;
    }


}


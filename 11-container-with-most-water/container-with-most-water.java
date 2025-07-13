class Solution {
    public int maxArea(int[] height) {
        // int i ,j , h,w ;
        // int n = height.length , sum = 0 ;
        // for(i = 0 ;i  < n ;i++){
        //     for(j = i+1 ; j < n;j++){
        //          h = Math.min(height[i],height[j]);
        //          w = j - i;
        //         if(h * w > sum){
        //          sum = h * w;
        //         }
        //     }
        // }
        // return sum;

        int h ,w,sum = 0;

        int left = 0 ;
        int right = height.length - 1;
        while(left < right){
            h = Math.min(height[left],height[right]);
            w = right - left ;
            if(h * w > sum){
                sum = h * w;
            }

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }

        }
        return sum;
    }
}
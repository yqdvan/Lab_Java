class Solution {
    static int cnt;
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        if(nums.length == 1) return ans;
        for(int i = 1; i < nums.length ; i ++){
            if(nums[i-1] > 0){
                nums[i] += nums[i - 1];
            }else{
                nums[i] = nums[i];
            }
            ans = nums[i] > ans ? nums[i] : ans;
        }
        return ans;
    }
}

// class Solution {
//     static int cnt;
//     public int maxSubArray(int[] nums) {
//         //int length = nums.length;
//         cnt = 0;
//         int i = 0;
//         int max = Integer.MIN_VALUE;
//         while(i < nums.length){
//             max = Math.max(max,f(i,nums));
//             i++;
//         }
//         return max;
//     }
//     public static int f(int i,int[] nums){
//         int sum = 0,ans = Integer.MIN_VALUE;
//         int j,len = 0;
//         while(len < nums.length - i ){
//             for(j = i; j <= i+len;j++){
//                 sum += nums[j];
//             }
//             ans = Math.max(ans,sum);
//             //System.out.println("cnt is: "+ cnt +"sum is :"+ sum);cnt++;
//             sum = 0;
//             len++;
//         }
//         return ans;
//     }
// }

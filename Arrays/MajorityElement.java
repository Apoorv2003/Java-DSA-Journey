class Solution {
    public int majorityElement(int[] nums) {
        return MooreVoting(nums);
    }
    public static int MooreVoting(int[] arr){
        int vote=1;
        int ele=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]==ele){
                vote++;
            }
            else{
                vote--;
                if(vote==0){
                    ele=arr[i];
                    vote=1;
                }
            }
        }
        return ele;
    }
}

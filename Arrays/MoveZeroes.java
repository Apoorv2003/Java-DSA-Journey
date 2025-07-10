class Solution {
  public void moveZeroes(int[] nums) 
  {
    int changed=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            nums[changed]=nums[i];
            changed++;
        }
    }
    while(changed<nums.length){
        nums[changed]=0;
        changed++;
    }
    }
}


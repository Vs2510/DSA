public class majorityElement_mooreVoting {
    public static int findmajority(int[]nums){
        int cand=nums[0];
        int count=1;
        //find potential candidate for majority element
        for(int i=1;i<nums.length;i++){
            if(nums[i]==cand){
                count++;
            }
            else{
                count--;
                if(count==0){
                    cand=nums[i];
                    count=1;
                }
            }
        }
        //validating as majority element
        count=0;
        for(int num:nums){
            if(num==cand){
                count++;
            }

        }
        if(count>nums.length/2){
            return cand;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr={3,3,4,2,4,4,2,4,4};
        System.out.println(findmajority(arr));
    }
}

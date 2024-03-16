package datastructures.leetcode;

public class FindPivotIndex_724 {

    public int pivotIndex(int[] nums) {
        int leftSum;
        int rightSum;
        int index = 0;
        boolean resultFound = false;

        for(int i=0; i <nums.length; i++){
            index = i ;
            resultFound = false;
            leftSum = 0; rightSum = 0 ;

            //calculating left sum
            for(int j = 0; j<index; j++){
                leftSum = leftSum + nums[j];
            }
            //calculating right sum
            for(int k = nums.length-1; k> index; k--){
                rightSum = rightSum + nums[k];
            }
            if(rightSum == leftSum) {
                resultFound = true;
                break;
            }

        }

        if(resultFound)
            return index;
        else
            return -1;

    }

}

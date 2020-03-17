package com.killed;

public class 两数之和 {

    public static void main(String[] args) {
        int[] nums = {5, 3, 1, 3, 5};
        int target = 8;
        Long startTime = System.currentTimeMillis();
        int[] result = twoSum(nums, target);
        System.out.println("耗时:" + (System.currentTimeMillis() - startTime));
        System.out.println(result[0] + "," + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        //结果集
        int[] result = new int[2];
        //记录第一个值
        int remark;
        //从第一个数开始遍历
        for (int i = 0; i < nums.length; i++) {
            remark = nums[i];
            result[0] = i;
            //从外循环下标+1开始遍历
            for (int n = i + 1; n < nums.length; n++) {
                if ((remark + nums[n]) == target) {
                    result[1] = n;
                    return result;
                }
            }
        }
        return result;
    }
}

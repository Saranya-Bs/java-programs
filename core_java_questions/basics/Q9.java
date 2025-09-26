package core_java_questions.basics;

public class Q9 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,9};
        System.out.println(largest(nums));

    }
    public static int largest(int[] nums){
        int ans=Integer.MIN_VALUE;
        for(int i:nums){
            if(i>ans){
                ans=i;
            }
        }
        return ans;
    }
}

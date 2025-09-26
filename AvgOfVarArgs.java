public class AvgOfVarArgs {
    public static void main(String[] args) {
        System.out.println( Avg(1,2,3,4,5));

    }
    public static int Avg(int... nums){
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        return sum/(nums.length);
    } 
}

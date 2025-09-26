package core_java_questions.libraries_1;

public class Q19 {
    public static void main(String[] args) {
        int[] arr=new int[10];
        int sum=0;
        for(int i=0;i<10;i++){
            arr[i]=(int)(Math.random()*10);
            sum+=arr[i];
        }
        System.out.println("The Average is: "+sum/10);
        System.out.println("Elements greater then average are: ");
        for(int i=0;i<10;i++){
            if(arr[i]>sum/10){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}

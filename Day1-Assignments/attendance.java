public class attendance{
    public static void main(String args[]){
        int[] attendance={30,48,50,37,43,40,56,70,30,32};
        int[] prefixsum=new int[10];
        prefixsum[0]=attendance[0];
        for(int i=1;i<10;i++){
            prefixsum[i]=prefixsum[i-1]+attendance[i];
        }
        int total = prefixsum[6] - prefixsum[1];
        System.out.println("Total-" + total);
        int max = attendance[0],day = 1;
        for (int i = 1; i < 10; i++) {
           if (attendance[i] > max) {
           max = attendance[i];
           day = i + 1;
    }
}
System.out.println("Highest: " + max);
System.out.println("Day: " + day);
    }
}
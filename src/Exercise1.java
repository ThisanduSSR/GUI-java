public class Exercise1 {
    public static void loadArray(String[] args){
        for(int i=1; i<list.length;i++){
            list[i] = list[i]+list[i-1];
        }
    }
    public static void printArray(int[] arr){
        for(int num:arr){
            System.out.println(num+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] a = {7};
        int[] b = {3,6};
        int[] c = {4,6,8};
        int[] d = {1,2,3,4};
        int[] e = {8,4,2,0,4};

        loadArray(a);
        loadArray(b);
        loadArray(c);
        loadArray(d);
        loadArray(e);

        System.out.print("a:");
        printArray(a);
        System.out.print("b:");
        printArray(b);
        System.out.print("c:");
        printArray(c);
        System.out.print("d:");
        printArray(d);
        System.out.print("e:");
        printArray(e);
    }
}

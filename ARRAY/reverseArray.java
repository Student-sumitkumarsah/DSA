public class reverseArray {
    public static void revers(int numbers[]){
        int first=0, last=numbers.length-1;
        while(first <last){
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
             first++;
             last --;
        }
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7};
        revers(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
    
}
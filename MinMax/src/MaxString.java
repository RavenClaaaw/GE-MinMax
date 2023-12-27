public class MaxString {
    public String[] values;

    MaxString(int N){
        this.values = new String[N];
    }

    public static void main(String[] args) {
        MaxString max = new MaxString(3);

        max.values[0] = "Apple";
        max.values[1] = "Banana";
        max.values[2] = "Orange";
      
    public String findMax(){
        System.out.println("MAX-VALUE:- " + max.getMax());
    }
}

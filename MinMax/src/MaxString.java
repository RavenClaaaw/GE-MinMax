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

        System.out.println("MAX-VALUE:- " + max.getMax());
    }

    public String getMax(){
        String maxV = this.values[0];

        for(String value : values){
            if(maxV.compareTo(value) < 0) maxV = value;
        }

        return maxV;
    }
}

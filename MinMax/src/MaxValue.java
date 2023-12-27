public class MaxValue {
    public Integer[] values;
    
    MaxValue(int N){
        this.values = new Integer[N];
    }

    public static void main(String[] args) {
        MaxValue minmax = new MaxValue(3);

        minmax.values[0] = 10;
        minmax.values[1] = 20;
        minmax.values[2] = 30;

        System.out.println("MAX-VALUE:- " + minmax.findMax());
    }

    public Integer findMax(){
        Integer maxV = this.values[0];

        for(Integer value : values){
            if(maxV.compareTo(value) < 0) maxV = value;
        }

        return maxV;
    }
    
}
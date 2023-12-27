public class MaxInteger {
    public Integer[] values;
    
    MaxInteger(int N){
        this.values = new Integer[N];
    }

    public static void main(String[] args) {
        MaxInteger max = new MaxInteger(3);

        max.values[0] = 10;
        max.values[1] = 20;
        max.values[2] = 30;

        System.out.println("MAX-VALUE:- " + max.findMax());
    }

    public Integer findMax(){
        Integer maxV = this.values[0];

        for(Integer value : values){
            if(maxV.compareTo(value) < 0) maxV = value;
        }

        return maxV;
    }
    
}
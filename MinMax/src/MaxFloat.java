public class MaxFloat {
    public Float[] values;

    MaxFloat(int N){
        this.values = new Float[N];
    }

    public static void main(String[] args) {
        MaxFloat max = new MaxFloat(3);

        max.values[0] = (float)10.5;
        max.values[1] = (float)20.5;
        max.values[2] = (float)30.5;

        System.out.println("MAX-VALUE:- " + max.getMax());
    }

    public Float getMax(){
        Float maxV = this.values[0];

        for(Float value : values){
            if(maxV.compareTo(value) < 0) maxV = value;
        }

        return maxV;
    }
}

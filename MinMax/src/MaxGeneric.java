import java.util.ArrayList;

public class MaxGeneric<T extends Comparable<T>> {
    public ArrayList<T> values;

    public MaxGeneric(int N) {
        this.values = new ArrayList<>(N);
    }

    public T findMax() {
        T maxV = this.values.get(0);

        for(T value : this.values){
            if(maxV.compareTo(value) < 0) maxV = value;
        }
        
        return maxV;
    }

    public static void main(String[] args) {
        MaxGeneric<Integer> findMaxInt = new MaxGeneric<>(3);
        findMaxInt.values.add(0, 1);
        findMaxInt.values.add(1, 2);
        findMaxInt.values.add(2, 3);
        System.out.println("Max Integer: " + findMaxInt.findMax());

        MaxGeneric<Float> findMaxFloat = new MaxGeneric<>(3);
        findMaxFloat.values.add(0, 1.1f);
        findMaxFloat.values.add(1, 2.2f);
        findMaxFloat.values.add(2, 3.3f);
        System.out.println("Max Float: " + findMaxFloat.findMax());

        MaxGeneric<String> findMaxString = new MaxGeneric<>(3);
        findMaxString.values.add(0, "Apple");
        findMaxString.values.add(1, "Peach");
        findMaxString.values.add(2, "Banana");
        System.out.println("Max String: " + findMaxString.findMax());
    }
}

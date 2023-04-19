package org.example.enumMy;

public interface ISum {


    int sum(int... x);
}

class Sum implements ISum {
    @Override
    public int sum(int... x) {
        int sum = 0;
        for (int xxx : x) {
            sum += xxx;
        }
        return sum;
    }

}

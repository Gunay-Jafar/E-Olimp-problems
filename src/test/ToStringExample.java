package test;

import java.util.concurrent.FutureTask;

class sekil {
    int kose;
    int kosegen;
    int icAci;

    sekil(int kose) {
        this.kose = kose;
        kosegen = (kose * (kose - 3)) / 2;
        icAci = (180 * (kose - 2));
    }
    @Override
    public String toString(){
        return kose+"--"+kosegen+"--"+icAci;
    }
}

public class ToStringExample {
    public static void main(String[] args) {
        sekil geo = new sekil(5);
        System.out.println(geo);

    }
}

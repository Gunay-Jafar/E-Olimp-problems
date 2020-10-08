package test;

enum Maaslar{
    Ali(1000),
    Mehmet(500),
    Gunay(800),
    Gunel(1002);

    private int maas;

    Maaslar(int m){
        maas=m;
    }

    int maasGoster(){
        return maas;
    }

    static void method2(){
        System.out.println("Method 2");
    }
}

public class Enum {
    public static void main(String[] args) {
        System.out.println(Maaslar.Gunay.maasGoster());
        Maaslar.method2();
    }
}

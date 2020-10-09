package test;

class UstSinif {
    public void yaz() {
        System.out.println("Burasi ust sinif");
    }
}

class AltSinif1 extends UstSinif {
    @Override
    public void yaz() {
        System.out.println("Burasi alt sinif 1");
    }
}

class AltSinif2 extends UstSinif {
    @Override
    public void yaz() {
        System.out.println("Burasi alt sinif 2");
    }
}

public class Polimorfizm {
    public static void nesneAl(UstSinif nesne) {
        nesne.yaz();
    }

    public static void main(String[] args) {
        UstSinif u1=new UstSinif();
        AltSinif1 a1=new AltSinif1();
        AltSinif2 a2=new AltSinif2();

        nesneAl(u1);
        nesneAl(a1);
        nesneAl(a2);
    }
}



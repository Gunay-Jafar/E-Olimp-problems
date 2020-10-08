package TestInterface;

public class Isci implements Calisan {
    double ucretSabiti;

    @Override
    public double ucret() {
        return ucretSabiti*oran;
    }

    @Override
    public void calisanBolumu() {
        System.out.println("Ucretli calisan!");

    }

    @Override
    public void ucretBelirle(double ucretSabiti) {
        this.ucretSabiti=ucretSabiti;

    }
}

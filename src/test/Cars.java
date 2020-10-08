package test;

enum Cars {
    AUDI(200),
    BMW(220),
    OPEL(120),
    FIAT(121);

    public int speed;

    Cars(int speed) {
        this.speed = speed;
    }

    public static void main(String[] args) {
        System.out.println(Cars.BMW.speed);
    }
}

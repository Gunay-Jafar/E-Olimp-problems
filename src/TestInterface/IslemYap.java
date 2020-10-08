package TestInterface;

public class IslemYap {
    public class DahiliUyeSinif {
        public void method1() {
            System.out.println("Dahili uye sinifi");
        }

        public void method2(int a, int b) {
            System.out.println(a * b);
        }
    }

    public static void main(String[] args) {
        IslemYap.DahiliUyeSinif n=new IslemYap().new DahiliUyeSinif();
        n.method1();
        n.method2(3,4);
    }
}

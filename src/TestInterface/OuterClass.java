package TestInterface;

public class OuterClass {
    private String sinfDegiskeni="Java";

    public static void main(String[] args) {
        OuterClass outerClass=new OuterClass();
        outerClass.dahiliSinifNesneOlustur();
    }

    private void dahiliSinifNesneOlustur(){
        InnerClass innerClass=new InnerClass();
        innerClass.ekranaYaz();

    }

    private class InnerClass{
        public void ekranaYaz(){
            System.out.println("Outer sinif defiskeni: "+sinfDegiskeni);
        }
    }
}

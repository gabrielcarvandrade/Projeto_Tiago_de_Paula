public class B {
    private int B1;
    private float B2;

    // Construtor
    public B(int B1, float B2) {
        this.B1 = B1;
        this.B2 = B2;
    }

    // Getters e Setters
    public int getB1() {
        return B1;
    }

    public void setB1(int B1) {
        this.B1 = B1;
    }

    public float getB2() {
        return B2;
    }

    public void setB2(float B2) {
        this.B2 = B2;
    }

    // Métodos MB1, MB2 e MB3
    public void MB1() {
        System.out.println("Método MB1");
    }

    public void MB2() {
        System.out.println("Método MB2");
    }

    public void MB3() {
        System.out.println("Método MB3");
    }
}

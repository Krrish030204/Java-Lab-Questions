interface A { void showA(); }
interface B { void showB(); }

class Q5 implements A, B {
    public void showA() { System.out.println("A"); }
    public void showB() { System.out.println("B"); }

    public static void main(String[] args) {
        Q5 o = new Q5();
        o.showA();
        o.showB();
    }
}

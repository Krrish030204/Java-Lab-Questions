class Even extends Thread {
    public void run() {
        for(int i=2;i<=100;i+=2) System.out.println(i);
    }
}

class Odd extends Thread {
    public void run() {
        for(int i=1;i<=99;i+=2) System.out.println(i);
    }
}

class Q6 {
    public static void main(String[] args) {
        new Even().start();
        new Odd().start();
    }
}

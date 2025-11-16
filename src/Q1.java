class Q1 {
    public static void main(String[] args) {
        int a = 10;
        double b = 5.5;
        String c = "Hello";

        if(a > 5) System.out.println("IF");
        else System.out.println("ELSE");

        switch(a) {
            case 10: System.out.println("TEN"); break;
            default: System.out.println("OTHER");
        }

        for(int i=1;i<=3;i++) System.out.println(i);

        int x = 1;
        while(x<=3) {
            System.out.println(x);
            x++;
        }
    }
}

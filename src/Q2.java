class Q2 {
    static int rec(int n) {
        if(n==0) return 1;
        return n*rec(n-1);
    }

    static int iter(int n) {
        int f=1;
        for(int i=1;i<=n;i++) f*=i;
        return f;
    }

    public static void main(String[] args) {
        System.out.println(rec(5));
        System.out.println(iter(5));
    }
}

class Q11 {
    static int count = 0;
    Q11() { count++; }

    public static void main(String[] args) {
        new Q11();
        new Q11();
        new Q11();
        System.out.println(count);
    }
}

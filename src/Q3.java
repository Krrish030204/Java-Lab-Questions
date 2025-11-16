class Q3 {
    public static void main(String[] args) {
        int[] a = {10, 50, 20, 40};
        int max1 = a[0], max2 = a[0];
        for(int i=1;i<a.length;i++) {
            if(a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            } else if(a[i] > max2 && a[i] != max1) {
                max2 = a[i];
            }
        }
        System.out.println(max2);
    }
}

class Q37 {
    public static void main(String[] args) {
        double sa = 149;
        double h = 6;
        double pi = Math.PI;

        double r = (sa / (2 * pi * (h + 1))); // rough approximation
        double d = 2 * r;

        System.out.println("Diameter is approximately: " + d + " cm");
    }
}
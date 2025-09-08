class Q34 {
    public static void main(String args[]) {

        int base1 = 128;
        int base2 = 92;
        int height = 40;
        int walkwayWidth = 4;

        int trapezoidArea = (base1 + base2) * height / 2;
        int walkwayArea = walkwayWidth * height;

        int totalArea = trapezoidArea + walkwayArea;

        System.out.println("Total area after adding the walkway: " + totalArea);
    }
}

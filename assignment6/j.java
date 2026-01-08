class Sum{
    public static void main(String args[]) {
        // check if there are arguments
        if (args.length == 0) {
            System.out.println("Please provide array elements as command line arguments.");
            return;
        }

        // convert command line arguments into integer array
        int n = args.length;
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }

        // find sum of first and last element
        int sum = arr[0] + arr[n - 1];

        // display array elements
        System.out.print("Array Elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nSum of First and Last Element = " + sum);
    }
}

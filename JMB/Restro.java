import java.util.InputMismatchException; // Import for clarity, though not strictly needed as we handle it
import java.util.Scanner;

class Bill {
    public static final String RESET = "\u001B[0m";
    public static final String BG_MAROON = "\u001B[48;5;52m";
    public static final String BG_BEIGE = "\u001B[48;5;230m";

    // Foreground colors
    public static final String WHITE = "\u001B[97m";
    public static final String BLACK = "\u001B[30m";
    public static final String YELLOW = "\u001B[93m";

    // Backgrounds
    public static final String BG_RED = "\u001B[41m";
    public static final String BG_WHITE = "\u001B[47m";
    String name;
    String num;
    int totalbill;
    int totalperson;
    double person10;
    int cameperson;
    static int price;
    static String item;
    double gst;
    int quant;
    double finalbill;

    // No longer needs its own Scanner instance
    // Scanner sc = new Scanner(System.in); 

    Bill(String name, String num, int tp, int cp) {
        this.name = name;
        this.num = num;
        this.totalperson = tp;
        this.cameperson = cp;
        print();
    }

    double per10() {
        person10 = totalperson * 0.10;
        return person10;
    }

    int calculateBill() {
        if (cameperson <= (totalperson + per10())) {
            totalbill = price * totalperson;
        } else {
            totalbill = cameperson * price;
        }
        return totalbill;
    }

    int calculateQaunt() {
        if (cameperson <= (totalperson + per10())) {
            quant = totalperson;
        } else {
            quant = cameperson;
        }
        return quant;
    }

    double gstPrice() {
        double gstprice = calculateBill() * 0.18;
        return gstprice;
    }

    double finalBill() {
        finalbill = calculateBill() + gstPrice();
        return finalbill;
    }

    void print() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                              JMB                               "
                        + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "                                                                "
                        + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "    " + BG_MAROON
                        + "|-----------------------------------------------------|"
                        + BG_BEIGE + "     " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "    " + BG_MAROON
                        + "|                JAIN MITHAI BHANDHAR                 |"
                        + BG_BEIGE + "     " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "    " + BG_MAROON
                        + "|-----------------------------------------------------|"
                        + BG_BEIGE + "     " + RESET);
        System.out.printf(BG_BEIGE + WHITE + "    " + BG_MAROON + "| Name           : %-35s|" + BG_BEIGE
                + "     " + RESET + "\n", name);
        System.out.printf(BG_BEIGE + WHITE + "    " + BG_MAROON + "| Phone Number   : %-35s|" + BG_BEIGE
                + "     " + RESET + "\n", num);
        System.out.printf(BG_BEIGE + WHITE + "    " + BG_MAROON + "| Date           : %-35s|" + BG_BEIGE
                + "     " + RESET + "\n", java.time.LocalDate.now());
        System.out.println(
                BG_BEIGE + WHITE + "    " + BG_MAROON
                        + "|-----------------------------------------------------|"
                        + BG_BEIGE + "     " + RESET);
        System.out.println(BG_BEIGE + WHITE + "    " + BG_MAROON
                + "| Item               | Price | Quantity | Total Price |"
                + BG_BEIGE + "     " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "    " + BG_MAROON
                        + "|-----------------------------------------------------|"
                        + BG_BEIGE + "     " + RESET);
        System.out.printf(
                BG_BEIGE + WHITE + "    " + BG_MAROON
                        + "| %-19s| %-6s| %-9s| %-12s|"
                        + BG_BEIGE + "     " + RESET + "\n",
                "", "", "", "");
        System.out.printf(
                BG_BEIGE + WHITE + "    " + BG_MAROON
                        + "| Targeted : %-8s| %-6s| %-9s| %-12s|"
                        + BG_BEIGE + "     " + RESET + "\n",
                 totalperson,"","","");
        System.out.printf(
                BG_BEIGE + WHITE + "    " + BG_MAROON
                        + "| Attended : %-8s| %-6s| %-9s| %-12s|"
                        + BG_BEIGE + "     " + RESET + "\n",
                 cameperson,"","","");
        System.out.printf(
                BG_BEIGE + WHITE + "    " + BG_MAROON
                        + "| %-19s| %-6s| %-9s| %-12s|"
                        + BG_BEIGE + "     " + RESET + "\n",
                "", "", "", "");
        System.out.printf(
                BG_BEIGE + WHITE + "    " + BG_MAROON
                        + "| %-19s| %-6s| %-9s| %-12s|"
                        + BG_BEIGE + "     " + RESET + "\n",
                "", "", "", "");
        

        System.out.printf(
                BG_BEIGE + WHITE + "    " + BG_MAROON + "| %-19s| %-6s| %-9s| %-12s|" + BG_BEIGE
                        + "     " + RESET + "\n",
                item, price, calculateQaunt(), calculateBill());
        System.out.printf(
                BG_BEIGE + WHITE + "    " + BG_MAROON
                        + "| %-19s| %-6s| %-9s| %-12s|"
                        + BG_BEIGE + "     " + RESET + "\n",
                "", "", "", "");
        System.out.println(
                BG_BEIGE + WHITE + "    " + BG_MAROON
                        + "|-----------------------------------------------------|"
                        + BG_BEIGE + "     " + RESET);
        System.out.printf(
                BG_BEIGE + WHITE + "    " + BG_MAROON
                        + "| GST 18 %-30s | %-12s|"
                        + BG_BEIGE + "     " + RESET + "\n",
                 "", String.format("%.2f", gstPrice())); // Format GST price
        System.out.println(
                BG_BEIGE + WHITE + "    " + BG_MAROON
                        + "|-----------------------------------------------------|"
                        + BG_BEIGE + "     " + RESET);
        System.out.printf(
                BG_BEIGE + WHITE + "    " + BG_MAROON
                        + "| Final Bill %-26s | %-12s|"
                        + BG_BEIGE + "     " + RESET + "\n",
                 "", String.format("%.2f", finalBill())); // Format final bill
        System.out.println(
                BG_BEIGE + WHITE + "    " + BG_MAROON
                        + "|-----------------------------------------------------|"
                        + BG_BEIGE + "     " + RESET);
        System.out.println(BG_BEIGE + WHITE + "    " + BG_MAROON
                + "|                                          Jain       |" + BG_BEIGE + "     "
                + RESET);
        System.out.println(BG_BEIGE + WHITE + "    " + BG_MAROON
                + "|                                      Mithai Bandar  |" + BG_BEIGE + "     "
                + RESET);
        System.out.println(BG_BEIGE + WHITE + "    " + BG_MAROON
                + "|-----------------------------------------------------|" + BG_BEIGE + "     "
                + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(BG_BEIGE + BLACK + "                     Thankyou  Visit Again!                     "
                + RESET);
    }

}

class Lunch {
    // Use the shared scanner from Restro
    // Scanner sc = new Scanner(System.in); 
    public static final String RESET = "\u001B[0m";
    public static final String BG_MAROON = "\u001B[48;5;52m";
    public static final String BG_BEIGE = "\u001B[48;5;230m";

    // Foreground colors
    public static final String WHITE = "\u001B[97m";
    public static final String BLACK = "\u001B[30m";
    public static final String YELLOW = "\u001B[93m";

    // Backgrounds
    public static final String BG_RED = "\u001B[41m";
    public static final String BG_WHITE = "\u001B[47m";

    int vegetablech2;
    int starterch2;
    int soupch2;
    int starterch3;
    int sweetch2;

    void farzi() {
        System.out.print("Enter any key to move forward. ");
        // Use Restro.sc
        String farzi = Restro.sc.nextLine();
    }

    String thali1[] = { "1 Soup or Welcome Drink", "1 Dal", "1 Rice", "1 Sweet Dish", "2 Vegetable Dish",
            "Roti, Naan, Butter Paratha", "Pickle, Salad, Papad" };
    String thali2[] = { "1 Soup or Welcome Drink", "1 Paneer Dish", "1 Dal", "1 Rice",
            "1 Sweet Dish/Ice-cream", "2 Vegetable Dish",
            "Roti, Butter Naan,", "Butter Paratha", "Pickle, Salad, Papad" };
    String thali3[] = { "1 Soup or Welcome Drink", "1 Starter", "1 Paneer Dish", "1 Curd Dish",
            "1 Dal", "1 Rice", "1 Sweet Dish/Ice-cream", "2 Vegetable Dish",
            "Roti, Butter Naan, ", "Butter Paratha",
            "Pickle, Salad, Papad" };
    String thali3f[] = { "1 Soup or Welcome Drink", "1 Starter", "1 Paneer Dish", "1 Curd Dish",
            "1 Dal", "1 Rice", "1 Sweet Dish/Ice-cream", "2 Vegetable Dish", "",
            "Roti, Butter Naan, ", "Butter Paratha",
            "Pickle, Salad, Papad" };
    String thali4[] = { "1 Soup or Welcome Drink", "2 Starter", "1 Paneer Dish", "1 Curd Dish",
            "1 Dal", "1 Rice", "2 Vegetable Dish", "1 Sweet Dish, Ice-cream", "  or Coffee",
            "Roti, Butter Naan, Paratha", "Pickle, Salad, Papad" };
    String thali4f[] = { "1 Soup or Welcome Drink", "2 Starter", " ", "1 Paneer Dish", "1 Curd Dish",
            "1 Dal", "1 Rice", "2 Vegetable Dish", " ", "1 Sweet Dish, Ice-cream", "  or Coffee",
            "Roti, Butter Naan, Paratha", "Pickle, Salad, Papad" };
    String thali5[] = { "1 Soup or Welcome Drink", "2 Starter", "1 Paneer Starter", "1 Pasta (1 Type)",
            "1 Panner Dish", "1 Dal", "1 Curd Dish", "1 Rice", "1 Sweet Dish",
            "1 Ice-cream or Coffee", "2 Vegetable Dish", "Roti, Naan, Paratha",
            "Pickle, Salad, Papad" };
    String thali5f[] = { "1 Soup or Welcome Drink", "2 Starter", "", "1 Paneer Starter", "1 Pasta (1 Type)",
            "1 Panner Dish", "1 Dal", "1 Curd Dish", "1 Rice", "1 Sweet Dish",
            "1 Ice-cream or Coffee", "2 Vegetable Dish", "", "Roti, Naan, Paratha",
            "Pickle, Salad, Papad" };
    String thali6[] = { "2 Soup", "1 Welcome Drink", "3 Starter", "1 Paneer Starter", "1 Chinese Item",
            "1 Paneer Dish", "1 Dal", "1 Curd Dish", "1 Rice", "2 Sweet Dish",
            "1 Ice-cream", "2 Vegetable Dish", "Roti, Naan, Paratha",
            "Pickle, Salad, Papad" };
    String thali6f[] = { "2 Soup", "", "1 Welcome Drink", "3 Starter", "", "", "1 Paneer Starter", "1 Chinese Item",
            "1 Paneer Dish", "1 Dal", "1 Curd Dish", "1 Rice", "2 Sweet Dish", "",
            "1 Ice-cream", "2 Vegetable Dish", "", "Roti, Naan, Paratha",
            "Pickle, Salad, Papad" };

    String thali[] = { "1. Thali A", "2. Thali B", "3. Thali C", "4. Thali D", "5. Thali E", "6. Thali F" };
    int thaliPrices[] = { 310, 360, 410, 470, 600, 700 };

    String soup[] = { "Tomato Soup", "Hot & Sour Ving", "Veg Mancho", "Lemon Coriander" };
    String wdrink = "Welcome Drink";
    String vegetables[] = { "Nav Ratan Korma", "Aloo with Mutter", "Mix Veg", "Green Chana",
            "Corn Palak", "Aloo 65",
            "Aloo Mutter", "Aloo Capsicum", "Aloo Do Pyaza", "Aloo Gobhi/Tomato", "Gobhi Mutter",
            "Kadi Punjabi", "Veg. Kofta (Gol)", "Methi Mutter Malai",
            "Haryali Kofta", "Chana Masala", "Bhindi Masala", "Jeera Aloo", "Dum Aloo", "Gujrati Aloo",
            "Tinda Masala", "Aloo Palak", "Seasonal Veg", "Bhindi Do Pyaza",
            "Veg. Kolhapuri", "Corn Capsicum" };
    String dal[] = { "Dal Fry", "Dal Tadka", "Dal Makhani", "Dal Panchrangi" };
    String rice[] = { "Rice", "Jeera Rice", "Green Peas Pulao", "Veg Pulao", "Veg Fried Rice", "Veg Biryani" };
    String sweetDish[] = { "Gulab Jamun", "Gajar Ka Halwa", "Moong Ka Halwa", "Shree Khand", "Aam Khand", "Vanilla",
            "Butter Scotch", "Sitaphal Basundi" };
    String paneerDish[] = { "Paneer Butter Masala", "Paneer Punjabi", "Paneer Palak", "Paneer Mutter",
            "Paneer Do Pyaza",
            "Paneer Tikka Masala", "Paneer Kadai", "Methi Paneer", "Corn Paneer", "Paneer Kolhapuri",
            "Paneer Chatpatta" };
    String starter[] = { "Mix Veg Pakoda", "Veg Finger", "Bread Pakoda", "Methi Kabab", "Moong Pakoda",
            "Dragon Aloo",
            "Saboo Dana", "Finger Chips", "Aloo Corn Kabab", "Veg Cutlet", "Veg Kothey", "Hara Bhara Kabab",
            "Corn Chat", "Aloo Chat", "Saboo Dana Vada", "Veg Manchurian Dry", "Tandoori Manchurian",
            "Chinese Corn Kebab" };
    String curddish[] = { "Veg Raita", "Loki Raita", "Aloo Raita", "Dahi Papdi", "Boondi Raita", "Fruit Raita",
            "Dahi Vada" };
    String sd[] = { "Gulab Jamun", "Gajar ka Halwa", "Moong ka Halwa", "Shree Khand", "Aam Khand" };
    String ice[] = { "Vanilla", "Butter Scotch", "Sitaphal Basundi", "Kesar Pista", "Malai Kulfi" };
    String coffee = "Coffee";
    String paneerstarter[] = { "Paneer Chilli", "Paneer Tikka", "Dragon Paneer", "Paneer 65", "Paneer Pudina Tikka",
            "Paneer Achari Tikka" };
    String pasta[] = { "White Sauce Pasta", "Red Sauce Pasta", "Mix Sauce Pasta", "Cheese Pasta",
            "Italian Pasta Salad" };
    String chinese[] = { "Baked Veg", "Veg Manchurian", "Veg Noodles", "Baked Palak", "Singapoori Noodles",
            "Veg Fried Rice" };

    String finalthali1[] = new String[7];
    String finalthali2[] = new String[9];
    String finalthali3[] = new String[12];
    String finalthali4[] = new String[13];
    String finalthali5[] = new String[15];
    String finalthali6[] = new String[19];

    void printChinese() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                         Chinese Menu                           "
                        + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "                                                                "
                        + RESET);

        for (int i = 0; i < chinese.length; i++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + "%-1s) %-44s" + BG_BEIGE
                    + "         "
                    + RESET + "\n", (i + 1), chinese[i]);
        }

        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "  ( Select 1 - 6 to choose one between them )  "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

    }

    void printSoup() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                          Soup Menu                             "
                        + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "                                                                "
                        + RESET);

        for (int i = 0; i < soup.length; i++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + "%-1s) %-44s" + BG_BEIGE
                    + "         "
                    + RESET + "\n", (i + 1), soup[i]);
        }

        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "  ( Select 1 - 4 to choose one between them )  "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

    }

    void printPasta() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                         Pasta Menu                             "
                        + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "                                                                "
                        + RESET);

        for (int i = 0; i < pasta.length; i++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + "%-1s) %-44s" + BG_BEIGE
                    + "         "
                    + RESET + "\n", (i + 1), pasta[i]);
        }

        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "  ( Select 1 - 5 to choose one between them )  "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

    }

    void printPaneerStarter() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                        Paneer Starter                          "
                        + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "                                                                "
                        + RESET);

        for (int i = 0; i < paneerstarter.length; i++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + "%-1s) %-44s" + BG_BEIGE
                    + "         "
                    + RESET + "\n", (i + 1), paneerstarter[i]);
        }

        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "  ( Select 1 - 6 to choose one between them )  "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

    }

    void printCurdDish() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                         Curd Dishes                            "
                        + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "                                                                "
                        + RESET);

        for (int i = 0; i < curddish.length; i++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + "%-1s) %-44s" + BG_BEIGE
                    + "         "
                    + RESET + "\n", (i + 1), curddish[i]);
        }

        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "  ( Select 1 - 7 to choose one between them )  "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

    }

    void printVegetables() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                        Vegetable Dishes                        "
                        + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "                                                                "
                        + RESET);

        for (int i = 0; i < vegetables.length; i++) {

            if (i < 9) {
                System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-1s) %-43s" + BG_BEIGE
                        + "         "
                        + RESET + "\n", (i + 1), vegetables[i]);
            } else {
                System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + "%-1s) %-43s" + BG_BEIGE
                        + "         "
                        + RESET + "\n", (i + 1), vegetables[i]);
            }
        }

        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + " ( Select 1 - 26 to choose one between them )  "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

    }

    void printStarter() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                            Starter                             "
                        + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "                                                                "
                        + RESET);

        for (int i = 0; i < starter.length; i++) {

            if (i < 9) {
                System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-1s) %-43s" + BG_BEIGE
                        + "         "
                        + RESET + "\n", (i + 1), starter[i]);
            } else {
                System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + "%-1s) %-43s" + BG_BEIGE
                        + "         "
                        + RESET + "\n", (i + 1), starter[i]);
            }
        }

        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + " ( Select 1 - 18 to choose one between them )  "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

    }

    void printPaneerDish() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                         Paneer Dishes                          "
                        + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "                                                                "
                        + RESET);

        for (int i = 0; i < paneerDish.length; i++) {

            if (i < 9) {
                System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-1s) %-43s" + BG_BEIGE
                        + "         "
                        + RESET + "\n", (i + 1), paneerDish[i]);
            } else {
                System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + "%-1s) %-43s" + BG_BEIGE
                        + "         "
                        + RESET + "\n", (i + 1), paneerDish[i]);
            }
        }

        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + " ( Select 1 - 11 to choose one between them )  "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

    }

    void printDal() {

        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                           Dal Menu                             "
                        + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "                                                                "
                        + RESET);

        for (int i = 0; i < dal.length; i++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + "%-1s) %-44s" + BG_BEIGE
                    + "         "
                    + RESET + "\n", (i + 1), dal[i]);
        }

        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "  ( Select 1 - 4 to choose one between them )  "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

    }

    void printRice() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                          Rice Menu                             "
                        + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "                                                                "
                        + RESET);

        for (int i = 0; i < rice.length; i++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + "%-1s) %-44s" + BG_BEIGE
                    + "         "
                    + RESET + "\n", (i + 1), rice[i]);
        }

        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "  ( Select 1 - 6 to choose one between them )  "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

    }

    void printSweets() {

        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                            Sweets                              "
                        + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "                                                                "
                        + RESET);

        for (int i = 0; i < sd.length; i++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + "%-1s) %-44s" + BG_BEIGE
                    + "         "
                    + RESET + "\n", (i + 1), sd[i]);
        }

        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "  ( Select 1 - 5 to choose one between them )  "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

    }

    void printIceCream() {

        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                          Ice-Cream                             "
                        + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "                                                                "
                        + RESET);

        for (int i = 0; i < ice.length; i++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + "%-1s) %-44s" + BG_BEIGE
                    + "         "
                    + RESET + "\n", (i + 1), ice[i]);
        }

        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "  ( Select 1 - 5 to choose one between them )  "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

    }

    void printSweetDish() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                     Sweets or Icecream                         "
                        + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "                                                                "
                        + RESET);

        for (int i = 0; i < sweetDish.length; i++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + "%-1s) %-44s" + BG_BEIGE
                    + "         "
                    + RESET + "\n", (i + 1), sweetDish[i]);
        }

        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "  ( Select 1 - 8 to choose one between them )  "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

    }

    void printFinalThali1() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                              JMB                               "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "              Final Selected Thali             "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + " 1. Thali A                            310 Rs. "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        for (int i = 0, j = 0; i < finalthali1.length && j < 5; i++, j++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-23s: %-21s" + BG_BEIGE
                    + "         "
                    + RESET + "\n", thali1[j], finalthali1[i]);
        }
        System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-24s %-21s" + BG_BEIGE
                + "         "
                + RESET + "\n", "", vegetables[vegetablech2 - 1]);

        for (int i = 5; i < finalthali1.length; i++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-46s" + BG_BEIGE
                    + "         "
                    + RESET + "\n", finalthali1[i]);
        }
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

    }

    void printFinalThali2() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                              JMB                               "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "              Final Selected Thali             "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + " 1. Thali B                            360 Rs. "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        for (int i = 0, j = 0; i < finalthali2.length && j < 6; i++, j++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-23s: %-21s" + BG_BEIGE
                    + "         "
                    + RESET + "\n", thali2[j], finalthali2[i]);
        }
        System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-24s %-21s" + BG_BEIGE
                + "         "
                + RESET + "\n", "", vegetables[vegetablech2 - 1]);

        for (int i = 6; i < finalthali2.length; i++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-46s" + BG_BEIGE
                    + "         "
                    + RESET + "\n", finalthali2[i]);
        }
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

    }

    void printFinalThali3() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                              JMB                               "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "              Final Selected Thali             "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + " 1. Thali C                            410 Rs. "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        for (int i = 0, j = 0; i < finalthali3.length && j < 9; i++, j++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-23s: %-21s" + BG_BEIGE
                    + "         "
                    + RESET + "\n", thali3f[j], finalthali3[i]);
        }
        for (int i = 9; i < finalthali3.length; i++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-46s" + BG_BEIGE
                    + "         "
                    + RESET + "\n", finalthali3[i]);
        }
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

    }

    void printFinalThali4() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                              JMB                               "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "              Final Selected Thali             "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + " 1. Thali D                            470 Rs. "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        for (int i = 0, j = 0; i < finalthali4.length && j < 11; i++, j++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-23s: %-21s" + BG_BEIGE
                    + "         "
                    + RESET + "\n", thali4f[j], finalthali4[i]);
        }
        for (int i = 11; i < finalthali4.length; i++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-46s" + BG_BEIGE
                    + "         "
                    + RESET + "\n", finalthali4[i]);
        }
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

    }

    void printFinalThali5() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                              JMB                               "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "              Final Selected Thali             "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + " 5. Thali E                            600 Rs. "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        for (int i = 0, j = 0; i < finalthali5.length && j < 13; i++, j++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-23s: %-21s" + BG_BEIGE
                    + "         "
                    + RESET + "\n", thali5f[j], finalthali5[i]);
        }
        for (int i = 13; i < finalthali5.length; i++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-46s" + BG_BEIGE
                    + "         "
                    + RESET + "\n", finalthali5[i]);
        }
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

    }

    void printFinalThali6() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                              JMB                               "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "              Final Selected Thali             "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + " 6. Thali F                            700 Rs. "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        for (int i = 0, j = 0; i < finalthali6.length && j < 17; i++, j++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-23s: %-21s" + BG_BEIGE
                    + "         "
                    + RESET + "\n", thali6f[j], finalthali6[i]);
        }
        for (int i = 17; i < finalthali6.length; i++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-46s" + BG_BEIGE
                    + "         "
                    + RESET + "\n", finalthali6[i]);
        }
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

    }

    // Modified check method: now it reads the input and validates it
    int check(int f) {
        int input;
        while (true) {
            // First, ensure the next token is an integer
            while (!Restro.sc.hasNextInt()) { // Use Restro.sc
                System.out.print("Invalid Input! Please enter only numbers: ");
                Restro.sc.next(); // Consume the invalid non-integer token
            }
            input = Restro.sc.nextInt(); // Now we are sure it's an integer

            // Then, check if the integer is within the valid range
            if (input >= 1 && input <= f) {
                return input; // Valid input, return it
            } else {
                System.out.print("Invalid Input! Please enter a number between 1 and " + f + ": ");
            }
        }
    }

    void PrintLunch() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                              JMB                               "
                        + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "                                                                "
                        + RESET);

        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                   Lunch Menu                  "
                        + BG_BEIGE + "         " + RESET);

        for (int i = 0; i < thali.length; i++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-36s  %-1s %-4s" + BG_BEIGE
                    + "         "
                    + RESET + "\n", thali[i], thaliPrices[i], "Rs.");
        }
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.print("Enter your choice(1-6) : ");
        int thalich = check(6); // Call check, which now handles input
        Restro.sc.nextLine(); // Consume the leftover newline after nextInt() in check()

        switch (thalich) {
            case 1:
                printThali1();
                Bill.price = 310;
                Bill.item = "THALI A";
                break;

            case 2:
                printThali2();
                Bill.price = 360;
                Bill.item = "THALI B";
                break;

            case 3:
                printThali3();
                Bill.price = 410;
                Bill.item = "THALI C";
                break;

            case 4:
                printThali4();
                Bill.price = 470;
                Bill.item = "THALI D";
                break;

            case 5:
                printThali5();
                Bill.price = 600;
                Bill.item = "THALI E";
                break;

            case 6:
                printThali6();
                Bill.price = 700;
                Bill.item = "THALI F";
                break;

            default:
                break;
        }

    }

    void printThali1() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                              JMB                               "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                   Lunch Menu                  "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + " 1. Thali A                            310 Rs. "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        for (int i = 0; i < thali1.length; i++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-46s" + BG_BEIGE + "         "
                    + RESET + "\n", thali1[i]);
        }
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "Note:- You have to select the varities of Item."
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

        // sc.nextLine(); // This was consuming the newline from previous input, farzi does it now.
        farzi();

        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                             Thali A                            "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                                                                "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "            (1)                                    (2)          "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "           Soup                                Welcome Drink    "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.print("Enter your Choice: ");
        int thaliitemch1 = check(2); // Call check, which now handles input
        Restro.sc.nextLine(); // Consume leftover newline

        switch (thaliitemch1) {

            case 1:
                printSoup();
                System.out.print("Enter your choice: ");
                int soupch = check(4); // Call check
                Restro.sc.nextLine(); // Consume leftover newline
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                System.out.printf(
                        BG_MAROON + WHITE + "             Successfully selected %-20s         "
                                + RESET + "\n",
                        soup[soupch - 1]);
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                finalthali1[0] = soup[soupch - 1];

                break;
            case 2:
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                System.out.printf(
                        BG_MAROON + WHITE + "             Successfully selected %-20s         "
                                + RESET + "\n",
                        wdrink);
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                finalthali1[0] = wdrink;
                break;

            default: // Default case is unreachable due to check()
        }
        System.out.println();

        printDal();
        System.out.print("Enter your choice: ");
        int dalch = check(4); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                dal[dalch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali1[1] = dal[dalch - 1];
        System.out.println();

        printRice();
        System.out.print("Enter your choice: ");
        int ricech = check(6); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                rice[ricech - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali1[2] = rice[ricech - 1];
        System.out.println();

        printSweets();
        System.out.print("Enter your choice: ");
        int sdch = check(5); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                sd[sdch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali1[3] = sd[sdch - 1];
        System.out.println();

        printVegetables();
        System.out.print("Enter 1 vegetable choice: ");
        int vegetablech1 = check(26); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                vegetables[vegetablech1 - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);

        System.out.print("Enter 2 vegetable choice: ");
        vegetablech2 = check(26); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        while (vegetablech1 == vegetablech2) {
            System.out.print("You Already selected this vegetable! Please choose another one:");
            vegetablech2 = check(26); // Call check
            Restro.sc.nextLine(); // Consume leftover newline
        }

        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                vegetables[vegetablech2 - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali1[4] = vegetables[vegetablech1 - 1];
        System.out.println();

        finalthali1[5] = thali1[5];
        finalthali1[6] = thali1[6];
        System.out.println();
        printFinalThali1();

    }

    void printThali2() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                              JMB                               "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                   Lunch Menu                  "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + " 1. Thali B                            360 Rs. "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        for (int i = 0; i < thali2.length; i++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-46s" + BG_BEIGE + "         "
                    + RESET + "\n", thali2[i]);
        }
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "Note:- You have to select the varities of Item."
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

        farzi();

        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                             Thali B                            "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                                                                "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "            (1)                                    (2)          "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "           Soup                                Welcome Drink    "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

        System.out.print("Enter your Choice: ");
        int thaliitemch1 = check(2); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        switch (thaliitemch1) {

            case 1:
                printSoup();
                System.out.print("Enter your choice: ");
                int soupch = check(4); // Call check
                Restro.sc.nextLine(); // Consume leftover newline
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                System.out.printf(
                        BG_MAROON + WHITE + "             Successfully selected %-20s         "
                                + RESET + "\n",
                        soup[soupch - 1]);
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                finalthali2[0] = soup[soupch - 1];

                break;
            case 2:
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                System.out.printf(
                        BG_MAROON + WHITE + "             Successfully selected %-20s         "
                                + RESET + "\n",
                        wdrink);
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                finalthali2[0] = wdrink;
                break;

            default: // Default case is unreachable due to check()
        }
        System.out.println();

        printPaneerDish();
        System.out.print("Enter your choice: ");
        int paneerch = check(11); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                paneerDish[paneerch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali2[1] = paneerDish[paneerch - 1];
        System.out.println();

        printDal();
        System.out.print("Enter your choice: ");
        int dalch = check(4); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                dal[dalch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali2[2] = dal[dalch - 1];
        System.out.println();

        printRice();
        System.out.print("Enter your choice: ");
        int ricech = check(6); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                rice[ricech - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali2[3] = rice[ricech - 1];
        System.out.println();

        printSweetDish();
        System.out.print("Enter your choice: ");
        int sdch = check(8); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                sweetDish[sdch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali2[4] = sweetDish[sdch - 1];
        System.out.println();

        printVegetables();
        System.out.print("Enter 1 vegetable choice: ");
        int vegetablech1 = check(26); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                vegetables[vegetablech1 - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);

        System.out.print("Enter 2 vegetable choice: ");
        vegetablech2 = check(26); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        while (vegetablech1 == vegetablech2) {
            System.out.print("You Already select this vegetable! Please choose another one:");
            vegetablech2 = check(26); // Call check
            Restro.sc.nextLine(); // Consume leftover newline
        }

        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                vegetables[vegetablech2 - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali2[5] = vegetables[vegetablech1 - 1];
        System.out.println();

        finalthali2[6] = thali2[6];
        finalthali2[7] = thali2[7];
        finalthali2[8] = thali2[8];
        System.out.println();
        printFinalThali2();

    }

    void printThali3() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                              JMB                               "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                   Lunch Menu                  "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + " 1. Thali C                            410 Rs. "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        for (int i = 0; i < thali3.length; i++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-46s" + BG_BEIGE + "         "
                    + RESET + "\n", thali3[i]);
        }
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "Note:- You have to select the varities of Item."
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

        farzi();

        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                             Thali C                            "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                                                                "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "            (1)                                    (2)          "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "           Soup                                Welcome Drink    "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

        System.out.print("Enter your Choice: ");
        int thaliitemch1 = check(2); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        switch (thaliitemch1) {

            case 1:
                printSoup();
                System.out.print("Enter your choice: ");
                int soupch = check(4); // Call check
                Restro.sc.nextLine(); // Consume leftover newline
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                System.out.printf(
                        BG_MAROON + WHITE + "             Successfully selected %-20s         "
                                + RESET + "\n",
                        soup[soupch - 1]);
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                finalthali3[0] = soup[soupch - 1];

                break;
            case 2:
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                System.out.printf(
                        BG_MAROON + WHITE + "             Successfully selected %-20s         "
                                + RESET + "\n",
                        wdrink);
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                finalthali3[0] = wdrink;
                break;

            default: // Default case is unreachable due to check()
        }
        System.out.println();

        printStarter();
        System.out.print("Enter your choice: ");
        int starterch = check(18); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                starter[starterch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali3[1] = starter[starterch - 1];
        System.out.println();

        printPaneerDish();
        System.out.print("Enter your choice: ");
        int paneerch = check(11); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                paneerDish[paneerch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali3[2] = paneerDish[paneerch - 1];
        System.out.println();

        printCurdDish();
        System.out.print("Enter your choice: ");
        int curdch = check(7); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                curddish[curdch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali3[3] = curddish[curdch - 1];
        System.out.println();

        printDal();
        System.out.print("Enter your choice: ");
        int dalch = check(4); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                dal[dalch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali3[4] = dal[dalch - 1];
        System.out.println();

        printRice();
        System.out.print("Enter your choice: ");
        int ricech = check(6); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                rice[ricech - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali3[5] = rice[ricech - 1];
        System.out.println();

        printSweetDish();
        System.out.print("Enter your choice: ");
        int sdch = check(8); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                sweetDish[sdch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali3[6] = sweetDish[sdch - 1];
        System.out.println();

        printVegetables();
        System.out.print("Enter 1 vegetable choice: ");
        int vegetablech1 = check(26); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                vegetables[vegetablech1 - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);

        System.out.print("Enter 2 vegetable choice: ");
        int vegetablech2 = check(26); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        while (vegetablech1 == vegetablech2) {
            System.out.print("You Already select this vegetable! Please choose another one:");
            vegetablech2 = check(26); // Call check
            Restro.sc.nextLine(); // Consume leftover newline
        }

        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                vegetables[vegetablech2 - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali3[7] = vegetables[vegetablech1 - 1];
        finalthali3[8] = vegetables[vegetablech2 - 1];
        System.out.println();

        finalthali3[9] = thali3[8];
        finalthali3[10] = thali3[9];
        finalthali3[11] = thali3[10];
        System.out.println();
        printFinalThali3();

    }

    void printThali4() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                              JMB                               "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                   Lunch Menu                  "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + " 1. Thali D                            470 Rs. "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        for (int i = 0; i < thali4.length; i++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-46s" + BG_BEIGE + "         "
                    + RESET + "\n", thali4[i]);
        }
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "Note:- You have to select the varities of Item."
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

        farzi();

        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                             Thali D                            "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                                                                "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "            (1)                                    (2)          "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "           Soup                                Welcome Drink    "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

        System.out.print("Enter your Choice: ");
        int thaliitemch1 = check(2); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        switch (thaliitemch1) {

            case 1:
                printSoup();
                System.out.print("Enter your choice: ");
                int soupch = check(4); // Call check
                Restro.sc.nextLine(); // Consume leftover newline
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                System.out.printf(
                        BG_MAROON + WHITE + "             Successfully selected %-20s         "
                                + RESET + "\n",
                        soup[soupch - 1]);
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                finalthali4[0] = soup[soupch - 1];

                break;
            case 2:
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                System.out.printf(
                        BG_MAROON + WHITE + "             Successfully selected %-20s         "
                                + RESET + "\n",
                        wdrink);
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                finalthali4[0] = wdrink;
                break;
        }
        System.out.println();

        printStarter();
        System.out.print("Enter 1 starter choice: ");
        int starterch1 = check(18); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                starter[starterch1 - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali4[1] = starter[starterch1 - 1];

        System.out.print("Enter 2 starter choice: ");
        starterch2 = check(18); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        while (starterch1 == starterch2) {
            System.out.print("You Already select this starter! Please choose another one:");
            starterch2 = check(18); // Call check
            Restro.sc.nextLine(); // Consume leftover newline
        }
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                starter[starterch2 - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali4[2] = starter[starterch2 - 1];
        System.out.println();

        printPaneerDish();
        System.out.print("Enter your choice: ");
        int paneerch = check(11); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                paneerDish[paneerch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali4[3] = paneerDish[paneerch - 1];
        System.out.println();

        printCurdDish();
        System.out.print("Enter your choice: ");
        int curdch = check(7); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                curddish[curdch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali4[4] = curddish[curdch - 1];
        System.out.println();

        printDal();
        System.out.print("Enter your choice: ");
        int dalch = check(4); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                dal[dalch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali4[5] = dal[dalch - 1];
        System.out.println();

        printRice();
        System.out.print("Enter your choice: ");
        int ricech = check(6); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                rice[ricech - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali4[6] = rice[ricech - 1];
        System.out.println();

        printVegetables();
        System.out.print("Enter 1 vegetable choice: ");
        int vegetablech1 = check(26); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                vegetables[vegetablech1 - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);

        System.out.print("Enter 2 vegetable choice: ");
        vegetablech2 = check(26); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        while (vegetablech1 == vegetablech2) {
            System.out.print("You Already select this vegetable! Please choose another one:");
            vegetablech2 = check(26); // Call check
            Restro.sc.nextLine(); // Consume leftover newline
        }

        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                vegetables[vegetablech2 - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali4[7] = vegetables[vegetablech1 - 1];
        finalthali4[8] = vegetables[vegetablech2 - 1];
        System.out.println();

        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                             Thali D                            "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                                                                "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "            (1)                                    (2)          "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "   Sweet Dish or Ice Cream                       Coffee         "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.print("Enter your choice: ");
        int sdicech = check(2); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        switch (sdicech) {

            case 1:
                printSweetDish();
                System.out.print("Enter your choice: ");
                int sdch = check(8); // Call check
                Restro.sc.nextLine(); // Consume leftover newline
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                System.out.printf(
                        BG_MAROON + WHITE + "             Successfully selected %-20s         "
                                + RESET + "\n",
                        sweetDish[sdch - 1]);
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                finalthali4[9] = sweetDish[sdch - 1];

                break;
            case 2:
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                System.out.printf(
                        BG_MAROON + WHITE + "             Successfully selected %-20s         "
                                + RESET + "\n",
                        coffee);
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                finalthali4[9] = coffee;
                break;

            default: // Default case is unreachable due to check()
        }

        finalthali4[10] = "";
        finalthali4[11] = thali4[9];
        finalthali4[12] = thali4[10];
        System.out.println();
        printFinalThali4();

    }

    void printThali5() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                              JMB                               "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                   Lunch Menu                  "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + " 5. Thali E                            600 Rs. "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        for (int i = 0; i < thali5.length; i++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-46s" + BG_BEIGE + "         "
                    + RESET + "\n", thali5[i]);
        }
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "Note:- You have to select the varities of Item."
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

        farzi();

        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                             Thali E                            "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                                                                "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "            (1)                                    (2)          "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "           Soup                                Welcome Drink    "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

        System.out.print("Enter your Choice: ");
        int thaliitemch1 = check(2); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        switch (thaliitemch1) {

            case 1:
                printSoup();
                System.out.print("Enter your choice: ");
                int soupch = check(4); // Call check
                Restro.sc.nextLine(); // Consume leftover newline
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                System.out.printf(
                        BG_MAROON + WHITE + "             Successfully selected %-20s         "
                                + RESET + "\n",
                        soup[soupch - 1]);
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                finalthali5[0] = soup[soupch - 1];

                break;
            case 2:
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                System.out.printf(
                        BG_MAROON + WHITE + "             Successfully selected %-20s         "
                                + RESET + "\n",
                        wdrink);
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                finalthali5[0] = wdrink;
                break;

            default: // Default case is unreachable due to check()
        }
        System.out.println();

        printStarter();
        System.out.print("Enter 1 starter choice: ");
        int starterch1 = check(18); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                starter[starterch1 - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali5[1] = starter[starterch1 - 1];

        System.out.print("Enter 2 starter choice: ");
        starterch2 = check(18); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        while (starterch1 == starterch2) {
            System.out.print("You Already select this starter! Please choose another one:");
            starterch2 = check(18); // Call check
            Restro.sc.nextLine(); // Consume leftover newline
        }
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                starter[starterch2 - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali5[2] = starter[starterch2 - 1];
        System.out.println();

        printPaneerStarter();
        System.out.print("Enter your choice: ");
        int paneerstarterch = check(6); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         " + RESET + "\n",
                paneerstarter[paneerstarterch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        finalthali5[3] = paneerstarter[paneerstarterch - 1];
        System.out.println();

        printPasta();
        System.out.print("Enter your choice: ");
        int pastach = check(5); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                pasta[pastach - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali5[4] = pasta[pastach - 1];
        System.out.println();

        printPaneerDish();
        System.out.print("Enter your choice: ");
        int paneerch = check(11); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                paneerDish[paneerch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali5[5] = paneerDish[paneerch - 1];
        System.out.println();

        printDal();
        System.out.print("Enter your choice: ");
        int dalch = check(4); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                dal[dalch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali5[6] = dal[dalch - 1];
        System.out.println();

        printCurdDish();
        System.out.print("Enter your choice: ");
        int curdch = check(7); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                curddish[curdch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali5[7] = curddish[curdch - 1];
        System.out.println();

        printRice();
        System.out.print("Enter your choice: ");
        int ricech = check(6); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                rice[ricech - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali5[8] = rice[ricech - 1];
        System.out.println();

        printSweets();
        System.out.print("Enter your choice: ");
        int sweetch = check(5); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                sweetDish[sweetch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali5[9] = sweetDish[sweetch - 1];
        System.out.println();

        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                             Thali E                            "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                                                                "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "            (1)                                    (2)          "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "         Ice Cream                               Coffee         "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.print("Enter your choice: ");
        int sdicech = check(2); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        switch (sdicech) {

            case 1:
                printIceCream();
                System.out.print("Enter your choice: ");
                int icech = check(5); // Call check
                Restro.sc.nextLine(); // Consume leftover newline
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                System.out.printf(
                        BG_MAROON + WHITE + "             Successfully selected %-20s         "
                                + RESET + "\n",
                        ice[icech - 1]);
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                finalthali5[10] = ice[icech - 1];

                break;
            case 2:
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                System.out.printf(
                        BG_MAROON + WHITE + "             Successfully selected %-20s         "
                                + RESET + "\n",
                        coffee);
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                finalthali5[10] = coffee;
                break;

            default: // Default case is unreachable due to check()
        }
        System.out.println();

        printVegetables();
        System.out.print("Enter 1 vegetable choice: ");
        int vegetablech1 = check(26); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                vegetables[vegetablech1 - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);

        System.out.print("Enter 2 vegetable choice: ");
        vegetablech2 = check(26); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        while (vegetablech1 == vegetablech2) {
            System.out.print("You Already select this vegetable! Please choose another one:");
            vegetablech2 = check(26); // Call check
            Restro.sc.nextLine(); // Consume leftover newline
        }

        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                vegetables[vegetablech2 - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.println();
        finalthali5[11] = vegetables[vegetablech1 - 1];
        finalthali5[12] = vegetables[vegetablech2 - 1];
        finalthali5[13] = thali5[11];
        finalthali5[14] = thali5[12];
        System.out.println();
        printFinalThali5();

    }

    void printThali6() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                              JMB                               "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                   Lunch Menu                  "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + " 6. Thali F                            700 Rs. "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        for (int i = 0; i < thali6.length; i++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-46s" + BG_BEIGE + "         "
                    + RESET + "\n", thali6[i]);
        }
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "Note:- You have to select the varities of Item."
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

        farzi();

        printSoup();
        System.out.print("Enter  1 soup choice: ");
        int soupch1 = check(4); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                soup[soupch1 - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);

        System.out.print("Enter 2 soup choice: ");
        soupch2 = check(4); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        while (soupch1 == soupch2) {
            System.out.print("You Already select this soup! Please choose another one:");
            soupch2 = check(4); // Call check
            Restro.sc.nextLine(); // Consume leftover newline
        }

        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                soup[soupch2 - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali6[0] = soup[soupch1 - 1];
        finalthali6[1] = soup[soupch2 - 1];

        System.out.println();

        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                wdrink);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali6[2] = wdrink;

        System.out.println();

        printStarter();
        System.out.print("Enter 1 starter choice: ");
        int starterch1 = check(18); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         " + RESET + "\n",
                starter[starterch1 - 1]);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        finalthali6[3] = starter[starterch1 - 1];

        System.out.print("Enter 2 starter choice: ");
        starterch2 = check(18); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        while (starterch1 == starterch2) {
            System.out.print("You Already select this starter! Please choose another one:");
            starterch2 = check(18); // Call check
            Restro.sc.nextLine(); // Consume leftover newline
        }
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         " + RESET + "\n",
                starter[starterch2 - 1]);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        finalthali6[4] = starter[starterch2 - 1];
        System.out.println();

        System.out.print("Enter 3 starter choice: ");
        starterch3 = check(18); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        while (starterch1 == starterch3 || starterch2 == starterch3) {
            System.out.print("You Already select this starter! Please choose another one:");
            starterch3 = check(18); // Call check
            Restro.sc.nextLine(); // Consume leftover newline
        }
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         " + RESET + "\n",
                starter[starterch3 - 1]);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        finalthali6[5] = starter[starterch3 - 1];
        System.out.println();

        printPaneerStarter();
        System.out.print("Enter your choice: ");
        int paneerstarterch = check(6); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         " + RESET + "\n",
                paneerstarter[paneerstarterch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        finalthali6[6] = paneerstarter[paneerstarterch - 1];
        System.out.println();

        printChinese();
        System.out.print("Enter your choice: ");
        int chinesech = check(6); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         " + RESET + "\n",
                chinese[chinesech - 1]);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        finalthali6[7] = chinese[chinesech - 1];
        System.out.println();

        printPaneerDish();
        System.out.print("Enter your choice: ");
        int paneerch = check(11); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         " + RESET + "\n",
                paneerDish[paneerch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        finalthali6[8] = paneerDish[paneerch - 1];
        System.out.println();

        printDal();
        System.out.print("Enter your choice: ");
        int dalch = check(4); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         " + RESET + "\n",
                dal[dalch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        finalthali6[9] = dal[dalch - 1];
        System.out.println();

        printCurdDish();
        System.out.print("Enter your choice: ");
        int curdch = check(7); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         " + RESET + "\n",
                curddish[curdch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        finalthali6[10] = curddish[curdch - 1];
        System.out.println();

        printRice();
        System.out.print("Enter your choice: ");
        int ricech = check(6); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         " + RESET + "\n",
                rice[ricech - 1]);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        finalthali6[11] = rice[ricech - 1];
        System.out.println();

        printSweets();
        System.out.print("Enter 1 sweet choice: ");
        int sweetch = check(5); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         " + RESET + "\n",
                sweetDish[sweetch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        finalthali6[12] = sweetDish[sweetch - 1];
        System.out.println();

        System.out.print("Enter 2 sweet choice: ");
        sweetch2 = check(5); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        while (sweetch == sweetch2) {
            System.out.print("You Already select this sweet! Please choose another one:");
            sweetch2 = check(5); // Call check
            Restro.sc.nextLine(); // Consume leftover newline
        }
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         " + RESET + "\n",
                sweetDish[sweetch2 - 1]);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        finalthali6[13] = sweetDish[sweetch2 - 1];
        System.out.println();

        printIceCream();
        System.out.print("Enter your choice: ");
        int icech = check(5); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                ice[icech - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalthali6[14] = ice[icech - 1];

        System.out.println();

        printVegetables();
        System.out.print("Enter 1 vegetable choice: ");
        int vegetablech1 = check(26); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         " + RESET + "\n",
                vegetables[vegetablech1 - 1]);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

        System.out.print("Enter 2 vegetable choice: ");
        vegetablech2 = check(26); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        while (vegetablech1 == vegetablech2) {
            System.out.print("You Already select this vegetable! Please choose another one:");
            vegetablech2 = check(26); // Call check
            Restro.sc.nextLine(); // Consume leftover newline
        }

        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         " + RESET + "\n",
                vegetables[vegetablech2 - 1]);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        finalthali6[15] = vegetables[vegetablech1 - 1];
        finalthali6[16] = vegetables[vegetablech2 - 1];
        finalthali6[17] = thali6[12];
        finalthali6[18] = thali6[13];
        System.out.println();

        printFinalThali6();

    }

}

class Breakfast {
    // Use the shared scanner from Restro
    // Scanner sc = new Scanner(System.in); 
    public static final String RESET = "\u001B[0m";
    public static final String BG_MAROON = "\u001B[48;5;52m";
    public static final String BG_BEIGE = "\u001B[48;5;230m";

    // Foreground colors
    public static final String WHITE = "\u001B[97m";
    public static final String BLACK = "\u001B[30m";
    public static final String YELLOW = "\u001B[93m";

    // Backgrounds
    public static final String BG_RED = "\u001B[41m";
    public static final String BG_WHITE = "\u001B[47m";

    Lunch obj = new Lunch();

    String snacks[] = { "Idli/Vada Shambhar", "Pav Bhaji", "Chhola Kulcha", "Methi Paratha", "Stuffed Paratha",
            "Muli Paratha", "Noodles",
            "Chhole Bhatura", "Chhola Poori", "Paratha with Dahi", "Onion Paratha", "Gobhi Paratha" };
    String party[] = { "Party A", "Party B", "Party C" };
    int partyprice[] = { 250, 300, 350 };
    String party1[] = { "1 Soup/Welcome drink", "1 Snacks", "1 Starter", "1 Sweet Dish",
            "1 Tea or Coffee" };
    String party2[] = { "1 Soup/Welcome drink", "2 Snacks", "1 Starter", "1 Sweet Dish",
            "1 Tea or Coffee" };
    String party2f[] = { "1 Soup/Welcome drink", "2 Snacks", "", "1 Starter", "1 Sweet Dish",
            "1 Tea or Coffee" };
    String party3[] = { "1 Soup/Welcome drink", "2 Snacks", "1 Starter", "1 Paneer Starter", "1 Sweet Dish",
            "1 Tea or Coffee" };
    String party3f[] = { "1 Soup/Welcome drink", "2 Snacks", "", "1 Starter", "1 Paneer Starter", "1 Sweet Dish",
            "1 Tea or Coffee" };
    String tea = "Tea";
    int snackch2;

    String finalparty1[] = new String[5];
    String finalparty2[] = new String[6];
    String finalparty3[] = new String[7];

    void printSnacks() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                          Snacks Menu                           "
                        + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "                                                                "
                        + RESET);

        for (int i = 0; i < snacks.length; i++) {

            if (i < 9) {
                System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-1s) %-43s" + BG_BEIGE
                        + "         "
                        + RESET + "\n", (i + 1), snacks[i]);
            } else {
                System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + "%-1s) %-43s" + BG_BEIGE
                        + "         "
                        + RESET + "\n", (i + 1), snacks[i]);
            }
        }

        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + " ( Select 1 - 12 to choose one between them )  "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

    }

    void printBreakfast() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                         Breakfast Menu                         "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                                                                "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "            (1)                                    (2)          "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "         Breakfast                             Ladies Party     "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.print("Enter your choice: ");
        int brkch = obj.check(2); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        switch (brkch) {
            case 1:
                printBrkfast();
                break;

            case 2: // Default in original, changed to case 2 for clarity
                printLadiesParty();
                break;

            default: // Default case is unreachable due to check()
                break;
        }
    }

    void printFinalparty1() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                              JMB                               "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "              Final Selected Party             "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + " 1. Party A                            250 Rs. "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        for (int i = 0; i < finalparty1.length; i++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-23s: %-21s" + BG_BEIGE
                    + "         "
                    + RESET + "\n", party1[i], finalparty1[i]);
        }
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

    }

    void printFinalparty2() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                              JMB                               "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "              Final Selected Party             "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + " 2. Party B                            300 Rs. "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        for (int i = 0; i < finalparty2.length; i++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-23s: %-21s" + BG_BEIGE
                    + "         "
                    + RESET + "\n", party2f[i], finalparty2[i]);
        }
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

    }

    void printFinalparty3() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                              JMB                               "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "              Final Selected Party             "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + " 3. Party C                            360 Rs. "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        for (int i = 0; i < finalparty3.length; i++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-23s: %-21s" + BG_BEIGE
                    + "         "
                    + RESET + "\n", party3f[i], finalparty3[i]);
        }
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

    }

    void printLadiesParty() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                              JMB                               "
                        + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "                                                                "
                        + RESET);

        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "               Ladies Party Menu               "
                        + BG_BEIGE + "         " + RESET);

        for (int i = 0; i < party.length; i++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-36s  %-1s %-4s" + BG_BEIGE
                    + "         "
                    + RESET + "\n", party[i], partyprice[i], "Rs.");
        }
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "|------------------ Note ---------------------|"
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "|             Timing : 4 to 6pm               |"
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "|     ( After 6pm 20/- per hour/per head )    |"
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "|---------------------------------------------|"
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.print("Enter your choice(1-3) : ");
        int partych = obj.check(3); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        switch (partych) {
            case 1:
                printParty1();
                Bill.price = partyprice[0]; // Set price for Party A
                Bill.item = "PARTY A";
                break;
            case 2:
                printParty2();
                Bill.price = partyprice[1]; // Set price for Party B
                Bill.item = "PARTY B";
                break;
            case 3:
                printParty3();
                Bill.price = partyprice[2]; // Set price for Party C
                Bill.item = "PARTY C";
                break;
            default: // Default case is unreachable due to check()
                break;
        }

    }

    void printParty1() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                              JMB                               "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                   Party Menu                  "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + " 1. Party A                            250 Rs. "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        for (int i = 0; i < party1.length; i++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-46s" + BG_BEIGE + "         "
                    + RESET + "\n", party1[i]);
        }
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "Note:- You have to select the varities of Item."
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

        obj.farzi();

        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                             Party A                            "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                                                                "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "            (1)                                    (2)          "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "           Soup                                Welcome Drink    "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.print("Enter your Choice: ");
        int thaliitemch1 = obj.check(2); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        switch (thaliitemch1) {

            case 1:
                obj.printSoup();
                System.out.print("Enter your choice: ");
                int soupch = obj.check(4); // Call check
                Restro.sc.nextLine(); // Consume leftover newline
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                System.out.printf(
                        BG_MAROON + WHITE + "             Successfully selected %-20s         "
                                + RESET + "\n",
                        obj.soup[soupch - 1]);
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                finalparty1[0] = obj.soup[soupch - 1];

                break;
            case 2:
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                System.out.printf(
                        BG_MAROON + WHITE + "             Successfully selected %-20s         "
                                + RESET + "\n",
                        obj.wdrink);
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                finalparty1[0] = obj.wdrink;
                break;

            default: // Default case is unreachable due to check()
        }
        System.out.println();

        printSnacks();
        System.out.print("Enter your choice: ");
        int snackch = obj.check(12); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                snacks[snackch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalparty1[1] = snacks[snackch - 1]; // Corrected array index to finalparty1[1]
        System.out.println();

        obj.printStarter();
        System.out.print("Enter your choice: ");
        int starterch = obj.check(18); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                obj.starter[starterch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalparty1[2] = obj.starter[starterch - 1];
        System.out.println();

        obj.printSweets();
        System.out.print("Enter your choice: ");
        int sdch = obj.check(5); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                obj.sd[sdch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalparty1[3] = obj.sd[sdch - 1];
        System.out.println();

        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                             Party A                            "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                                                                "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "            (1)                                    (2)          "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "           Tea                                    Coffee        "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.print("Enter your Choice: ");
        int tch = obj.check(2); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        switch (tch) {
            case 1:
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                System.out.printf(
                        BG_MAROON + WHITE + "             Successfully selected %-20s         "
                                + RESET + "\n",
                        tea);
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                finalparty1[4] = tea;

                break;

            case 2:
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                System.out.printf(
                        BG_MAROON + WHITE + "             Successfully selected %-20s         "
                                + RESET + "\n",
                        obj.coffee);
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                finalparty1[4] = obj.coffee; // Should be obj.coffee, not obj.wdrink
                break;

            default: // Default case is unreachable due to check()
                break;
        }
        System.out.println();
        printFinalparty1();

    }

    void printParty2() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                              JMB                               "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                   Party Menu                  "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + " 1. Party B                            300 Rs. "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        for (int i = 0; i < party2.length; i++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-46s" + BG_BEIGE + "         "
                    + RESET + "\n", party2[i]);
        }
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "Note:- You have to select the varities of Item."
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

        obj.farzi();

        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                             Party B                            "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                                                                "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "            (1)                                    (2)          "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "           Soup                                Welcome Drink    "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

        System.out.print("Enter your Choice: ");
        int thaliitemch1 = obj.check(2); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        switch (thaliitemch1) {

            case 1:
                obj.printSoup();
                System.out.print("Enter your choice: ");
                int soupch = obj.check(4); // Call check
                Restro.sc.nextLine(); // Consume leftover newline
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                System.out.printf(
                        BG_MAROON + WHITE + "             Successfully selected %-20s         "
                                + RESET + "\n",
                        obj.soup[soupch - 1]);
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                finalparty2[0] = obj.soup[soupch - 1];

                break;
            case 2:
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                System.out.printf(
                        BG_MAROON + WHITE + "             Successfully selected %-20s         "
                                + RESET + "\n",
                        obj.wdrink);
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                finalparty2[0] = obj.wdrink;
                break;

            default: // Default case is unreachable due to check()
        }
        System.out.println();

        printSnacks();
        System.out.print("Enter 1 snacks choice: ");
        int snackch = obj.check(12); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                snacks[snackch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalparty2[1] = snacks[snackch - 1];
        System.out.println();

        System.out.print("Enter 2 snacks choice: ");
        snackch2 = obj.check(12); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        while (snackch == snackch2) {
            System.out.print("You Already select this snacks! Please choose another one:");
            snackch2 = obj.check(12); // Call check
            Restro.sc.nextLine(); // Consume leftover newline
        }

        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                snacks[snackch2 - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalparty2[2] = snacks[snackch2 - 1];
        System.out.println();

        obj.printStarter();
        System.out.print("Enter your choice: ");
        int starterch = obj.check(18); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                obj.starter[starterch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalparty2[3] = obj.starter[starterch - 1];
        System.out.println();

        obj.printSweets();
        System.out.print("Enter your choice: ");
        int sdch = obj.check(5); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                obj.sd[sdch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalparty2[4] = obj.sd[sdch - 1];
        System.out.println();

        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                             Party A                            "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                                                                "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "            (1)                                    (2)          "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "           Tea                                    Coffee        "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.print("Enter your Choice: ");
        int tch = obj.check(2); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        switch (tch) {
            case 1:
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                System.out.printf(
                        BG_MAROON + WHITE + "             Successfully selected %-20s         "
                                + RESET + "\n",
                        tea);
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                finalparty2[5] = tea;

                break;

            case 2:
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                System.out.printf(
                        BG_MAROON + WHITE + "             Successfully selected %-20s         "
                                + RESET + "\n",
                        obj.coffee);
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                finalparty2[5] = obj.coffee;
                break;

            default: // Default case is unreachable due to check()
                break;
        }
        System.out.println();

        printFinalparty2();

    }

    void printParty3() {
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                              JMB                               "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                   Party Menu                  "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + " 3. Party C                            360 Rs. "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        for (int i = 0; i < party3.length; i++) {
            System.out.printf(BG_BEIGE + WHITE + "        " + BG_MAROON + " %-46s" + BG_BEIGE + "         "
                    + RESET + "\n", party3[i]);
        }
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "                                               "
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "        " + BG_MAROON
                        + "Note:- You have to select the varities of Item."
                        + BG_BEIGE + "         " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

        obj.farzi();

        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                             Party C                            "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                                                                "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "            (1)                                    (2)          "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "           Soup                                Welcome Drink    "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.print("Enter your Choice: ");
        int thaliitemch1 = obj.check(2); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        switch (thaliitemch1) {

            case 1:
                obj.printSoup();
                System.out.print("Enter your choice: ");
                int soupch = obj.check(4); // Call check
                Restro.sc.nextLine(); // Consume leftover newline
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                System.out.printf(
                        BG_MAROON + WHITE + "             Successfully selected %-20s         "
                                + RESET + "\n",
                        obj.soup[soupch - 1]);
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                finalparty3[0] = obj.soup[soupch - 1];

                break;
            case 2:
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                System.out.printf(
                        BG_MAROON + WHITE + "             Successfully selected %-20s         "
                                + RESET + "\n",
                        obj.wdrink);
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                finalparty3[0] = obj.wdrink;
                break;

            default: // Default case is unreachable due to check()
        }
        System.out.println();

        printSnacks();
        System.out.print("Enter 1 snacks choice: ");
        int snackch = obj.check(12); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                snacks[snackch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalparty3[1] = snacks[snackch - 1];
        System.out.println();

        System.out.print("Enter 2 snacks choice: ");
        snackch2 = obj.check(12); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        while (snackch == snackch2) {
            System.out.print("You Already select this snacks! Please choose another one:");
            snackch2 = obj.check(12); // Call check
            Restro.sc.nextLine(); // Consume leftover newline
        }

        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                snacks[snackch2 - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalparty3[2] = snacks[snackch2 - 1];
        System.out.println();

        obj.printStarter();
        System.out.print("Enter your choice: ");
        int starterch = obj.check(18); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                obj.starter[starterch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalparty3[3] = obj.starter[starterch - 1];
        System.out.println();

        obj.printPaneerStarter();
        System.out.print("Enter your choice: ");
        int paneerstarterch = obj.check(6); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         " + RESET + "\n",
                obj.paneerstarter[paneerstarterch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        finalparty3[4] = obj.paneerstarter[paneerstarterch - 1];
        System.out.println();

        obj.printSweets();
        System.out.print("Enter your choice: ");
        int sdch = obj.check(5); // Call check
        Restro.sc.nextLine(); // Consume leftover newline
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.printf(
                BG_MAROON + WHITE + "             Successfully selected %-20s         "
                        + RESET + "\n",
                obj.sd[sdch - 1]);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        finalparty3[5] = obj.sd[sdch - 1];
        System.out.println();

        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                             Party A                            "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                                                                "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "            (1)                                    (2)          "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "           Tea                                  Ice Cream       "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.print("Enter your Choice: ");
        int tch = obj.check(2); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        switch (tch) {
            case 1:
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                System.out.printf(
                        BG_MAROON + WHITE + "             Successfully selected %-20s         "
                                + RESET + "\n",
                        tea);
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                finalparty3[6] = tea;

                break;

            case 2:
                obj.printIceCream();
                System.out.print("Enter your choice: ");
                int sch = obj.check(5); // Call check
                Restro.sc.nextLine(); // Consume leftover newline
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                System.out.printf(
                        BG_MAROON + WHITE + "             Successfully selected %-20s         "
                                + RESET + "\n",
                        obj.ice[sch - 1]);
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                finalparty3[6] = obj.ice[sch - 1];
                System.out.println();
                break;

            default: // Default case is unreachable due to check()
                break;
        }
        System.out.println();

        printFinalparty3();

    }

    void printBrkfast() {

        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                              JMB                               "
                        + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "                                                                "
                        + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "    " + BG_MAROON
                        + "|-----------------------------------------------------|"
                        + BG_BEIGE + "     " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "    " + BG_MAROON
                        + "                    Breakfast Menu                     "
                        + BG_BEIGE + "     " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "    " + BG_MAROON
                        + "|-----------------------------------------------------|"
                        + BG_BEIGE + "     " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "    " + BG_MAROON
                        + " A  Rs.(200)/-     | B  Rs.(230)/-   | C  Rs.(250)/-   "
                        + BG_BEIGE + "     " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "    " + BG_MAROON
                        + "|-----------------------------------------------------|"
                        + BG_BEIGE + "     " + RESET);
        System.out.println(BG_BEIGE + WHITE + "    " + BG_MAROON
                + " 1 Poha            | 1 Poha          | 1 Poha          "
                + BG_BEIGE + "     " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "    " + BG_MAROON
                        + " 1 Jalebi          | 1 Jalebi        | 1 Jalebi        "
                        + BG_BEIGE + "     " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "    " + BG_MAROON
                        + " 1 Bread Item      | 1 Bread Item    | 1 Bread Item    "
                        + BG_BEIGE + "     " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "    " + BG_MAROON
                        + " 1 Tea or Coffee   | 1 Heavy Snaks   | 2 Heavy Snaks   "
                        + BG_BEIGE + "     " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "    " + BG_MAROON
                        + "                   | 1 Tea or Coffee | 1 Tea or Coffee "
                        + BG_BEIGE + "     " + RESET);
        System.out.println(
                BG_BEIGE + WHITE + "    " + BG_MAROON
                        + "|-----------------------------------------------------|"
                        + BG_BEIGE + "     " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);

        System.out.print("Enter your choice(1-3) : ");
        int brkfastch = obj.check(3); // Call check
        Restro.sc.nextLine(); // Consume leftover newline

        switch (brkfastch) {
            case 1:
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                System.out.println(
                        BG_MAROON + WHITE
                                + "                Breakfast A selected Succefully!                "
                                + RESET);
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                Bill.price = 200;
                Bill.item = "BREAKFAST A";
                break;
            case 2:
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                System.out.println(
                        BG_MAROON + WHITE
                                + "                Breakfast B selected Succefully!                "
                                + RESET);
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                Bill.price = 230;
                Bill.item = "BREAKFAST B";
                break;
            case 3:
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                System.out.println(
                        BG_MAROON + WHITE
                                + "                Breakfast C selected Succefully!                "
                                + RESET);
                System.out.println(
                        BG_BEIGE + "                                                                "
                                + RESET);
                Bill.price = 250;
                Bill.item = "BREAKFAST C";
                break;
            default: // Default case is unreachable due to check()
                break;
        }

    }
}

class Restro {
    public static final Scanner sc = new Scanner(System.in); // Make Scanner static and public for shared access

    public static final String RESET = "\u001B[0m";
    public static final String BG_MAROON = "\u001B[48;5;52m";
    public static final String BG_BEIGE = "\u001B[48;5;230m";

    // Foreground colors
    public static final String WHITE = "\u001B[97m";
    public static final String BLACK = "\u001B[30m";
    public static final String YELLOW = "\u001B[93m";

    // Backgrounds
    public static final String BG_RED = "\u001B[41m";
    public static final String BG_WHITE = "\u001B[47m";

    // Helper method to get a positive integer input (for totalperson, cameperson)
    private static int getPositiveIntegerInput(String prompt) {
        int input;
        while (true) {
            System.out.print(prompt);
            while (!sc.hasNextInt()) {
                System.out.print("Invalid Input! Please enter only numbers: ");
                sc.next(); // Consume the invalid token
                System.out.print(prompt); // Re-print prompt
            }
            input = sc.nextInt();
            if (input > 0) {
                return input;
            } else {
                System.out.print("Invalid Input! Please enter a positive number: ");
            }
        }
    }

    public static void main(String args[]) {
        // No longer need to create a local Scanner instance, use Restro.sc
        // Scanner sc = new Scanner(System.in); 

        Lunch veg = new Lunch();
        Breakfast brkfast = new Breakfast();

        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE
                        + "------------------------Enter your name-------------------------"
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);

        String name;
        while (true) {
            System.out.print("Enter: ");
            name = sc.nextLine(); // Use Restro.sc
            if (name.matches("[A-Za-z ]+")) {
                System.out.println("Valid name: " + name);
                break;
            } else {
                System.out.println("Invalid input! Please use only alphabets.");
            }
        }

        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE
                        + "---------------------Enter your Mobile Number-------------------"
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        String num;
        while (true) {
            System.out.print("Enter : ");
            num = sc.nextLine(); // Use Restro.sc

            if (num.matches("[6-9]\\d{9}")) {
                break;
            } else {
                System.out.println("Invalid input! Please enter a valid 10 digit number.");
            }
        }

        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE
                        + "-----------------------For how many people?---------------------"
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        // Use the new helper method
        int tperson = getPositiveIntegerInput("Enter: ");
        sc.nextLine(); // Consume the leftover newline from getPositiveIntegerInput()

        System.out.println();
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                            JMB Menu                            "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "                                                                "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "            (1)                                    (2)          "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE + "         Lunch Menu                          Breakfast Menu     "
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.println(
                BG_BEIGE + "                                                                " + RESET);
        System.out.print("Enter your Choice: ");
        int chmain = veg.check(2); // Call the modified check method
        sc.nextLine(); // Consume the leftover newline from veg.check()'s nextInt().

        switch (chmain) {

            case 1:
                veg.PrintLunch();
                break;

            case 2:
                brkfast.printBreakfast();
                break;

            default: // Default case is unreachable due to check()
                return;
        }
        System.out.println();
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        System.out.println(
                BG_MAROON + WHITE
                        + "----------------------how many people came?---------------------"
                        + RESET);
        System.out.println(
                BG_BEIGE + "                                                                "
                        + RESET);
        // Use the new helper method
        int cperson = getPositiveIntegerInput("Enter: ");
        sc.nextLine(); // Consume the leftover newline (important if next input is nextLine or program ends)


        Bill billobj = new Bill(name, num, tperson, cperson);
        
        sc.close(); // Close the shared scanner when done
    }
}

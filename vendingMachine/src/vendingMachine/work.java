package vendingMachine;

import javax.swing.JOptionPane;

public class work {

    //setting up multi denominational arryas of type string,double and integer and assigning them values 
    public static String[][] name = {{"Large Cheese and Tomato", "Large New Yorker", "Large Italiano", "Large Vegi Supreme", "Large Chicken Feast", "Large American Hot", "Large Peproni", "Large Sizzler", "Large Meatilicious"},
    {"Medium Cheese and Tomato", "Medium New Yorker", "Medium Italiano", "Medium Vegi Supreme", "Medium Chicken Feast", "Medium American Hot", "Medium Peproni", "Medium Sizzler", "Medium Meatilicious"},
    {"Small Cheese and Tomato", "Small New Yorker", "Small Italiano", "Small Vegi Supreme", "Small Chicken Feast", "Small American Hot", "Small Peproni", "Small Sizzler", "Small Meatilicious"},
    {"Chicken Wings", "Chicken Strippers", "Frank's Hot Wings", "BBQ Wings", "Chicken Kikers", "Strippers Combo"},
    {"Wedges", "Garlic Pizza Bread", "Ham Twisted Dough Balls", "Cheese Twisted Dough Balls", "Peproni Twisted Dough Balls"},
    {"BBQ Dip 25g", "Garlic Dip 25g", "Sweet Chilli Dip 25g", "Honey Musterd Dip 25g", "Frank's Hot Dip 25g", "Garlic Dip 100g", "BBQ Dip 100g", "Frank's Hot Dip 100g"},
    {"Can of Coke", "Can of Fanta", "Can of Sprite", "Can of Pepsi", "Bottle of Water", "Capri Sun"}, {"Cookies", "Brownies", "Chocolate Twisted Dough Balls", "Ice Cream"}};
    public static int[][] quantity = {{1, 1, 1, 1, 1, 1, 1, 1, 1}, {2, 2, 1, 1, 1, 1, 1, 1, 2}, {2, 1, 1, 1, 1, 1, 1, 1, 2},
    {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 2}, {1, 1, 1, 2, 1}};
    public static int[][] quantityPurchased = {{0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
    public static double[][] price = {{17.0, 23.0, 18.0, 21.0, 20.0, 19.0, 16.0, 15.71, 17.20}, {16.0, 15.71, 17.0, 23.80, 20.0, 17.50, 17.9, 16.7, 19.0}, {11.0, 12.50, 13.7, 14.44, 10.99, 9.50, 13.77, 16.0, 15.0},
    {5.50, 4, 6.99, 4.50, 3.0, 6.50}, {4.5, 4.0, 3.0, 4.50, 3.25}, {0.50, 0.55, 0.46, 0.60, 0.55, 1.00, 1.10, 1.25}, {1.25, 1.30, 1.20, 1.00, 0.90, 0.75}, {1.80, 2.00, 1.75, 2.6, 1.99}};
    //setting up arrays of type string,double and integer and assign them values
    public static double[] value = {50.0, 20.0, 10.0, 5.0, 2.0, 1.0, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};
    public static int[] moneyStock = {5, 0, 40, 20, 11, 7, 15, 20, 13, 70, 185, 100};
    public static int[] changeStock = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    //setting up variables of type double and integer
    public static double purchase = 0.0;
    public static double amountPaid = 0.0;
    public static int i;
    public static double machineMoney = 0.0;

    //moneyInMachine is a public method of type double which required double value and it returns double value. 
    public static double moneyInMachine(double money) {
        money = value[0] * moneyStock[0] + value[1] * moneyStock[1] + value[2] * moneyStock[2] + value[3] * moneyStock[3] + value[4] * moneyStock[4]
                + value[5] * moneyStock[5] + value[6] * moneyStock[6] + value[7] * moneyStock[7] + value[8] * moneyStock[8] + value[9] * moneyStock[9]
                + value[10] * moneyStock[10] + value[11] * moneyStock[11];
        return money;
    }

    //Cstock is a public method of type integer where change given to customer is set back to 0.
    //it returns a integer value
    public static int Cstock() {
        for (i = 0; i < 1; i++) {
            changeStock[0] = 0;
            changeStock[1] = 0;
            changeStock[2] = 0;
            changeStock[3] = 0;
            changeStock[4] = 0;
            changeStock[5] = 0;
            changeStock[6] = 0;
            changeStock[7] = 0;
            changeStock[8] = 0;
            changeStock[9] = 0;
            changeStock[10] = 0;
            changeStock[11] = 0;
            purchase = 0.0;
        }
        return changeStock[i];
    }

    //PQ is a public method of type integer where product quantity purchased by customer is set back to 0.
    //it returns a integer value
    public static int PQ() {
        for (i = 0; i < 1; i++) {
            quantityPurchased[0][0] = 0;
            quantityPurchased[0][1] = 0;
            quantityPurchased[0][2] = 0;
            quantityPurchased[0][3] = 0;
            quantityPurchased[0][4] = 0;
            quantityPurchased[0][5] = 0;
            quantityPurchased[0][6] = 0;
            quantityPurchased[0][7] = 0;
            quantityPurchased[0][8] = 0;

            quantityPurchased[1][0] = 0;
            quantityPurchased[1][1] = 0;
            quantityPurchased[1][2] = 0;
            quantityPurchased[1][3] = 0;
            quantityPurchased[1][4] = 0;
            quantityPurchased[1][5] = 0;
            quantityPurchased[1][6] = 0;
            quantityPurchased[1][7] = 0;
            quantityPurchased[1][8] = 0;

            quantityPurchased[2][0] = 0;
            quantityPurchased[2][1] = 0;
            quantityPurchased[2][2] = 0;
            quantityPurchased[2][3] = 0;
            quantityPurchased[2][4] = 0;
            quantityPurchased[2][5] = 0;
            quantityPurchased[2][6] = 0;
            quantityPurchased[2][7] = 0;
            quantityPurchased[2][8] = 0;

            quantityPurchased[3][0] = 0;
            quantityPurchased[3][1] = 0;
            quantityPurchased[3][2] = 0;
            quantityPurchased[3][3] = 0;
            quantityPurchased[3][4] = 0;
            quantityPurchased[3][5] = 0;

            quantityPurchased[4][0] = 0;
            quantityPurchased[4][1] = 0;
            quantityPurchased[4][2] = 0;
            quantityPurchased[4][3] = 0;
            quantityPurchased[4][4] = 0;

            quantityPurchased[5][0] = 0;
            quantityPurchased[5][1] = 0;
            quantityPurchased[5][2] = 0;
            quantityPurchased[5][3] = 0;
            quantityPurchased[5][4] = 0;
            quantityPurchased[5][5] = 0;
            quantityPurchased[5][6] = 0;
            quantityPurchased[5][7] = 0;

            quantityPurchased[6][0] = 0;
            quantityPurchased[6][1] = 0;
            quantityPurchased[6][2] = 0;
            quantityPurchased[6][3] = 0;
            quantityPurchased[6][4] = 0;
            quantityPurchased[6][5] = 0;

            quantityPurchased[7][0] = 0;
            quantityPurchased[7][1] = 0;
            quantityPurchased[7][2] = 0;
            quantityPurchased[7][3] = 0;
            quantityPurchased[7][4] = 0;
        }
        return quantityPurchased[i][i];
    }

    //method is a public method of type integer and returns a integer value
    public static int method(java.awt.List l, javax.swing.JTextField d, String n, int Quantity, double price, int row, int column) {
        purchase = Math.round(purchase * 100) / 100.0;
        price = Math.round(price * 100) / 100.0;
        amountPaid = Math.round(amountPaid * 100) / 100.0;
        if (Quantity > 0) {
            if (amountPaid >= price) {
                l.add(n);
                purchase += price;
                d.setText(Double.toString(Math.round(purchase * 100) / 100.0));
                Quantity--;
                quantityPurchased[row][column]++;
                amountPaid = amountPaid - price;
                //If amount inserted in less tha the price of a product
            } else if (amountPaid < price) {
                double remainder = price - amountPaid;
                remainder = Math.round(remainder * 100) / 100.0;
                JOptionPane.showMessageDialog(null, "Enter €" + remainder + " To Buy This Item");
                Payment p = new Payment();
                p.setVisible(true);
            }
            //if quantity of product stock is not greater than zero
        } else if (!(Quantity > 0)) {
            JOptionPane.showMessageDialog(null, "Out Of Stock");
        }
        return Quantity;
    }

    //change is a public method of type integer which requires double and integer values and returns a integer value.
    public static int change(double change, double coinvalue, int stock, int cstock) {
        for (i = 0; i < 1; i++) {
            amountPaid = amountPaid - coinvalue;
            cstock++;
            //if money type(50,20,10.....) in machine is out of stock
            if (!(stock > 0)) {
                value[i] = value[i++];
                moneyStock[i] = moneyStock[i++];
                changeStock[i] = changeStock[i++];
            }
        }
        return cstock;
    }

    //money is public method of type double which requires no value but returs a integer value.
    public static double money() {
        amountPaid = Math.round(amountPaid * 100) / 100.0;
        if (amountPaid >= value[0] && moneyStock[0] > 0) {
            changeStock[0] = change(amountPaid, value[0], moneyStock[i], changeStock[0]);
            moneyStock[0]--;
        } else if (amountPaid >= value[1] && moneyStock[1] > 0) {
            changeStock[1] = change(amountPaid, value[1], moneyStock[i], changeStock[1]);
            moneyStock[1]--;
        } else if (amountPaid >= value[2] && moneyStock[2] > 0) {
            changeStock[2] = change(amountPaid, value[2], moneyStock[i], changeStock[2]);
            moneyStock[2]--;
        } else if (amountPaid >= value[3] && moneyStock[3] > 0) {
            changeStock[3] = change(amountPaid, value[3], moneyStock[i], changeStock[3]);
            moneyStock[3]--;
        } else if (amountPaid >= value[4] && moneyStock[4] > 0) {
            changeStock[4] = change(amountPaid, value[4], moneyStock[i], changeStock[4]);
            moneyStock[4]--;
        } else if (amountPaid >= value[5] && moneyStock[5] > 0) {
            changeStock[5] = change(amountPaid, value[5], moneyStock[i], changeStock[5]);
            moneyStock[5]--;
        } else if (amountPaid >= value[6] && moneyStock[6] > 0) {
            changeStock[6] = change(amountPaid, value[6], moneyStock[i], changeStock[6]);
            moneyStock[6]--;
        } else if (amountPaid >= value[7] && moneyStock[7] > 0) {
            changeStock[7] = change(amountPaid, value[7], moneyStock[i], changeStock[7]);
            moneyStock[7]--;
        } else if (amountPaid >= value[8] && moneyStock[8] > 0) {
            changeStock[8] = change(amountPaid, value[8], moneyStock[i], changeStock[8]);
            moneyStock[8]--;
        } else if (amountPaid >= value[9] && moneyStock[9] > 0) {
            changeStock[9] = change(amountPaid, value[9], moneyStock[i], changeStock[9]);
            moneyStock[9]--;
        } else if (amountPaid >= value[10] && moneyStock[10] > 0) {
            changeStock[10] = change(amountPaid, value[10], moneyStock[i], changeStock[10]);
            moneyStock[10]--;
        } else if (amountPaid > 0 && moneyStock[11] > 0) {
            changeStock[11] = change(amountPaid, value[11], moneyStock[i], changeStock[11]);
            moneyStock[11]--;
        }

        return moneyStock[i];
    }

    //refund is a public method of type double where product quantity purchased by a customer is added back to the original product stock.
    //it returns a double value
    public static double refund() {

        quantity[0][0] += quantityPurchased[0][0];
        quantity[0][1] += quantityPurchased[0][1];
        quantity[0][2] += quantityPurchased[0][2];
        quantity[0][3] += quantityPurchased[0][3];
        quantity[0][4] += quantityPurchased[0][4];
        quantity[0][5] += quantityPurchased[0][5];
        quantity[0][6] += quantityPurchased[0][6];
        quantity[0][7] += quantityPurchased[0][7];
        quantity[0][8] += quantityPurchased[0][8];

        quantity[1][0] += quantityPurchased[1][0];
        quantity[1][1] += quantityPurchased[1][1];
        quantity[1][2] += quantityPurchased[1][2];
        quantity[1][3] += quantityPurchased[1][3];
        quantity[1][4] += quantityPurchased[1][4];
        quantity[1][5] += quantityPurchased[1][5];
        quantity[1][6] += quantityPurchased[1][6];
        quantity[1][7] += quantityPurchased[1][7];
        quantity[1][8] += quantityPurchased[1][8];

        quantity[2][0] += quantityPurchased[2][0];
        quantity[2][1] += quantityPurchased[2][1];
        quantity[2][2] += quantityPurchased[2][2];
        quantity[2][3] += quantityPurchased[2][3];
        quantity[2][4] += quantityPurchased[2][4];
        quantity[2][5] += quantityPurchased[2][5];
        quantity[2][6] += quantityPurchased[2][6];
        quantity[2][7] += quantityPurchased[2][7];
        quantity[2][8] += quantityPurchased[2][8];

        quantity[3][0] += quantityPurchased[3][0];
        quantity[3][1] += quantityPurchased[3][1];
        quantity[3][2] += quantityPurchased[3][2];
        quantity[3][3] += quantityPurchased[3][3];
        quantity[3][4] += quantityPurchased[3][4];
        quantity[3][5] += quantityPurchased[3][5];

        quantity[4][0] += quantityPurchased[4][0];
        quantity[4][1] += quantityPurchased[4][1];
        quantity[4][2] += quantityPurchased[4][2];
        quantity[4][3] += quantityPurchased[4][3];
        quantity[4][4] += quantityPurchased[4][4];

        quantity[5][0] += quantityPurchased[5][0];
        quantity[5][1] += quantityPurchased[5][1];
        quantity[5][2] += quantityPurchased[5][2];
        quantity[5][3] += quantityPurchased[5][3];
        quantity[5][4] += quantityPurchased[5][4];
        quantity[5][5] += quantityPurchased[5][5];
        quantity[5][6] += quantityPurchased[5][6];
        quantity[5][7] += quantityPurchased[5][7];

        quantity[6][0] += quantityPurchased[6][0];
        quantity[6][1] += quantityPurchased[6][1];
        quantity[6][2] += quantityPurchased[6][2];
        quantity[6][3] += quantityPurchased[6][3];
        quantity[6][4] += quantityPurchased[6][4];
        quantity[6][5] += quantityPurchased[6][5];

        quantity[7][0] += quantityPurchased[7][0];
        quantity[7][1] += quantityPurchased[7][1];
        quantity[7][2] += quantityPurchased[7][2];
        quantity[7][3] += quantityPurchased[7][3];
        quantity[7][4] += quantityPurchased[7][4];

        return amountPaid;
    }

    //stockIncrement is a public method of type integer where quantity increases by 1 every time and returns integer value.
    public static int stockIncrement(int quantity, javax.swing.JTextField p) {
        quantity++;
        p.setText(Integer.toString(quantity));
        return quantity;
    }

    //stockDecrement is a public method of type integer where quantity decreases by 1 every time and returns integer value.
    public static int stockDecrement(int quantity, javax.swing.JTextField p) {
        quantity--;
        if (quantity < 0) {
            quantity = 0;
        }
        p.setText(Integer.toString(quantity));
        return quantity;
    }

    //priceIncrement is a public method of type double where price increases by entered value in jTextField and returns double value.
    public static double priceIncrement(double price, javax.swing.JTextField enteredPrice, javax.swing.JTextField display) {
        price += Double.parseDouble(enteredPrice.getText());
        price = Math.round(price * 100) / 100.0;
        display.setText("€" + Double.toString(price));
        return price;
    }

    //priceDecrement is a public method of type double where price decreases by entered value in jTextField and returns double value.
    public static double priceDecrement(double price, javax.swing.JTextField enteredPrice, javax.swing.JTextField display) {
        price = price - Double.parseDouble(enteredPrice.getText());
        price = Math.round(price * 100) / 100.0;
        if (price < 0.0) {
            price = 0.0;
        }
        display.setText("€" + Double.toString(price));
        return price;
    }
}

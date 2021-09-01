/* Define a class ‘product’ with data members pcode, pname and price. Create 3 objects of
the class and find the product having the lowest price.*/

class Pro {
    int pcode;
    String pname;
    double price;

    Pro(int pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    String lowest(Pro p1, Pro p2, Pro p3) {
        if (p1.price < p2.price) {
            if (p1.price < p3.price) {
                return p1.pname;
            } else {
                return p3.pname;
            }
        } else {
            if (p2.price < p3.price) {
                return p2.pname;
            } else {
                return p3.pname;
            }
        }

    }
}

public class product {
    public static void main(String[] args) {
        Pro product1 = new Pro(001, "Mouse", 349.40);
        Pro product2 = new Pro(002, "Key Board", 279.80);
        Pro product3 = new Pro(003, "Speaker", 599.99);

        String low = product1.lowest(product1, product2, product3);
        System.out.println("The product having lowest price is : " + low);
    }
}
// Add complex numbers

class Com {
    int real;
    int image;

    Com(int real, int image) {
        this.real = real;
        this.image = image;
    }

    void result(Com n1, Com n2) {
        int RealRes = n1.real + n2.real;
        int ImageRes = n1.image + n2.image;

        System.out.println("The First Complex number is : " + n1.real + " + i" + n1.image);
        System.out.println("The Second Complex number is : " + n2.real + " + i" + n2.image);

        System.out.println("The Sum of two Complex numbers is : " + RealRes + " + i" + ImageRes);

    }
}

public class Complex {
    public static void main(String[] args) {
        Com myCom1 = new Com(5, 3);
        Com myCom2 = new Com(3, 2);

        myCom1.result(myCom1, myCom2);

    }
}
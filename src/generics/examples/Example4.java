package generics.examples;

// In this version of NumericFns, the type argument
// for T must be either Number, or a class derived
// from Number.
class NumericFns2<T extends Number> {
    T num;

    // Pass the constructor a reference to
    // a numeric object.
    NumericFns2(T n) {
        num = n;
    }

    // Return the reciprocal.
    int reciprocal() {
        return 1 / num.intValue();
    }

    boolean absEqual(NumericFns2<?> ob) {
        if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())) return true;

        return false;
    }

    // Return the fractional component.
    double fraction() {
        return num.doubleValue() - num.intValue();
    }

    // ...
}

// Demonstrate NumericFns.
class BoundsDemo {
    public static void main(String args[]) {

        NumericFns2<Integer> iOb = new NumericFns2<>(5);        //java8 you dont need to re write integer in the <>

        System.out.println("Reciprocal of iOb is " +
                iOb.reciprocal());
        System.out.println("Fractional component of iOb is " +
                iOb.fraction());

        System.out.println();

        NumericFns2<Double> dOb = new NumericFns2<Double>(5.0);
        System.out.println(dOb.absEqual(dOb));

        System.out.println("Reciprocal of dOb is " +
                dOb.reciprocal());
        System.out.println("Fractional component of dOb is " +
                dOb.fraction());


        // This won't compile because String is not a
        // subclass of Number.
//    NumericFns<String> strOb = new NumericFns<String>("Error");
    }
}
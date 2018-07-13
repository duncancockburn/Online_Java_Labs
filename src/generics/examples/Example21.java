package generics.examples;
//method is if you want to perform a task on various number of data types where as a class is if you need a structure
//of an object for various actions


// Generics and arrays.
class Gen5<T extends Number> {

    T ob;

    T vals[]; // OK

    Gen5(T ob, T[] nums) {
        this.ob = ob;

        // This statement is illegal.
//  vals = new T[10]; // can't create an array of T

        // But, this statement is OK.
        vals = nums; // OK to assign reference to existent array
    }
}

class GenArrays {
    public static void main(String args[]) {
        Integer n[] = { 1, 2, 3, 4, 5 };

        Gen5<Integer> iOb = new Gen5<>(50, n);

        // Can't create an array of type-specific generic references.
        // Gen<Integer> gens[] = new Gen<Integer>[10]; // Wrong!

        Gen5<?> gens[] = new Gen5<?>[10];
        // This is OK.

        // OK
    }
}
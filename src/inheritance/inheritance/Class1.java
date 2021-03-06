package inheritance.inheritance;

//The inherited fields can be used directly, just like any other fields.
//You can declare a field in the subclass with the same name as the one in the superclass, thus hiding it (not recommended).
//You can declare new fields in the subclass that are not in the superclass.
//The inherited methods can be used directly as they are.
//You can write a new instance method in the subclass that has the same signature as the one in the superclass, thus overriding it.
//You can write a new static method in the subclass that has the same signature as the one in the superclass, thus hiding it.
//You can declare new methods in the subclass that are not in the superclass.
//You can write a subclass constructor that invokes the constructor of the superclass, either implicitly or by using the keyword super.

//A subclass does not inherit the private members of its parent class. However, if the superclass has public or
// protected methods for accessing its private fields, these can also be used by the subclass.


class B extends A {


    public B() {
        super(3, 5, 7, 3);

    }

    public B(String e) {

        super("Hello");
    }
}
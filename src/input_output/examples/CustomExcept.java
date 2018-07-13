package input_output.examples;

public class CustomExcept extends Exception {
    @Override
    public String toString() {
        return "this is not okay";
    }
}

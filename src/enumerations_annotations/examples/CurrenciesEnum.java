package enumerations_annotations.examples;

public enum CurrenciesEnum {
    BITCOIN (10, "Duncan"), ETHERIUM (5, "Andrew"), USD (1, "Hannah") ;
    int value;

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    String creator;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    CurrenciesEnum(int d, String creator) {
        value = d;
        creator = creator;
    }
}



    class Controller{
    public static void main(String[] args) {
        //CurrenciesEnum currencies = CurrenciesEnum.BITCOIN = 10
                //not private so can assign value
        for (CurrenciesEnum d: CurrenciesEnum.values()
             ) {
            System.out.println(d);
            System.out.println(d.getValue());

        }

    }
}

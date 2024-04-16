final class FinalClass {
    // Final class members and methods
    private final int value;

    public FinalClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

// This class cannot inherit from FinalClass because FinalClass is final
// class CannotExtendFinalClass extends FinalClass {} // This line will cause a compilation error

public class Practical21 {
    public static void main(String[] args) {
        FinalClass finalObj = new FinalClass(10);
        System.out.println("Value: " + finalObj.getValue());
    }
}

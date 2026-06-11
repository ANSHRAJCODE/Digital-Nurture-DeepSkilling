package Week_1_Engineering_Concepts.DesignPatternsMaster;

// Save as Computer.java
public class Computer {
    private String CPU; private String RAM; private String Storage;

    private Computer(Builder builder) {
        this.CPU = builder.CPU; this.RAM = builder.RAM; this.Storage = builder.Storage;
    }
    public void show() { System.out.println("Computer: " + CPU + ", " + RAM + ", " + Storage); }

    public static class Builder {
        private String CPU; private String RAM; private String Storage;
        public Builder setCPU(String cpu) { this.CPU = cpu; return this; }
        public Builder setRAM(String ram) { this.RAM = ram; return this; }
        public Builder setStorage(String storage) { this.Storage = storage; return this; }
        public Computer build() { return new Computer(this); }
    }
}
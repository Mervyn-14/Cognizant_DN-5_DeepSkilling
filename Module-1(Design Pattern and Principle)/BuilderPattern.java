class Computer {

    private String cpu;
    private String ram;
    private String storage;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
    }

    public void display() {
        System.out.println("CPU: "+cpu);
        System.out.println("RAM: "+ram);
        System.out.println("Storage: "+storage);
    }

    public static class Builder {

        private String cpu;
        private String ram;
        private String storage;

        public Builder setCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder setRAM(String ram) {
            this.ram = ram;
            return this;
        }
        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
}

public class BuilderPattern {
    public static void main(String[] args) {

        Computer gamingPC = new Computer.Builder()
                .setCPU("Ryzen7")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .build();

        Computer officePC = new Computer.Builder()
                .setCPU("intel ultra 5")
                .setRAM("8GB")
                .setStorage("512GB SSD")
                .build();

        System.out.println("Gaming PC:");
        gamingPC.display();

        System.out.println();

        System.out.println("Office PC:");
        officePC.display();
    }
}
/*Create CPU with attribute price. Create inner class Processor (no. of cores, manufacturer)
and static nested class RAM (memory, manufacturer). Create an object of CPU and print
information of Processor and RAM.*/

public class CPU {
    int price = 17500;

    class Processor {
        int no_of_cores = 2;
        String manufaturer = "Intel";
    }

    static class RAM {
        int memory = 8;
        String manufaturer = "Micron";
    }

    public static void main(String[] args) {
        CPU cpu = new CPU();
        CPU.Processor processor = cpu.new Processor();
        RAM ram = new RAM();
        System.out.println("CPU price : " + cpu.price);
        System.out.println("Processor Manufacturer : " + processor.manufaturer);
        System.out.println("Number of core is  : " + processor.no_of_cores);
        System.out.println("RAM Manufacturer : " + ram.manufaturer);
        System.out.println("RAM Size : " + ram.memory + " GB");

    }
}
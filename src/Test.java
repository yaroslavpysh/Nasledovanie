public class Test {
    public String processor;
    public int ram;
    public int hdd;
   public  int resource;
    public Test(String processor, int ram, int hdd, int resource) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.resource = resource;
    }

    @Override
    public String toString() {
        return "Test{" +
                "processor='" + processor + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", resource=" + resource +
                '}';
    }
}

public class Test2 extends Test {

         public Test2(String processor, int ram, int hdd, int resource){
             super(processor, ram, hdd, resource);


        }

    public static void main(String[] args) {
        Test2 a = new Test2("intel", 23,32,42);
        System.out.println(a.toString());


    }


    }


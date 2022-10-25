public class Hangar {

    public static void main(String[] args) {
        Car clio = new Car("clio",100);
        Boat yacht = new Boat("yacht", 1000);
        Car ferrari = new Car("ferrari",100);

        System.out.println(clio.doStuff());
        System.out.println(yacht.doStuff());
        System.out.println(ferrari.doStuff());

    }
    
}
public class Main {

  public static void main(String[] args) {
    Car car1 = new Car();
    Car car2 = new Car(1999);
    Car car3 = new Car("Green", 2007);

    System.out.println("Цвет первой машины: " + car1.color + "Год первой машины: " + car1.year);
    System.out.println("Цвет первой машины: " + car2.color + "Год первой машины: " + car2.year);
    System.out.println("Цвет первой машины: " + car3.color + "Год первой машины: " + car3.year);
  }
}

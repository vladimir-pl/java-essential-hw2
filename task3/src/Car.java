public class Car {

  int year, weight;
  double speed;
  String color;

  Car(){
    year = 1992;
    speed = 180.2;
    weight = 1500;
    color = "white";
  }

  Car(int year){
    this.year = year;
    speed = 190.5;
    weight = 1300;
    color = "red";
  }

  Car(int year, double speed){
    this.year = year;
    this.speed = speed;
    weight = 1700;
    color = "black";
  }

  Car(int year, double speed, int weight){
    this.year = year;
    this.speed = speed;
    this.weight = weight;
    color = "blue";
  }

  Car(int year, double speed, int weight, String color){
    this.year = year;
    this.speed = speed;
    this.weight = weight;
    this.color = color;
  }

  @Override
  public String toString() {
    return "year = " + year + " speed = " + speed + " weight = " + weight + " color = " + color;
  }
}

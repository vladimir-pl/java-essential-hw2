public class Car {

  int year;
  String color;

  Car(){
    year = 2010;
    color = "Pink";
  }

  Car(int year){
    this.year = year;
    color = "green";
  }

  Car(String color, int year){
    this.year = year;
    this.color = color;
  }
}

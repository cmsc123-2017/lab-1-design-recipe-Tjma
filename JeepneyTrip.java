class JeepneyTrip {
  double distance;
  int totalPassengers;
  int discountPassengers;
  
  // constant
  final int BASE_KM = 5;
  final double EXCESS_FARE = 0.5;
  final int FARE_BASE = 7;
  final int FARE_DISCOUNT = 6;
  
  
  JeepneyTrip(double distance, int totalPassengers, int discountPassengers) {
    this.distance = distance;
    this.totalPassengers = totalPassengers;
    this.discountPassengers = discountPassengers;
  }


  // -> double
  // Returns a value if there's any excess distance travelledby the passenger.
  // Returns 0 if the passenger's excess distace is not more than the base_km

  double excessDistance(){
    if(distance <= BASE_KM){
      return 0;
    } else {
      return distance - BASE_KM;
    }
  }

  // int, double, double -> double
  // Returns the total fare to be paid by the passengers( for with discount and without.)
  double computeFare(int totalPassengers, double fare, double distance) {
    return totalPassengers * (fare + (excessDistance() * EXCESS_FARE)) ;
  }
  
  // int, int, double -> double
  // Returns the sum of the fare of the passengers (both with discount and without)
  double totalFare(int totalPassengers, int discountPassengers, double distance) {
    return computeFare(totalPassengers - discountPassengers, FARE_BASE, distance)
      + computeFare(discountPassengers, FARE_DISCOUNT, distance);
  }
  
  // ->double
  // Returns the difference between the payment of the passengers and the total expense of the trip
  double fareChange(double payment) {
    return payment - totalFare(totalPassengers,discountPassengers,distance);
  }
}
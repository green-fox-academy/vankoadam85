public class Station {

  int gasAmount;

  public int refill (Car car) {
    this.gasAmount -= (car.capacity - car.gasAmount);
    car.gasAmount = car.capacity;
    return this.gasAmount;
  }

}

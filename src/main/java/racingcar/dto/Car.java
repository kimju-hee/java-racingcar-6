package racingcar.dto;

public class Car {
    private final String carName;
    private int position;

    public Car(String carName, int position) {
        this.carName = carName;
        this.position = position;
    }

    public String getCarName() {
        return carName;
    }

    public int getPosition() {
        return position;
    }

    public int moveCar() {
        return position ++;
    }

    @Override
    public String toString() {
        return "carName: "+this.carName;
    }
}

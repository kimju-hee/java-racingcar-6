package racingcar.controller;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import racingcar.dto.Car;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class CarController {
    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();
    private final List<Car> cars = new ArrayList<>();
    private int count;

    public void start() {
        inputStart();
        inputCount();
        playGame();
    }

    public void inputStart() {
        outputView.printCarNameInputText();
        String nameString = inputView.carInput();

        String[] nameList = nameString.split(",");

        for (String name : nameList) {
            cars.add(new Car(name.trim(), 0));
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    public void inputCount() {
        outputView.printAdvanceNumberInputText();
        count = Integer.parseInt(inputView.countInput());
    }

    public void playGame() {
        outputView.printResult();
        int number = 0;
        while (number < count) {
            for (Car car: cars) {
                carMove(car, car.getCarName());
                outputView.printCarPosition(car.getCarName(), car.getPosition());
            }
            System.out.println();
            number += 1;
        }
    }

    public void carMove(Car car, String carName) {
        int randomNum = Randoms.pickNumberInRange(0,9);
        if (randomNum >= 4) {
            car.moveCar();
        }
    }
}

package racingcar.controller;

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
        System.out.println(count);
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
}

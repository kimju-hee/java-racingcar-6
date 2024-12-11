package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.view.validation.AdvanceCountValidator;
import racingcar.view.validation.CarNameValidator;

public class InputView {

    public String carInput() {
        String carName = Console.readLine();
        CarNameValidator.validator(carName);
        return carName;
    }

    public String countInput() {
        String advanceCount = Console.readLine();
        AdvanceCountValidator.validator(advanceCount);
        return advanceCount;
    }
}

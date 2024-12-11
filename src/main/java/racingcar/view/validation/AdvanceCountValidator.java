package racingcar.view.validation;

public class AdvanceCountValidator {
    public static void validator(String input) {
        isNumeric(input);
    }

    public static void isNumeric(String input) {
        if (!input.matches("^[0-9]*$")) {
            throwError();
        }
    }

    private static void throwError() {
        throw new IllegalArgumentException(ErrorMessage.INVALID_NUMBER.getMessage());
    }
}

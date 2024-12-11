package racingcar.view.validation;

public class CarNameValidator {

    public static void validator(String input) {
        String[] carInput = input.split(",");
        isValidString(carInput);
    }

    public static void isValidString(String[] string) {
        for (String str : string) {
            if (!str.matches("^[a-zA-Z]*$")) {
                throwError();
            }
        }
    }

    private static void throwError() {
        throw new IllegalArgumentException(ErrorMessage.INVALID_STRING.getMessage());
    }
}

package racingcar.view.validation;

public enum ErrorMessage {
    INVALID_STRING("자동차 이름은 영어로만 이루어져야 합니다."),
    INVALID_NUMBER("횟수 입력은 숫자로만 이루어져야 합니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

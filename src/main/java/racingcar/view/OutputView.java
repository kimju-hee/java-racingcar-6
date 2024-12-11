package racingcar.view;

import java.util.List;

public class OutputView {

    public void printCarNameInputText() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public void printAdvanceNumberInputText() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public void printResult() {
        System.out.println("실행 결과");
    }

    public void printCarPosition(String name, int position) {
        String p = printPosition(position);
        System.out.println(name + " : " + p);
    }

    public String printPosition(int position) {
        String p = "";
        for (int i = 0; i < position; i ++) {
            p += "-";
        } return p;
    }

    public void printWinner(List<String> winners) {
        String winn = "최종 우승자 : " + String.join(", ", winners);
        System.out.print(winn);
    }
}

package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {

        System.out.println(text[index(number)]);
    }

    int index(int i) {
        return 1 + (i>>31) - (-i>>31);
    }

    String[] text = {"false", "false", "true"};
}

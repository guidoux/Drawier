package drawier;

public class Drawier {
    public static void main(String[] args) {
        System.out.println('*');
    }

    public char asterisk() {
        return '*';
    }

    public String drawLine(int size) {
        String line = "";
        for(int i=0; i<size; i++) {
            line += '*';
        }
        return line;
    }
}

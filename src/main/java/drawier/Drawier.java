package drawier;

public class Drawier {

    public static void main(String[] args) {
        Drawier drawier = new Drawier();
        System.out.println("Triangle Exercises:");
        System.out.println("1- The easiest exercise ever:");
        System.out.println(drawier.asterisk());
        System.out.println("2- Draw horizontal line:");
        System.out.println(drawier.drawLine(3));
        System.out.println("3- Draw vertical line:");
        drawier.printAnAsteriskPerLine(3);
        System.out.println("4- Draw a right triangle:");
        drawier.printRightTriangle(3);
    }

    public Drawier() {}

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

    public void printAnAsteriskPerLine(int numberOfLines) {
        for(int i=0; i<numberOfLines; i++) {
            System.out.println('*');
        }
    }

    public void printRightTriangle(int numberOfLines) {
        for(int i=1; i<=numberOfLines; i++) {
            System.out.println(drawLine(i));
        }
    }
}

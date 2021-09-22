package lab1;

// import jdk.jfr.Unsigned;

public class args {
    public static void main(String[] args) {
        for(var i=0; i < args.length; i++) { //аргументы командной строки
            System.out.println(String.format("Argument %d: %s", i, args[i]));
        }
    }
}

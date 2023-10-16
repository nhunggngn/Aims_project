package Lab_01;
import java.util.Scanner;
public class InputFromKeyboard {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Nguyen Thi Nhung 20215109 - What's your name?");
        String strName = keyboard.nextLine();
        System.out.println("Nguyen Thi Nhung 20215109 - How old are you?");
        int iAge = keyboard.nextInt();
        System.out.println("Nguyen Thi Nhung 20215109 - How tall are you (m)?");
        double dHeight = keyboard.nextDouble();
        //similar to other data types
        //nextByte(),nextShort(),nextLong()
        //nextFloat(),nextBoolean()
        System.out.println("Mrs/Ms. " + strName + ", " + iAge + " years old." +
                " Your height is " + dHeight + ".");
    }
}


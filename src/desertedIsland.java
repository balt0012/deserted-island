import java.util.Scanner;

public class desertedIsland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] options = {"kæreste","kaffemaskine","Netflix","sofa","løbesko","guitar","slik", "hund", "bog", "øl"};
       int[] choiceFrequency = {0,0,0,0,0,0,0,0,0,0};
        System.out.println("hvilken ting vil du helst have med på en øde ø?");
        for (int i = 0; i < options.length; i++) {
            System.out.println(i+1 + " " + options[i]);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("indtast valg: ");
            int userChoice = scanner.nextInt();
            System.out.println(options[userChoice-1]);
            choiceFrequency[userChoice - 1] += 1;

        }
        System.out.print("[" + choiceFrequency[0]);
        for (int i = 1; i < 10; i++) {
            System.out.print(", " + choiceFrequency[i]);
        }
        int highNumber = highestNumber(choiceFrequency);
        System.out.println("]");
        System.out.println("mest populære valg er " + options[highNumber] + " " + choiceFrequency[highNumber]);
    }

    public static int highestNumber (int[] arrayToCheck){
        int highNumber = 0;
        for (int i = 1; i < arrayToCheck.length; i++) {
            if (arrayToCheck[i] > arrayToCheck[i-1]){
                highNumber = i;
            }
            else {
                arrayToCheck[i] = arrayToCheck[i-1];
            }
        }
        return highNumber;
    }
}
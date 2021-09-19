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
            System.out.println("indtast valg: ");
            int userChoice = scanner.nextInt();
            choiceFrequency[userChoice - 1] += 1;
        }
    }
}
import java.util.Scanner;
public class Boredom {
    public static void main(String[] args) {
        /*
        Prepared without using the if function
         */

        Scanner entry = new Scanner(System.in);

        String message1,message2;
        String situation1,situation2,situation3,situation4,situation5,situation6;
        int situation1Degree,situation2Degree,situation3Degree,situation4Degree,situation5Degree;
        int input,control1;

        message1 = "Welcome to boredom buster";
        message2 = "Tell me, what is the temperature outside ? ";

        situation1 = "It's a great time to ski.";
        situation2 = "Movie time";
        situation3 = "Picnic time";
        situation4 = "Swimming time";
        situation5 = "Time to sleep under the blanket";
        situation6 = "Don't go out of the shade, it's best to sip your cold drink in an indoor place";

        System.out.print(message1 + "\n" + message2);
        input = entry.nextInt();

        control1 = (input <= 5) ? 1:0;
        switch (control1){
            case (1):
                System.out.println(situation1);
                break;
        }

        control1 = (input > 5 && input <= 15) ? 1:0;
        switch (control1){
            case (1):
                System.out.println(situation2);
                break;
        }

        control1 = (input > 15 && input < 25) ? 1:0;
        switch (control1){
            case (1):
                System.out.println(situation3);
                break;
        }

        control1 = (input >= 25 && input < 40) ? 1:0;
        switch (control1){
            case (1):
                System.out.println(situation4);
                break;
        }

        control1 = (input < (-10) ) ? 1:0;
        switch (control1){
            case (1):
                System.out.println(situation5);
                break;
        }

        control1 = (input >= 40) ? 1:0;
        switch (control1){
            case (1):
                System.out.println(situation6);
                break;
        }
    }
}

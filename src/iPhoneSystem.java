import java.util.Scanner;

public class iPhoneSystem {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();
        int selectedOption = 0;
        String selectedMusic = "";
        String selectedNumber = "";
        String selectedURL = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n------------- iPhone Menu -------------\n\n");

        do { 
            System.out.println("\n1. Call to a number");
            System.out.println("2. Answer a call");
            System.out.println("3. Start VoiceMessanger");
            System.out.println("4. Play a music");
            System.out.println("5. Start music");
            System.out.println("6. Stop music");
            System.out.println("7. See what's music is playing");
            System.out.println("8. Open URL");
            System.out.println("9. Open new page");
            System.out.println("10. Close last tab");
            System.out.println("11. Close all tabs");
            System.out.println("12. Show general status");
            System.out.println("13. To switch off iPhone");

            System.out.print("\nChoose one of the option above: ");
            selectedOption = scanner.nextInt();

            switch (selectedOption) {
                case 1:
                    System.out.print("\nPlease inform a number: ");
                    selectedNumber = scanner.next();
                    iphone.call(selectedNumber);
                    System.out.println("");
                    break;
                case 2: 
                    iphone.answer();
                    break;
                case 3:
                    iphone.iniciateVoiceMessanger();
                    break;
                case 4:
                    System.out.print("Please select the music: ");
                    selectedMusic = scanner.next();
                    System.out.println("");
                    break;
                case 5:
                    iphone.start();
                    break;
                case 6: 
                    iphone.pause();
                    break;
                case 7:
                    iphone.getMusicPlaying();
                    break;
                case 8: 
                    System.out.print("Please, insert a URL: ");
                    selectedURL = scanner.next();
                    System.out.println("");
                    break;
                case 9:
                    iphone.openNewPage();
                    break;
                case 10: 
                    iphone.closePage();
                    break;
                case 11:
                    iphone.closeAllPages();
                    break;
                case 12:
                    iphone.showStatus();
                    break;
                case 13:
                    break;
                default:
                    System.out.println("Please, insert a valid option");
                    break;
            }


        } while (selectedOption != 13);

    }
}

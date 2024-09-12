import java.util.Scanner;

public class wonders {

    // Method to display information about the Seven Wonders
    private static void displayWonderInfo(int choice) {
        switch (choice) {
            case 1:
                System.out.println("1. Great Wall of China");
                System.out.println("Location: China");
                System.out.println("Description: A series of fortifications made of various materials, stretching over 13,000 miles, built to protect against invasions.");
                break;
            case 2:
                System.out.println("2. Petra");
                System.out.println("Location: Jordan");
                System.out.println("Description: An ancient city famous for its rock-cut architecture and water conduit system, built by the Nabataeans.");
                break;
            case 3:
                System.out.println("3. Christ the Redeemer");
                System.out.println("Location: Brazil");
                System.out.println("Description: A colossal statue of Jesus Christ in Rio de Janeiro, standing 98 feet tall and perched atop a mountain.");
                break;
            case 4:
                System.out.println("4. Machu Picchu");
                System.out.println("Location: Peru");
                System.out.println("Description: An ancient Inca city set high in the Andes Mountains, known for its well-preserved ruins and stunning views.");
                break;
            case 5:
                System.out.println("5. Chichen Itza");
                System.out.println("Location: Mexico");
                System.out.println("Description: A large pre-Columbian archaeological site built by the Maya civilization, famous for the Pyramid of Kukulkan.");
                break;
            case 6:
                System.out.println("6. Colosseum");
                System.out.println("Location: Italy");
                System.out.println("Description: An ancient amphitheater in Rome known for its gladiatorial contests and public spectacles.");
                break;
            case 7:
                System.out.println("7. Taj Mahal");
                System.out.println("Location: India");
                System.out.println("Description: A white marble mausoleum built by Mughal Emperor Shah Jahan in memory of his wife Mumtaz Mahal.");
                break;
            default:
                System.out.println("Invalid choice. Please select a number between 1 and 7.");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Seven Wonders of the World Program!");
        System.out.println("Here are the wonders you can learn about:");
        System.out.println("1. Great Wall of China");
        System.out.println("2. Petra");
        System.out.println("3. Christ the Redeemer");
        System.out.println("4. Machu Picchu");
        System.out.println("5. Chichen Itza");
        System.out.println("6. Colosseum");
        System.out.println("7. Taj Mahal");
        System.out.print("Enter the number of the wonder you want to learn more about: ");
        
        int choice = scanner.nextInt();
        displayWonderInfo(choice);

        scanner.close();
    }
}

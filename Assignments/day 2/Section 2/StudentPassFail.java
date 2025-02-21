import java.util.Scanner;

class StudentPassFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter marks for Subject 1: ");
        int subject1 = scanner.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int subject2 = scanner.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        int subject3 = scanner.nextInt();
        
        int failCount = 0;
        
        if (subject1 < 40) failCount++;
        if (subject2 < 40) failCount++;
        if (subject3 < 40) failCount++;
        
        switch (failCount) {
            case 0:
                System.out.println("Student Passed!");
                break;
            case 1:
            case 2:
            case 3:
                System.out.println("Student Failed in " + failCount + " subjects");
                break;
            default:
                System.out.println("Invalid input.");
        }
        
        scanner.close();
    }
}

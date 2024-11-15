import java.util.Scanner;

class ReportCard {
    String studentName;
    int rollNumber;
    float marksEnglish, marksMath, marksScience, marksSocialStudies, marksLanguage;

    // Constructor to initialize student details
    ReportCard(String name, int rollNo) {
        studentName = name;
        rollNumber = rollNo;
    }

    // Method to input marks
    void inputMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for English:");
        marksEnglish = sc.nextFloat();

        System.out.println("Enter marks for Math:");
        marksMath = sc.nextFloat();

        System.out.println("Enter marks for Science:");
        marksScience = sc.nextFloat();

        System.out.println("Enter marks for Social Studies:");
        marksSocialStudies = sc.nextFloat();

        System.out.println("Enter marks for Language:");
        marksLanguage = sc.nextFloat();
    }

    // Method to calculate total marks
    float calculateTotal() {
        return marksEnglish + marksMath + marksScience + marksSocialStudies + marksLanguage;
    }

    // Method to calculate percentage
    float calculatePercentage() {
        return calculateTotal() / 5;
    }

    // Method to assign grades
    String calculateGrade() {
        float percentage = calculatePercentage();
        if (percentage >= 90)
            return "A+";
        else if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B+";
        else if (percentage >= 60)
            return "B";
        else if (percentage >= 50)
            return "C";
        else
            return "F";
    }

    // Method to display the report card
    void displayReportCard() {
        System.out.println("\n-------- Report Card --------");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Marks in English: " + marksEnglish);
        System.out.println("Marks in Math: " + marksMath);
        System.out.println("Marks in Science: " + marksScience);
        System.out.println("Marks in Social Studies: " + marksSocialStudies);
        System.out.println("Marks in Language: " + marksLanguage);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("Grade: " + calculateGrade());
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input student details
        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        System.out.println("Enter Roll Number:");
        int rollNo = sc.nextInt();

        // Create ReportCard object
        ReportCard report = new ReportCard(name, rollNo);

        // Input marks and display report card
        report.inputMarks();
        report.displayReportCard();
    }
}

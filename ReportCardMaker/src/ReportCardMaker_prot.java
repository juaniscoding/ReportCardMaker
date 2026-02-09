import java.util.Scanner;
class ReportCardMaker_prot{
    static Scanner sc=new Scanner(System.in);
    public void calculate_output(String[] subjects, String[] students, Double[][] marks, int max_mark) {
        System.out.println("\n\n--- GENERATED REPORT CARDS ---");

        // Calculate the maximum possible total marks
        double maximumTotalMarks = subjects.length * max_mark;

        // Loop through each student to generate their report card
        for (int i = 0; i < students.length; i++) {
            double totalMarks = 0;

            System.out.println("---------------------------------------------------------");
            System.out.println("Student: " + students[i]);
            System.out.println("---------------------------------------------------------");
            // Print table header
            System.out.printf("%-20s | %-10s | %-10s | %-12s%n", "Subject", "Mark", "Max Mark", "Percentage");
            System.out.println("---------------------------------------------------------");

            // Loop through each subject for the current student
            for (int j = 0; j < subjects.length; j++) {
                double currentMark = marks[i][j];
                totalMarks += currentMark;
                double subjectPercentage = (currentMark / max_mark) * 100;
                // Print the mark details, including the calculated percentage
                System.out.printf("%-20s | %-10.2f | %-10d | %-12.2f%%%n", subjects[j], currentMark, max_mark, subjectPercentage);
            }

            // Calculate average and total percentage
            double averageMark = totalMarks / subjects.length;
            double totalPercentage = (totalMarks / maximumTotalMarks) * 100;

            // Print totals and average
            System.out.println("---------------------------------------------------------");
            System.out.printf("Total Marks: %.2f / %.2f%n", totalMarks, maximumTotalMarks);
            System.out.printf("Overall Percentage: %.2f%%%n", totalPercentage);
            System.out.printf("Average Mark: %.2f%n", averageMark);
            System.out.println("---------------------------------------------------------\n");
        }
    }
    
    
       public void def_StudentsSubjects(int no_students,int no_subjects, int max_mark){
           String[] students=new String[no_students];
           String[] subjects=new String[no_subjects];
           Double[][] marks=new Double[no_students][no_subjects];

           // --- Get Student Names ---
           System.out.println("--- Enter Student Names ---");
           for(int j=0;j<no_students;j++) {
               System.out.print("Enter name for student #" + (j + 1) + ": ");
               students[j] = sc.nextLine();
           }

           System.out.println();

           // --- Get Subject Names ---
           System.out.println("--- Enter Subject Names ---");
           for (int i=0;i<no_subjects;i++) {
               System.out.print("Enter name for subject #" + (i + 1) + ": ");
               subjects[i] = sc.nextLine();
           }

           System.out.println();

           // --- Get Marks ---
           System.out.println("--- Enter Marks for Each Student ---");
           for (int k=0;k<no_students;k++){
               System.out.println("-> For student: " + students[k]);
               for (int l=0;l<no_subjects;l++){
                   System.out.print("Enter mark for " + students[k] + " in " + subjects[l] + ": ");
                   marks[k][l]=sc.nextDouble();
               }
               // Consume the newline character left in the buffer by nextInt()
               sc.nextLine();
               System.out.println();
           }

           // --- Calculate and Output ---
           calculate_output(subjects, students, marks, max_mark);
       }
      
    
    
    
    
    public static void main(String[] args){
        int no_subjects,no_students;
        System.out.print("Enter no of students: ");
        no_students=sc.nextInt();
        System.out.print("Enter no of subjects: ");
        no_subjects=sc.nextInt();
        System.out.print("Enter maximum mark: ");
        int max_mark=sc.nextInt();

        // Consume the newline character left in the buffer by nextInt()
        sc.nextLine();
        System.out.println();

        ReportCardMaker_prot def=new ReportCardMaker_prot();
        def.def_StudentsSubjects(no_students,no_subjects, max_mark);
        
        
    }
}
/*can calculate percentage 
calculate average
calculate total
calculate any no of students and any no of subjects*/
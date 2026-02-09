import java.util.Scanner;

public class ReportCardMaker {
    static String[][] stu_mrk;
    static String[] subject={"English","Math","Science"};
    public static void markin( int ns){
        Scanner sc = new Scanner(System.in);





        stu_mrk = new String[ns][4];
        for (int i=0;i<ns;i++){
            System.out.println("Enter student NAME:");
            stu_mrk[i][0]=sc.nextLine();
            for (int j=0;j<3;j++){
                System.out.println("Enter mark of " +subject[j]+":");
                stu_mrk[i][j+1]=sc.nextLine();
            }
            System.out.println();
            System.out.println("--------------------------------------");
            System.out.println();
        }


    }
    public static char getGrade(double avg){
        if (avg >= 80)
            return 'A';
        else if (avg >= 60)
            return 'B';
        else if (avg >= 40)
            return 'C';
        else
            return 'F';
    }



    public  static void calculate(int ns){
        for (int i=0;i<ns;i++){
            System.out.println("Name---"+stu_mrk[i][0]);
            for (int j=1;j<=3;j++){
                System.out.println("Mark for "+ subject[j-1]+ ":"+ stu_mrk[i][j]);
            }

            try{
                double total_mrk = Double.parseDouble(stu_mrk[i][1])+Double.parseDouble(stu_mrk[i][2])+Double.parseDouble(stu_mrk[i][3]) ;
                System.out.println("Total mark:"+total_mrk);
                double avg = total_mrk/subject.length;
                System.out.println("Average mark: "+avg);
                System.out.println("Grade-"+getGrade(avg));

            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }




            System.out.println();
            System.out.println("#------------------------#");
            System.out.println();
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ns;
        System.out.println("Enter no of students :");
        ns=sc.nextInt();
        markin(ns);
        calculate(ns);


    }
}

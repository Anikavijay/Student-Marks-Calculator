import javax.swing.JOptionPane;

public class studentmarks {
        public static void main(String[] args) {
            int marks,sum=0,failed=0;
            for(int i=0;i<5;i++)
            {
                marks=Integer.parseInt(JOptionPane.showInputDialog("Enter marks"));
                while (marks<0||marks>100) {
                    System.out.println("Invalid please..Try again");
                    marks=Integer.parseInt(JOptionPane.showInputDialog("Enter marks"));
                }
                if(marks<33)
                {
                    failed=1;
                }
                sum+=marks;
            }
            double percentage=sum/500.0*100;
            if(failed==1)
            {
                System.out.println("Failed");
            }
            else
            {
                System.out.println("Pass");
                if(percentage<90)
                {
                    System.out.println("Grade A");
                }
                else if(percentage<75)
                {
                    System.out.println("Grade B");
                }
                else if(percentage<60)
                {
                    System.out.println("Grade C");
                }
                else
                {
                    System.out.println("Grade D");
                }
            }
            System.out.println("Marks total:"+sum);
            System.out.println("Percentage are:"+percentage);
    }
}
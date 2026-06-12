import java.util.*;

class Main {
    public static void main(String[] args) {
        int sum=0;
        String result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int noOfSubjects = sc.nextInt();
        int marks[] =new int[noOfSubjects]; //intializing array
        System.out.println("Enter the marks of "+noOfSubjects+" Subjects.Press Enter to give marks for another subject");
        //entering marks
        for(int i=0;i<noOfSubjects;i++){
            marks[i]=sc.nextInt();
        }
        //calcu sum
        for(int j=0;j<noOfSubjects;j++){
            sum=sum+marks[j];
        }
        //generating result
        int percentage=sum/noOfSubjects;
        //can also be written as
        //int percentage=(sum/noOfsubjects*100)*100;
        System.out.println(percentage);
        if(percentage>=95){
            result="You scored like a topper... Great work but still not 100 ;-;";
        }
        else if(percentage>90 && percentage<95){
            result="You scored A+.. Well done!";
        }
        else if(percentage>70 && percentage<90){
            result="You scored A.. Try again..!";
        }
        else if(percentage>50 && percentage<70){
            result="You scored B+.. Grounded numbers!";
        }
        else if(percentage>0 && percentage<33){
            result="Failed!";
        }
        //make sure to to create grading for others marks too
        //percentage can also be converted to cgpa
        else {
            result="You passed";
        }
        System.out.println(result);
    }
}
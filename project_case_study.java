package project;
import java.util.Scanner;
class Student {
    public int [] s_id;
    public String [] s_Name;
    public String [] s_Course;
    public String [] s_Email;
    public String [] s_PhoneNo;
    public String [] s_Address;
    public int a=1;
    public void set() {}
    public void get() {}
}

class Course extends  Student{
    public String a;
    public int [] courseid;
    public String [] courseName;
    public String [] courseInstructor;
    public int [] courseCredit;
    public int [] coursemaxcapacity;

public  Course(){//.......constructor

    this.courseid=new int[3];
    this.courseid[0]=101;
    this.courseid[1]=201;
    this.courseid[2]=301;

    this.courseName = new String[3];
    this.courseName[0]="BBA";
    this.courseName[1]="BBA(CA)";
    this.courseName[2]="BBA(IB)";

    this.courseInstructor=new String[3];
    this.courseInstructor[0]="vikram";
    this.courseInstructor[1]="Neha";
    this.courseInstructor[2]="kavita";

    this.courseCredit=new int[3];
    this.courseCredit[0]=30;
    this.courseCredit[1]=30;
    this.courseCredit[2]=30;

    this.coursemaxcapacity=new int[3];
    this.coursemaxcapacity[0]=2;
    this.coursemaxcapacity[1]=2;
    this.coursemaxcapacity[2]=2;

}
    public void course_details_get(){
    for(int i=0;i<3;i++) {
        System.out.printf("\n%d", courseid[i]);
        System.out.printf("\n%s", courseName[i]);
        System.out.printf("\n%s", courseInstructor[i]);
        System.out.printf("\n%d", courseCredit[i]);
        System.out.printf("\n%d", coursemaxcapacity[i]);
    }
    }


}
class Enrollment extends   Course{
   public  int [] enrollID;
    public int  b=0;
   public int temp;
   public int temp2;
    public int temp3;

    public int c=0;
    public int d=0;
    @Override
    public void set() {
        s_id =new int[10];
        s_Name =new String[10];
        s_Course=new String[10];
        s_Email =new String[10];
        s_PhoneNo =new String[10];
        s_Address =new String[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Student Id is:");s_id[i]=sc.nextInt();
            sc.nextLine();
            System.out.println("Student Name is:"); s_Name[i]=sc.nextLine();
            System.out.println("Course Name :"); s_Course[i]=sc.nextLine();

            System.out.println("Student Email is:");s_Email[i]=sc.nextLine();
            System.out.println("Student Phone number is:"); s_PhoneNo[i]=sc.nextLine();
            System.out.println("Student Address is:"); s_Address[i]=sc.nextLine();
        }
    }

    @Override
    public void get() {
        System.out.println("Students details=");
        for(int i=0;i<5;i++){
            System.out.printf("\nStudent Id is:%d",s_id[i]);
            System.out.printf("\nStudent Name is:%s",s_Name[i]);
            System.out.printf("\nStudent Course is:%s",s_Course[i]);

            System.out.printf("\nStudent Email is:%s",s_Email[i]);

            System.out.printf("\nStudent Phone number is:%s",s_PhoneNo[i]);
            System.out.printf("\nStudent Address is:%s",s_Address[i]);
            System.out.println( );

        }

    }
    public void enroll() {
        for(int i=0;i<5;i++){

            if(s_Course[i].equals(courseName[0]) && this.b<coursemaxcapacity[0]){
                int j=0;
                System.out.println("Enrollment for BBA=");
           this.enrollID[j]=s_id[i];
        System.out.printf("\nStudent Id is:%d",s_id[i]);
        System.out.printf("\nStudent Name is:%s",s_Name[i]);
        System.out.printf("\nStudent Course is:%s",s_Course[i]);

        System.out.printf("\nStudent Email is:%s",s_Email[i]);

        System.out.printf("\nStudent Phone number is:%s",s_PhoneNo[i]);
        System.out.printf("\nStudent Address is:%s",s_Address[i]);
        System.out.println( );
        this.b=this.b+1;
        j++;
                this.temp=j;
    }

}
        for(int i=0;i<5;i++){

            if(s_Course[i].equals(courseName[1]) && this.c<coursemaxcapacity[1]){
                this.enrollID=new int[10];

                this.enrollID[temp]=s_id[i];

                System.out.println("Enrollment for BBA(CA)=");

                System.out.printf("\nStudent Id is:%d",s_id[i]);
                System.out.printf("\nStudent Name is:%s",s_Name[i]);
                System.out.printf("\nStudent Course is:%s",s_Course[i]);

                System.out.printf("\nStudent Email is:%s",s_Email[i]);

                System.out.printf("\nStudent Phone number is:%s",s_PhoneNo[i]);
                System.out.printf("\nStudent Address is:%s",s_Address[i]);
                System.out.println( );
                this.c=this.c+1;
                 temp++;
                 this.temp2=temp;
            }
        }
        for(int i=0;i<5;i++){

            if(s_Course[i].equals(courseName[2]) && this.d<coursemaxcapacity[2]){
                this.enrollID=new int[10];

                this.enrollID[temp2]=s_id[i];

                System.out.println("Enrollment for BBA(IB)=");

                System.out.printf("\nStudent Id is:%d",s_id[i]);
                System.out.printf("\nStudent Name is:%s",s_Name[i]);
                System.out.printf("\nStudent Course is:%s",s_Course[i]);

                System.out.printf("\nStudent Email is:%s",s_Email[i]);

                System.out.printf("\nStudent Phone number is:%s",s_PhoneNo[i]);
                System.out.printf("\nStudent Address is:%s",s_Address[i]);
                System.out.println( );
                this.d=this.d+1;
                 temp2++;
            }
        }



            }
}
public class project_case_study {
    public static void main(String[] args) {

        Course obj=new Course();
        //obj.lala();

       obj.course_details_get();

        Enrollment obj2=new Enrollment();
        obj2.set();
        obj2.get();

        obj2.enroll();
    }
}

package hospital.patience.waiting;
import java.util.Scanner;
public class Tester{
  public static void main(String [] args){
    Scanner abir= new Scanner(System.in);
    System.out.println("Enter whatever You want!! I mean..");
    System.out.println("press 1 or type task1 for normal array based queue.");
    System.out.println("press 2 or type task2 for circular array based queue.");
    System.out.println("press 3 or type task3 for Node based queue.");
    String input=abir.nextLine();
    if(input=="1"||input.equalsIgnoreCase("task1")){
      arraybasedqueue abir1=new arraybasedqueue();
      System.out.println(" Using Single array based queue.");
    System.out.println("Press 1 for RegisterPatient ");
    System.out.println("Press 2 for ServePatient");
    System.out.println("Press 3 for CancelAll");
    System.out.println("Press 4 for CanDoctorGoHome");
    System.out.println("Press 5 for ShowAllPatient");
    try{
      int x=abir.nextInt();
      switch(x){
        case 1:
          System.out.println("Enter your Patient name please");
          String my=abir.next();
          Patient p=new Patient(my);
          abir1.RegisterPatient(p);
          break;
        case 2:
          System.out.println("Please wait for serving Patient");
          System.out.println("serving patient Name="+ abir1.ServePatient());
          break;
        case 3:
          boolean b=(boolean)abir1.CancelAll();
          if(b==true){
            System.out.println("Yesss!!!!Doctor is ready and can go to lunch");
          }else{
            System.out.println("Yet doctor is not ready and  can not go to lunch");
          }
          break;
        case 4:
          boolean b2=(boolean)abir1.CanDoctorGoHome();
          if(b2==true){
            System.out.println("No one is waiting ,doctor can go home");
          }else{
            System.out.println("manushjon waiting");
          }
          break;
        case 5:
          System.out.println("Showing the list!PLease wait for a moment");
          abir1.ShowAllPatient();
          break;
        default:
        System.out.println("Wrong Entry.. Follow the Instructions");
        System.out.println();
        break;
      }
    }catch(Exception e){
    }
    System.out.println("if you wants to continue the program thanpress �Y�/�y�");
    String x1=abir.next();
    if(x1.equalsIgnoreCase("y")){
      while(true){
        try{
          System.out.println("Press 0 for closing ceremony ");
          System.out.println("Press 1 for RegisterPatient ");
          System.out.println("Press 2 for ServePatient");
          System.out.println("Press 3 for CancelAll");
          System.out.println("Press 4 for CanDoctorGoHome");
          System.out.println("Press 5 for ShowAllPatient");
          int x3=abir.nextInt();

          switch(x3){
            case 0:
              System.out.println("Yes we are done ");
              System.exit(0);
              break;
            case 1:
              System.out.println("Enter your Patient name please");
              String s1=abir.next();
              Patient p=new Patient(s1);
              abir1.RegisterPatient(p);
              break;
            case 2:
              System.out.println("Please wait for serving Patient");
              System.out.println("serving patient Name="+abir1.ServePatient());
              break;
            case 3:
              boolean b=(boolean)abir1.CancelAll();
              if(b==true){
                System.out.println("Yesss!!!!Doctor is ready and can go to lunch");
              }else{
                System.out.println("Yet doctor is not ready and  can not go to lunch");
              }
              break;
            case 4:
              boolean b2=(boolean)abir1.CanDoctorGoHome();
              if(b2==true){
                System.out.println("No one is waiting ,doctor can go home");
              }else{
                System.out.println("manushjon waiting");
              }
              break;
            case 5:
              System.out.println("Showing the list!PLease wait for a moment");
              abir1.ShowAllPatient();
              break;
            default:
              System.out.println("Wrong Entry.. Follow the Instructions");
              System.out.println();
              break;
          }
        }catch(Exception e){
          System.out.println("System have some problem");
          System.out.println("please follow proper instruction");
          System.out.println("or else call 01672001715");
        }
      }
    }else{
      System.exit(0);
    }
    }else if(input=="2"||input.equalsIgnoreCase("task2")){
      circulararraybasedqueue abir1=new circulararraybasedqueue();
      System.out.println(" Using a Circular array based queue.");
    System.out.println("Press 1 for RegisterPatient ");
    System.out.println("Press 2 for ServePatient");
    System.out.println("Press 3 for CancelAll");
    System.out.println("Press 4 for CanDoctorGoHome");
    System.out.println("Press 5 for ShowAllPatient");
    try{
      int x=abir.nextInt();
      switch(x){
        case 1:
          System.out.println("Enter your Patient name please");
          String my=abir.next();
          Patient p=new Patient(my);
          abir1.RegisterPatient(p);
          break;
        case 2:
          System.out.println("Please wait for serving Patient");
          System.out.println("serving patient Name="+ abir1.ServePatient());
          break;
        case 3:
          boolean b=(boolean)abir1.CancelAll();
          if(b==true){
            System.out.println("Yesss!!!!Doctor is ready and can go to lunch");
          }else{
            System.out.println("Yet doctor is not ready and  can not go to lunch");
          }
          break;
        case 4:
          boolean b2=(boolean)abir1.CanDoctorGoHome();
          if(b2==true){
            System.out.println("No one is waiting ,doctor can go home");
          }else{
            System.out.println("manushjon waiting");
          }
          break;
        case 5:
          System.out.println("Showing the list!PLease wait for a moment");
          abir1.ShowAllPatient();
          break;
        default:
        System.out.println("Wrong Entry.. Follow the Instructions");
        System.out.println();
        break;
      }
    }catch(Exception e){
    }
    System.out.println("if you wants to continue the program thanpress �Y�/�y�");
    String x1=abir.next();
    if(x1.equalsIgnoreCase("y")){
      while(true){
        try{
          System.out.println("Press 0 for closing ceremony ");
          System.out.println("Press 1 for RegisterPatient ");
          System.out.println("Press 2 for ServePatient");
          System.out.println("Press 3 for CancelAll");
          System.out.println("Press 4 for CanDoctorGoHome");
          System.out.println("Press 5 for ShowAllPatient");
          int x3=abir.nextInt();

          switch(x3){
            case 0:
              System.out.println("Yes we are done ");
              System.exit(0);
              break;
            case 1:
              System.out.println("Enter your Patient name please");
              String s1=abir.next();
              Patient p=new Patient(s1);
              abir1.RegisterPatient(p);
              break;
            case 2:
              System.out.println("Please wait for serving Patient");
              System.out.println("serving patient Name="+abir1.ServePatient());
              break;
            case 3:
              boolean b=(boolean)abir1.CancelAll();
              if(b==true){
                System.out.println("Yesss!!!!Doctor is ready and can go to lunch");
              }else{
                System.out.println("Yet doctor is not ready and  can not go to lunch");
              }
              break;
            case 4:
              boolean b2=(boolean)abir1.CanDoctorGoHome();
              if(b2==true){
                System.out.println("No one is waiting ,doctor can go home");
              }else{
                System.out.println("manushjon waiting");
              }
              break;
            case 5:
              System.out.println("Showing the list!PLease wait for a moment");
              abir1.ShowAllPatient();
              break;
            default:
              System.out.println("Wrong Entry.. Follow the Instructions");
              System.out.println();
              break;
          }
        }catch(Exception e){
          System.out.println("System have some problem");
          System.out.println("please follow proper instruction");
          System.out.println("or else call 01672001715");
        }
      }
    }else{
      System.exit(0);
    }
    }else if(input=="3"||input.equalsIgnoreCase("task3")){
      linkedlistbasedqueue abir1=new linkedlistbasedqueue();
      System.out.println(" Using a Linked list based queue.");
    System.out.println("Press 1 for RegisterPatient ");
    System.out.println("Press 2 for ServePatient");
    System.out.println("Press 3 for CancelAll");
    System.out.println("Press 4 for CanDoctorGoHome");
    System.out.println("Press 5 for ShowAllPatient");
    try{
      int x=abir.nextInt();
      switch(x){
        case 1:
          System.out.println("Enter your Patient name please");
          String my=abir.next();
          Patient p=new Patient(my);
          abir1.RegisterPatient(my);
          break;
        case 2:
          System.out.println("Please wait for serving Patient");
          System.out.println("serving patient Name="+ abir1.ServePatient());
          break;
        case 3:
          boolean b=(boolean)abir1.CancelAll();
          if(b==true){
            System.out.println("Yesss!!!!Doctor is ready and can go to lunch");
          }else{
            System.out.println("Yet doctor is not ready and  can not go to lunch");
          }
          break;
        case 4:
          boolean b2=(boolean)abir1.CanDoctorGoHome();
          if(b2==true){
            System.out.println("No one is waiting ,doctor can go home");
          }else{
            System.out.println("manushjon waiting");
          }
          break;
        case 5:
          System.out.println("Showing the list!PLease wait for a moment");
          abir1.ShowAllPatient();
          break;
        default:
        System.out.println("Wrong Entry.. Follow the Instructions");
        System.out.println();
        break;
      }
    }catch(Exception e){
    }
    System.out.println("if you wants to continue the program thanpress �Y�/�y�");
    String x1=abir.next();
    if(x1.equalsIgnoreCase("y")){
      while(true){
        try{
          System.out.println("Press 0 for closing ceremony ");
          System.out.println("Press 1 for RegisterPatient ");
          System.out.println("Press 2 for ServePatient");
          System.out.println("Press 3 for CancelAll");
          System.out.println("Press 4 for CanDoctorGoHome");
          System.out.println("Press 5 for ShowAllPatient");
          int x3=abir.nextInt();

          switch(x3){
            case 0:
              System.out.println("Yes we are done ");
              System.exit(0);
              break;
            case 1:
              System.out.println("Enter your Patient name please");
              String s1=abir.next();
              Patient p=new Patient(s1);
              abir1.RegisterPatient(s1);
              break;
            case 2:
              System.out.println("Please wait for serving Patient");
              System.out.println("serving patient Name="+abir1.ServePatient());
              break;
            case 3:
              boolean b=(boolean)abir1.CancelAll();
              if(b==true){
                System.out.println("Yesss!!!!Doctor is ready and can go to lunch");
              }else{
                System.out.println("Yet doctor is not ready and  can not go to lunch");
              }
              break;
            case 4:
              boolean b2=(boolean)abir1.CanDoctorGoHome();
              if(b2==true){
                System.out.println("No one is waiting ,doctor can go home");
              }else{
                System.out.println("manushjon waiting");
              }
              break;
            case 5:
              System.out.println("Showing the list!PLease wait for a moment");
              abir1.ShowAllPatient();
              break;
            default:
              System.out.println("Wrong Entry.. Follow the Instructions");
              System.out.println();
              break;
          }
        }catch(Exception e){
          System.out.println("System have some problem");
          System.out.println("please follow proper instruction");
          System.out.println("or else call 01672001715");
        }
      }
    }else{
      System.exit(0);
    }
    }else{
      System.out.println("please follow proper instruction");
      System.out.println("And run the program again..Thankyou!!");
    }
    
  }
}
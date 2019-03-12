package hospital.patience.waiting;
public class circulararraybasedqueue{
  public static int mid=1;
  Patient[]line=new Patient[10];;
  int size=0;
  int front=0;
  public void RegisterPatient(Patient p){
    int index=(size+front)%line.length;
    p.id=mid;
    line[index]=p;
    mid++;
    size++;
  }
    
  public Object ServePatient() throws QueueUnderflowException{
    if(size==0){
      throw new  QueueUnderflowException();
    }else{
      Object temp="Name ::== "+line[front].name+" (Patient Id== "+line[front].id;
      line[front]=null;   
      front=(front+1)%line.length; 
      size--;
      return temp;
    }
  }
  public Object CanDoctorGoHome(){
    if(size==0){
      return true;
    }else{
      return false;
    }
  }
  public Object CancelAll(){
    for(int c=0;c<size;c++){
      line[c]=null;
    }
    size=0;
    return true;
  }
  public void ShowAllPatient(){
    Patient[]temp=new Patient[size];
    int count=front;
    for(int c=0;c<temp.length;c++){
      temp[c]=line[count];
      count=(count+1)%line.length;
    }
    //Shorting
    if(size==1){
      System.out.print("Name: "+temp[0].name+" Patient Id== "+temp[0].id);
    }else{
    Patient tempP;
    for(int d=0;d<temp.length;d++){
      for(int e=d+1;e<temp.length;e++){
        if(temp[d].name.compareToIgnoreCase(temp[e].name)> 0){
          tempP=temp[d];
          temp[d]=temp[e];
          temp[e]=tempP;
        }
      }
    }
    }
    for(int f=0;f<temp.length;f++){
      System.out.println("Name: "+temp[f].name+" Patient Id== "+temp[f].id);
    }
  }
}
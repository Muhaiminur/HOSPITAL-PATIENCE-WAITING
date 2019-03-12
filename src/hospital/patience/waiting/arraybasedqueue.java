package hospital.patience.waiting;
public class arraybasedqueue{
  public static int mid=1;
  Patient[]line=new Patient[10];;
  int size=0;
  int front=0;
  public void RegisterPatient(Patient p){
    p.id=mid;
    line[size]=p;
    mid++;
    size++;
    front++;
  }
    
  public Object ServePatient() throws QueueUnderflowException{
    if(size==0){
      throw new  QueueUnderflowException();
    }else{
      Object temp="Name ::== "+line[0].name+" (Patient Id== "+line[0].id;
      for(int c=0;c<line.length-1;c++){
        line[c]=line[c+1];
      }
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
    for(int c=0;c<temp.length;c++){
      temp[c]=line[c];
    }
    //Shorting
    if(size==1){
      System.out.print("Name: "+temp[0].name+" Patient Id== "+temp[0].id);
    }else{
    Patient tempP;
    for(int d=0;d<size;d++){
      for(int e=d+1;e<size;e++){
        if(temp[d].name.compareToIgnoreCase(temp[e].name)> 0){
          tempP=temp[d];
          temp[d]=temp[e];
          temp[e]=tempP;
        }
      }
    }
    }
    for(int f=0;f<size;f++){
      System.out.println("Name: "+temp[f].name+" Patient Id== "+temp[f].id);
    }
  }
}
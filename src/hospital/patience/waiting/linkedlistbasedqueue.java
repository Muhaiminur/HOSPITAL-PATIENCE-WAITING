package hospital.patience.waiting;
public class linkedlistbasedqueue{
  public static int mid=1;
  Node head=new Node(null, null,null);
  Node tail=head;
  int size=0;
  int front=0;
  public void RegisterPatient(Object p){
    Node mn=new Node(p,mid,null);
    if(size==0){
      tail.next=mn;
      head=mn;
      mid++;
      size++;
    }else{
      tail.next=mn;
      tail=tail.next;
      mid++;
      size++;
    }
  }
    
  public Object ServePatient() throws QueueUnderflowException{
    if(size==0){
      throw new  QueueUnderflowException();
    }else if(size==1){
      Object temp="Name ::== "+head.element+" (Patient Id== "+head.id;
      head=tail=null;
      size--;
      return temp;
    }else{
      Object temp="Name ::== "+head.element+" (Patient Id== "+head.id;
      head.element=null;
      head.id=null;
      head=head.next;
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
    head=null;
    size=0;
    return true;
  }
  public void ShowAllPatient(){
    Patient[]temp=new Patient[size];
    int count=0;
    for(Node n=head;n.next!=null;n=n.next){
      temp[count].id=(int)n.id;
      temp[count].name=(String)n.element;
      count++;
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
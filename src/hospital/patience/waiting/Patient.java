package hospital.patience.waiting;
public class Patient{
    public int id = 1;
    public String name = null;
  
    public Patient(String name){
        this.name = name;
    }
    public String toString(){
      return name;
    }
}
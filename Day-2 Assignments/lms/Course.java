public class Course{
    int id;
    String name;
    int fee;

    public Course(int id,String name,int fee){
        this.id=id;
        this.name=name;
        this.fee=fee;
    }
    public String toString(){
        return "id: "+id+" name: "+name+" fee: "+fee;
    }
}
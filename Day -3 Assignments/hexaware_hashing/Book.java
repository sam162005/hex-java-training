public class Book{
    int id;
    String name;
    String address;
    public Book(int id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    public String toString(){
        return "Book [id="+id+", name="+name+", address="+address+"]";
    }
}
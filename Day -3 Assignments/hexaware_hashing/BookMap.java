import java.util.*;
public class BookMap{
    private static String[][] library=new String[100][100];
    static int shelf=3;
    static int locpershelf=3;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Book b1 = new Book(1, "To Kill a Mockingbird");
        Book b2 = new Book(2, "Pride and Prejudice");
        Book b3 = new Book(3, "Man's Search for Meaning");
        Book b4 = new Book(4, "Harry Potter & prisoner of azkaban");
        b1.address=hashAddress(b1);
        b2.address=hashAddress(b2);
        b3.address=hashAddress(b3);
        b4.address=hashAddress(b4);
        Map<Integer, Book> map = new HashMap<>();
        map.put(b1.id, b1);
        map.put(b2.id, b2);
        map.put(b3.id, b3);
        map.put(b4.id, b4);
        System.out.println("Enter the book id to search");
        int id = sc.nextInt();
        Book book=map.get(id);
        System.out.println(book);
    }
    private static String hashAddress(Book b){
        int shelfNo= b.id % shelf;
        for(int l=0;l<locpershelf;l++){
            if(library[shelfNo][l]==null){
                library[shelfNo][l]="Book - "+b.id;
                return b.id+"#"+"S"+(shelfNo+1)+"#"+"L"+(l+1);
            }
        }
        return null;
    }

}
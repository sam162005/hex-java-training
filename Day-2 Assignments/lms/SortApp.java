import java.util.*;

public class SortApp{
    public static void main(String args[]){
        Course c1=new Course(101,"Java",15000);
        Course c2=new Course(102,"Python",12000);
        Course c3=new Course(103,"React",15000);
        Course c4=new Course(104,"SQL",8000);
        Course c5=new Course(105,"Angular",12000);
        List<Course> list=new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);
        System.out.println("The Available Courses:");
        for(Course c:list){
            System.out.println(c);
        }
        System.out.println("Courses in Ascsending fees order:");
        sortCourses(list,"asc");
        System.out.println("Courses in Descending fees order:");
        sortCourses(list,"desc");
        System.out.println("Courses in Alphabetical Order:");
        sortCourses(list, "name");
    }
     private static void sortCourses(List<Course> list,String dir){
        Collections.sort(list,new CourseUtility(dir));
        for(Course c:list){
            System.out.println(c);
        }
    }
}
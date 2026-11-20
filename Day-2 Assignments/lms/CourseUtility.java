import java.util.Comparator;

public class CourseUtility implements Comparator<Course> {
    String dir;
    public CourseUtility(String dir){
        this.dir=dir;
    }
    public int compare(Course c1,Course c2){
        if(dir.equals("asc")){
            if(c1.fee>c2.fee)
                return 1;
            if(c1.fee<c2.fee)
                return -1;
            
    }else if(dir.equals("desc")){
            if(c1.fee<c2.fee)
                return 1;
            if(c1.fee>c2.fee)
                return -1;
        }
        else if(dir.equals("name")){
            return c1.name.compareTo(c2.name);
        }
        return 0;
    }
}
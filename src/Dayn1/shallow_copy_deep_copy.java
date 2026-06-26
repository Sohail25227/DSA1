package Dayn1;

public class shallow_copy_deep_copy {
    public static void main(String[] args) {
        Random r=new Random(8,9);
        Random rs=r; //shallow copy
        Random rd=new Random(r); //deep copy
        System.out.println(rs.x+" "+rs.y);
        System.out.println(r+" "+rs+" "+rd);
        System.out.println(rd.x+" "+rd.y);
    }
}
class Random{
    int x;
    int y;
    Random (int x,int y){
        this.x=x;
        this.y=y;
    }
    Random (Random r1){
        this.x=r1.x;
        this.y=r1.y;
    }
}

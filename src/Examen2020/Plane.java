package Examen2020;

public class Plane {
    static String s =  "-";
    public static void main(String [] args){
        new Plane().s1();
        System.out.println(s);
    }
    public void s1(){
        try{
            s2();
        }catch (Exception e){
            s += "c";
        }
    }
    void  s2() throws Exception{
        s3(); s += "2";
        s3(); s +="2b";
    }
    void s3() throws Exception{
        throw new Exception();
    }
}

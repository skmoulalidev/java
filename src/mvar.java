//creating method with varibles

/*public class mvar {
    public void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    public static void main(String args[]){
        mvar obj=new mvar();
        obj.add(55,45);
    }
}
*/

//static and non static methods
/*class mvar{
    public static void show(){
        System.out.println("this is static method");
    }
    public void msg(){
        System.out.println("this is non static method");
    }
    public static void main(String args[]){
        mvar.show();
        mvar obj=new mvar();
        obj.msg();
    }
}
*/

//storing string value into variable and printing the value
class mvar{
    static String a="moulali";
    public static void main(String args[]){
        System.out.println(a);
    }
}
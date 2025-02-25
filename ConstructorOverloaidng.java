public class ConstructorOverloaidng {
    int number1, number2;
    ConstructorOverloaidng(){
        System.out.println("-----Constructor call without parameter-----");
        number1=0;
        number2=0;
        System.out.println("First Value: "+number1+" second Value: "+number2);
    }
    ConstructorOverloaidng(int number1){
        System.out.println("-----constructor call with one parameter-----");
        this.number1=number1;
        number2=0;
        System.out.println("First Value: "+number1+" second Value: "+number2);
    }
    ConstructorOverloaidng(int number1, int number2){
        System.out.println("-----constructor call with two parameter-----");
        this.number1=number1;
        this.number2=number2;
        System.out.println("First Value: "+number1+" second Value: "+number2);
    }
    //We can also overload constructor with the help of diffrent types of datatype combinations//
    public static void main(String[] args) {
        ConstructorOverloaidng obj1=new ConstructorOverloaidng();
        ConstructorOverloaidng obj2=new ConstructorOverloaidng(1);
        ConstructorOverloaidng obj3=new ConstructorOverloaidng(1,1);
    }
}

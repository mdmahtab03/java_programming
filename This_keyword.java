public class This_keyword {
    int number;
    public void display(){
        System.out.println("Function invoked by this keyword!");
    }
    This_keyword(int number){
        this.number=number;
    }
    public static void main(String[] args) {
        This_keyword obj=new This_keyword(25);
        System.out.println("value of number is: "+obj.number);
    }
}

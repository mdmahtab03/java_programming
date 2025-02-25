class Base {
        int roll;
        String name;
        public void display(){
            System.err.println("Name"+name+"\n"+"Roll No.: "+roll);
        } 
        
    
}



class Main extends Base{
    
    public static void main(){
        System.out.println("hello guys");
    }
}
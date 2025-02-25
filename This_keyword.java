class This_keyword {
    String name;
    int age;

    This_keyword() {
        this("Unknown", 0);
    }

    This_keyword(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    public static void main(String args[]) {
        This_keyword student1 = new This_keyword();
        This_keyword student2 = new This_keyword("Toheed", 20);

        System.out.println("Student 1 details:");
        student1.display();

        System.out.println("\nStudent 2 details:");
        student2.display();

        student1.setName("Mahtab");
        student1.setAge(22);
        
        System.out.println("\nUpdated Student 1 details:");
        student1.display();
    }
}

class StringMethodsDemo {
    public static void main(String args[]) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Original String 1: " + str1);
        System.out.println("Original String 2: " + str2);

        System.out.println("Length of str1: " + str1.length());

        String str3 = str1.concat(" " + str2);
        System.out.println("Concatenated String: " + str3);

        System.out.println("str1 in uppercase: " + str1.toUpperCase());

        System.out.println("str2 in lowercase: " + str2.toLowerCase());

        System.out.println("Does str3 contain 'World'? " + str3.contains("World"));

        System.out.println("Are str1 and str2 equal? " + str1.equals(str2));

        System.out.println("Substring of str3 (from index 6): " + str3.substring(6));

        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        System.out.println("Replace 'l' with 'z' in str1: " + str1.replace('l', 'z'));

        String str4 = "   Hello World   ";
        System.out.println("Trimmed string: '" + str4.trim() + "'");
    }
}

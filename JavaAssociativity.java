public class JavaAssociativity {
    public static void main(String[] args){
        int a=6*5-32/2;
        // a=30-32/2
        //a=30-16
        //a=14
        System.out.println(a);

        float s=7/4*9/2;
        System.out.printf("The value of s is %f",s);
        int ans=7*49/7+35/7;
        System.out.println(ans);

        // Encrypt
        char grade = 'B';
        grade=(char)(grade+8);
        System.out.println(grade);
        //decrypt
        grade = (char) (grade - 8);
        System.out.println(grade);


        //String methods in java 

        String example = new String("Sneha");
        System.out.println(example.length());
        String lstring = example.toLowerCase();
        System.out.println(lstring);
        String ustring = example.toUpperCase();
        System.out.println(ustring);
        System.out.println(example.substring(3));
        System.out.println(example.substring(1,4));
        System.out.println(example.replace("n", "p"));
        System.out.println(example.startsWith("S"));
        System.out.println(example.endsWith("a"));
        String trimstring = " Harry parry    ";
        System.out.println(trimstring.trim());
        String names = "Harry";
        System.out.println(names.charAt(3));
        System.out.println(names.indexOf("r"));
        System.out.println(names.indexOf("r",3));
        System.out.println(names.lastIndexOf("r"));
        System.out.println(names.lastIndexOf("r",2));


        System.out.println(names.equals("Harry"));
        System.out.println(names.equalsIgnoreCase("harry"));


    } 
}
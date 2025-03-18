public class JavaPracticestring {

    public static void main(String[] args){
        String name = "JAVA";
        System.out.println(name.toLowerCase());
        String namess = "Harry potter";
        System.out.println(namess.replace(" ", "_"));
        String problem="Dear <|name|>, Thanks a lot";
        problem=problem.replace("<|name|>", "harry");
        System.out.println(problem);
        String myString = "Dear Harry ,thanks  January   Hey";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));
    }
}
public class TextBlockExample {
    public static void main(String[] args){
        String normalString = "Ajay\n" + "Shankar\n" +"Software Developer";

        String textBlock = """
                Ajay
                Shankar
                Software Developer
                """; // using textblock you can print in whatever pattern you want like ASCII arts

        System.out.println(textBlock);
    }
}

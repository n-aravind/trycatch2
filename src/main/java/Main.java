public class Main {
    public static void main(String[] args) {
        String[] numbers = {"1","2","3","four","5"};

        try {
            for (String number : numbers){
                Integer.parseInt(number);
            }
        }catch (NumberFormatException e){
            System.out.println(e.getClass() + " " + e.getMessage());
        }
    }
}

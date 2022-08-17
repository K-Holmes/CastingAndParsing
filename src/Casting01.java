public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint

        byte test = 128;
        //wants to cast into an int


        //Declare and initialize a short with a value of 128
        //Create a print statement that casts this short to a byte
        short testnew = 128;
        System.out.println((byte)testnew);



        //Declare and initialize a byte with a value of 127
        //Add 1 to this variable and print it
        //Add 1 to this variable again and print it again
        byte c = 127;
        c++;
        System.out.println(c);
        c++;
        System.out.println(c);




    }
}

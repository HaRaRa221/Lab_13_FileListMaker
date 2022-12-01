import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    static ArrayList<String> myArrList = new ArrayList<>();

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        String com = "";


        final String menu = "A- Add D- Delete V- View Q- Quit O- Open S- Save C- Clear";

        System.out.println(menu);


        do {


            displayList(myArrList);
            ArrayList<String> names = new ArrayList<>();
            names.add(0,"Jacob");


            com = SafeInput.getRegExString(in, menu, "[AaDdVvQqOoSsCc]");
            com = com.toUpperCase();

            switch(com){

                case "A":
                    break;
                case "D":
                    break;
                case "V":
                    break;
                case "O":
                    break;
                case "S":
                    break;
                case "C":
                    break;
                case "Q":
                    done = SafeInput.getYNConfirm(in, "Are you sure that you are done?");
                    break;
            }
            System.out.println(" Com is " + com);


        }while(!done);
    }

    private static void displayList(ArrayList<String> myArrList)
    {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        if(Main.myArrList.size() != 0)
        {
            for(int i = 0; i < Main.myArrList.size(); i++)
            {
                System.out.printf("%3d%35s", i+1, Main.myArrList.get(i) );
                System.out.println(Main.myArrList.get(i));
                System.out.println(myArrList);
            }
        }
        else {
            System.out.println("++++++++           List is empty           +++++++++");
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

}
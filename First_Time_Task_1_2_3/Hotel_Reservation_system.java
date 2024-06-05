import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hotel_Reservation_system {
    
    static HashMap<String,Integer> Rooms_and_Cost=new HashMap<>();
    static HashMap<String,Integer> Available_rooms=new HashMap<>();
    static HashMap<String,String> About_rooms=new HashMap<>();
    static Scanner sc=new Scanner(System.in);
    static ArrayList<String> customerDetail=new ArrayList<>();
    public static void InitializeHotel() {
               Rooms_and_Cost.put("Single_room",100);
               Rooms_and_Cost.put("Standard_twin_room",180);
               Rooms_and_Cost.put("Suite_room",250);
               Rooms_and_Cost.put("Deluxe_double_room",300);



               Available_rooms.put("Single_room",5);
               Available_rooms.put("Standard_twin_room",3);
               Available_rooms.put("Suite_room",2);
               Available_rooms.put("Deluxe_double_room",4);


               About_rooms.put("Single_room","A Single Room have One Bed");
               About_rooms.put("Standard_twin_room","A Room Which has two Separated Bed Separead by Table");
               About_rooms.put("Suite_room","A Room Comparises of Two or more BedRoom with Dining Table");
               About_rooms.put("Deluxe_double_room","A Room which is Spread on Two Rooms");

    }
    public static void showRooms(){
        System.out.println("!.............................................Welcome to Sheriyan's Hotel..........................!");
        System.out.println("                                         Available Rooms For  Reservation are  \n");
        for (Map.Entry<String,Integer> entry:Available_rooms.entrySet()) {
            System.out.println("           -->  There are "+entry.getValue()+"  "+entry.getKey()+"  are Available ");
        }
        System.out.print("\n           **** Enter The Room Name You want to See The Detail ** :");
       
        String chooseRoom=sc.nextLine(); 
        System.out.println("\n");
        ShowDetail_of_Each_Room(chooseRoom);



    } 
    public static void ShowDetail_of_Each_Room(String choosedRoom){
        for (String Room : Rooms_and_Cost.keySet()) {
            if (choosedRoom.equals(Room)  || choosedRoom.equalsIgnoreCase(Room)) {
                System.out.println("-----------------------------------   "+Room+"  Details -------------------------");  
                System.out.println(" ***********************   A "+choosedRoom+" is "+About_rooms.get(Room)+" having the cost of One Night is "+Rooms_and_Cost.get(Room)+" ***************************");
                System.out.println("Write Enter to Confirm the Reservation  or Write Exit to Go Back");
                String decision=sc.nextLine();
                if (decision.equalsIgnoreCase("Enter")) {
                    Reservation(Room);
                }
            }
        }

    }

    public static void Reservation(String choosedRoom){
        String [] info_question={"Enter Your Name :","Enter Cnic Number :","Enter Your Phone: ","Enter Your Address","Choose Payement Method  \n a) Bank Account \n b) Jazz Cash \n c) Easy Paisa \n"};
        for (int i = 0; i < info_question.length; i++) {
            System.out.print(info_question[i]+"  ");
            customerDetail.add(sc.nextLine());
        }
        if (customerDetail.get(4).equalsIgnoreCase("Bank Account")) {
            System.out.println("our Bank Account Number is 4567345564456");
        }
        else if (customerDetail.get(4).equalsIgnoreCase("Jazz Cash")) {
            System.out.println("our Jazz Cash Number is 03243669571");
            
        }
        else if (customerDetail.get(4).equalsIgnoreCase("Easy Paisa")) {
            System.out.println("our Easy Paisa Number is 03133300758");
            
        }

        System.out.println("!......................... Thank's For Visiting Our Hotel .....................!");

        System.out.println("!........ Your Reservation has Been In Pending After Making Confirmation Of Payment we will Sended You the Confirmation  Message.......!");


    }

    public static void main(String[] args) {
        InitializeHotel();
        showRooms();
    }
}
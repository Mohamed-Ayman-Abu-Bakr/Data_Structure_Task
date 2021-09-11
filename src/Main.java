import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int array task
        int [] array = new int [5];
        System.out.println("Enter five integers separated by spaces:");
        Scanner scn = new Scanner(System.in);
        for(int i = 0;i<array.length;i++){
            array[i]= scn.nextInt();
        }
        Arrays.sort(array,0,array.length);

        System.out.println("The sorted Array:");
        for(int j = 0;j<array.length;j++){
            System.out.print(array[j]+" ");
        }
        System.out.println();
        //arraylist task
        System.out.println("Enter person name and then age separated by a comma, enter 0 to end entry");
        Scanner scn2 = new Scanner(System.in);
        ArrayList<Person> personList = new ArrayList<>();
        String temp;
        Person tempPerson;
        while(true){
            temp = scn2.nextLine();
            if (temp.equals("0")) {
                break;
            }
            String[]splitString=temp.split(",",0);
            tempPerson = new Person(splitString[0],Integer.parseInt(splitString[1]));
            personList.add(tempPerson);
        }
        for(int k = 0;k<personList.size();k++){
            tempPerson = personList.get(k);
            tempPerson.printPerson();
        }

    }
}

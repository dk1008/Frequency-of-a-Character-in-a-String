import java.util.Scanner;
import java.util.ArrayList;
public class Character_Counting {
	String name ;

	public void count_Character(String str){
		ArrayList <String> al1 = new ArrayList<String>();
		ArrayList <Integer> al2 = new ArrayList<Integer>();
		char arr[] = str.toCharArray();
		
		for (int i =0; i<arr.length; i++){
			int total = 0;
			for(int j = 0; j<arr.length; j++){
				if(arr[i] == arr[j]){
					total++;
				}
			}
			if(al1.contains(Character.toString(arr[i])) == false){
				al1.add(Character.toString(arr[i]));
				al2.add(total); 
			}
		}
		System.out.println(al1);
		System.out.println(al2);

	}

	public static void main(String[] args){
	
		Character_Counting obj = new Character_Counting();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");
		obj.name = s.nextLine();
		System.out.println("String is: "+ obj.name);
	
		obj.count_Character(obj.name);
	}

}

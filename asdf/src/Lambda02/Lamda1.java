package Lambda02;
import java.util.stream.*;
public class Lamda1 {
	public static void main(String[] args) {
		// Get the stream 
        Stream<String> stream 
            = Stream.of("Geeks", "For", 
                        "Geeks", "A", 
                        "Computer", 
                        "Portal"); 
  
        // Print the stream 
        // using double colon operator 
        stream.forEach(System.out::println);//1
        //stream.forEach( s-> System.out.println(s));//2
        
        //1,2 ���� ���� �ȵǰ� �ϳ��� ���� �Ǳ��Ѵ�
	}
	
}
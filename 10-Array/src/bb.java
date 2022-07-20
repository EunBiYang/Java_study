import java.util.Scanner;
public class bb {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
		
       boolean[] car = new boolean[5];
       int num1 = 0;
       int position = 0;
		
     //명령
      while(true) {
    	   System.out.println("*********\n1. 입차\n2. 출차\n3. 리스트\n4. 종료\n*********");
	       System.out.print("메뉴 :");
	       num1 = sc.nextInt();
	     
	  //입차    
      if (num1 == 1) {
    	  //입력을 1~5만 받도록 함
    	 do{
    		 System.out.print("위치 입력[1~5]: ");
             position = sc.nextInt();
    	  }while(position <1 || position>5);
    	 
         if(car[position-1]) {
        	 System.out.println(position+" 위치에 입차 / 이미 주차되어있습니다");
         }else {
        	 System.out.println(position+" 위치에 입차 /주차되었습니다");
        	 car[position-1] =true;
         }
      //출차
      }else if (num1 == 2) {
    	  do{
     		 System.out.print("위치 입력[1~5]: ");
              position = sc.nextInt();
     	  }while(position <1 || position>5);
    	  
         if(car[position-1]) {
        	 System.out.println(" ("+position+")위치에 출차 / 출차되어있습니다");
        	 car[position-1] =false;
         }else {
        	 System.out.println(" ("+position+")위치에 출차 /주차되어있지 않습니다");
         } 
      //리스트
      }else if (num1 == 3) {
    	  for(int i=0; i<car.length;i++) {
    		  System.out.println(i+1+"위치: "+ car[i]);
    	  }
      //종료 
      }else if (num1 == 4) {
         System.out.println("종료");
         break;
      }
      //출력
      System.out.println();  //줄넘김
   }
   }
}



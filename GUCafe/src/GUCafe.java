import java.util.Scanner;

public class GUCafe {
	
	 static int money; // 인스턴스 없이 사용하기 위해 static 이용
	 static Scanner s = new Scanner(System.in);
	 
	 public static void main(String[] args) {
		
		 MenuItem menuItemControl = new MenuItem();
			int[] menuSystem = new int[100];
			int i;
			
			
			for (i = 0; i < menuSystem.length; i++) {
			System.out.println(" =====커피메뉴=================홍차메뉴=====");
			System.out.println("   1. 아메리카노 1500원       4. 허브차 3000원");
			System.out.println("   2. 바닐라라떼 5500원       5. 자몽차 4000원");
			System.out.println("   3. 카페모카  4500원");
			System.out.println(" ======================================");
			System.out.println("   6.종료                   7. 결제");
			
			menuSystem[i] = s.nextInt();
			
			switch (menuSystem[i]) {
			case 1: menuItemControl.buyCoffee(new Americano()); break;
			case 2: menuItemControl.buyCoffee(new VanillaLatte()); break;
			case 3: menuItemControl.buyCoffee(new CaffeMocha()); break;
			case 4: menuItemControl.buyTea(new HubTea()); break;
			case 5: menuItemControl.buyTea(new GrapefruitTea()); break;
			}
			
			if (menuSystem[i] == 6) { System.out.println("\n메뉴창이 닫힙니다.\n"); return;}
			
			if (menuSystem[i] == 7) {
				String result = callGoldenBell();
				if(result.equals("return")) {return;}
				else if(result.equals("continue")) {continue;}
				else if(result.equals("break")) {break;}
				else System.out.println("if (menuSystem[i] == 7) 오류발생");
			
			} else if (menuSystem[i] > 7) {System.out.println("잘못 입력하셨습니다. 다시 입력해주세요\n");}
			
		}
	
	 }
	
	
	
	 static String callGoldenBell() {
		 String pay;
		 int myMoney;
		 System.out.println("총 주문 금액: " + money);
		 System.out.println("결제하시겠습니까? (Y/N)");
		 pay = s.next(); 
		 pay = pay.toUpperCase();
		 if (pay.equals("Y")) {System.out.println("돈을 넣어주세요: ");
		 myMoney = s.nextInt();
		 if (myMoney < money) {System.out.println("잔액이 부족합니다. 프로그램이 종료됩니다."); return "return";}		
		 else { 
			 System.out.println("계산이 완료되었습니다."); 
			 System.out.println("결제된 금액: " + money);
			 System.out.println("남은 금액: "+ (myMoney - money));
			 return "break";
			 }  
		 } else if (pay.equals("N")) {System.out.println("결제가 취소되었습니다.\n"); return "continue";} 
			else {System.out.println("잘못 입력하셨습니다.\n");return "continue";}
		 
		
	}
	
}
	
	
	


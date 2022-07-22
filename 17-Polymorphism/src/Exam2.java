import Army.AirForce;
import Army.Army;
import Army.Navy;
import Army.Unit;

public class Exam2 {
	public static void main(String[] args) {
		//자식 클래스 기준 사용
		AirForce airForce1 = new AirForce("공군 1호");
		AirForce airForce2 = new AirForce("공군 2호");
		Navy navy = new Navy("해군1호");
		Army army1 = new Army("육군 1호");
		Army army2 = new Army("육군 2호");
		
		
		airForce1.attack();
		airForce1.bombing();
		
		airForce2.attack();
		airForce2.bombing();
		
		navy.attack();
		navy.nucleus();
		
		army1.attack();
		army1.tank();
		
		army2.attack();
		army2.tank();
		System.out.println("-------------------------");
		
				
		//부모 클래스 기준 사용
		Unit[] units = new Unit[5];
		units[0]=new AirForce("공군1호");
		units[1]=new AirForce("공군2호");
		units[2]=new Navy("해군1호");
		units[3]=new Army("육군1호");
		units[4]=new Army("육군2호");
		
		for(int i=0; i<units.length;i++) {
			units[i].attack();
			
			if(units[i] instanceof Army) {
				Army a = (Army)units[i];//자식클래스처럼 사용할수 있게됨
				a.tank();
			}else if(units[i] instanceof Navy) {
				Navy n = (Navy)units[i];
				n.nucleus();
			}else if(units[i] instanceof AirForce) {
				AirForce af = (AirForce)units[i];
				af.bombing();
			}
		}

	}

}

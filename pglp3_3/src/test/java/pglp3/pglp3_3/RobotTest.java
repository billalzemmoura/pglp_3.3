package pglp3.pglp3_3;



import java.util.ArrayList;

import org.junit.Test;

public class RobotTest {

	@Test
     public void test() {
ArrayList<Robot>ALLrobot=new ArrayList<Robot>();

ALLrobot.add(new Robot2(20));
ALLrobot.add(new Robot1(20));

for (int i = 0; i < ALLrobot.size(); i++) {
	ALLrobot.get(i).avance();
	
}

for (int i = 0; i < ALLrobot.size(); i++) {
	System.out.println(ALLrobot.get(i).position);
}
	}



}

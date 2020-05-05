package sia.knights;

import org.springframework.context.support.
                   ClassPathXmlApplicationContext;

public class KnightMain {

//  public static void main(String[] args) throws Exception {
//    ClassPathXmlApplicationContext context =
//        new ClassPathXmlApplicationContext(
//            "META-INF/spring/knight.xml");
//    Knight knight = context.getBean(Knight.class);
//    knight.embarkOnQuest();
//    context.close();
//  }
  

   /**测试AOP 面对切面编程*/
  public static void main(String[] args) throws Exception {
	    ClassPathXmlApplicationContext context = 
	        new ClassPathXmlApplicationContext(
	            "META-INF/spring/minstrel.xml");
	    Knight knight = context.getBean(Knight.class);
	    knight.embarkOnQuest();
	    context.close();
	  }

}

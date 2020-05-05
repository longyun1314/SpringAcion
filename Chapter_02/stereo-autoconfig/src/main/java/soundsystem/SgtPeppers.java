package soundsystem;
import org.springframework.stereotype.Component;

/**
 * 这个简单的注解表明该类会作为组件类，并告知Spring要为这个类创建bean，bean的id默认为类名的第一个字母小写（sgtPeppers）
 * 如果想为其设置不同的ID，可以将期望的ID作为值传递给@Component注解，如@Component("lonelyHeartClub")
 * 或者@Named("lonelyHeartClub"),Named注解为Java依赖注入规范的用法
 *
 */
@Component
public class SgtPeppers implements CompactDisc {

  private String title = "Sgt. Pepper's Lonely Hearts Club Band";  
  private String artist = "The Beatles";
  
  public void play() {
    System.out.println("Playing " + title + " by " + artist);
  }
  
}

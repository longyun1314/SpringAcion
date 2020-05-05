package soundsystem;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 组件扫描默认是不开启的，需要显示配置，命令它去寻找带有@Component注解的类，并为其创建bean
 * 设置组件扫描的基础包@ComponentScan("soundsystem")或者@ComponentScan(basePackages="soundsystem")
 * 设置多个基础包：@ComponentScan(basePackages={"soundsystem1","soundsystem2"})
 */
@Configuration
@ComponentScan
public class CDPlayerConfig { 
}

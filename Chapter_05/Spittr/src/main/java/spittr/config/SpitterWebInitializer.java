package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import spittr.web.WebConfig;

/**
 * 替换web.xml 配置DispatchServlet和Spring上下文
 * 任何实现AbstractAnnotationConfigDispatcherServletInitializer
 * 的类都会自动配置DispatchServlet和ContextLoaderListener上下文
 * DispatchServlet加载包含Web组件的bean，如控制器、视图解析器以及处理器映射
 * 而ContextLoaderListener加载应用中的其他bean，通常是驱动应用后端的中间层和数据层组件
 */
public class SpitterWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
  /**
   * @Description:返回的带有@configuration注解的类将会用来配置ContextLoaderListener
   * 创建的应用上下文的bean
   * @raram
   * @return java.lang.Class<?>[]
   * @Date: 2020/6/13 23:47
   * @author li_qiaoyun
   **/
  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class<?>[] { RootConfig.class };
  }
  /**
   * @Description:返回的带有@configuration注解的类将会用来配置DispatchServlet
   * 创建的应用上下文的bean
   * @raram
   * @return java.lang.Class<?>[]
   * @Date: 2020/6/13 23:40
   * @author li_qiaoyun
   **/
  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class<?>[] { WebConfig.class };
  }

  /**
   * @Description:将一个和多个路径映射到DispatchServlet上，本例中，他映射的是“/”,这表示他是默认的servlet,
   * 他会处理进入应用的所有请求
   * @raram
   * @return java.lang.String[]
   * @Date: 2020/6/13 23:37
   * @author li_qiaoyun
   **/
  @Override
  protected String[] getServletMappings() {
    return new String[] { "/" };
  }

}
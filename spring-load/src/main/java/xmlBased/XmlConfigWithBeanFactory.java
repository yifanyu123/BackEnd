package xmlBased;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * TODO 类描述
 *
 * @author yuyifan
 */
public class XmlConfigWithBeanFactory {
    public static void main(String[] args) {
        DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
        XmlBeanDefinitionReader rdr=new XmlBeanDefinitionReader(factory);
        rdr.loadBeanDefinitions(new ClassPathResource("/app-context.xml"));
        MessageRenderer renderer=factory.getBean("renderer",MessageRenderer.class);
        renderer.renderer();
    }
}

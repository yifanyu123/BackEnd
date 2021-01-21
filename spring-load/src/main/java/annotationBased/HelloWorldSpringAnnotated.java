package annotationBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import xmlBased.MessageRenderer;

/**
 * TODO 类描述
 *
 * @author yuyifan
 */
public class HelloWorldSpringAnnotated {

    public static void main(String args[]) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(
                HelloWorldConfiguration.class);
        MessageRenderer renderer = ctx.getBean("renderer", MessageRenderer.class);
        renderer.renderer();
    }
}

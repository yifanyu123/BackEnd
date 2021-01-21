package xmlBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO 类描述
 *
 * @author yuyifan
 */
public class HelloWordApplication {
    public static void main(String args[]){
        ApplicationContext ctx= new ClassPathXmlApplicationContext("/app-context.xml");
        MessageRenderer renderer=ctx.getBean("renderer",MessageRenderer.class);
        renderer.renderer();

    }

}

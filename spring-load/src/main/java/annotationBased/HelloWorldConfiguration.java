package annotationBased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import xmlBased.HelloWordMessageProvider;
import xmlBased.MessageRenderer;
import xmlBased.StandardMessageRenderer;

/**
 * TODO 类描述
 *
 * @author yuyifan
 */
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public xmlBased.MessageProvider provider(){
        return new HelloWordMessageProvider();
    }

    @Bean
    public MessageRenderer renderer(){
        MessageRenderer r=new StandardMessageRenderer();
        r.setMessageProvider(provider());
        return r;

    }

}

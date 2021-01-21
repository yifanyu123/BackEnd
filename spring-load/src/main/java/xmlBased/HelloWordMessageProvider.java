package xmlBased;

/**
 * TODO 类描述
 *
 * @author yuyifan
 */
public class HelloWordMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "HelloWord!";
    }
}

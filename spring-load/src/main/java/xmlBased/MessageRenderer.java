package xmlBased;

/**
 * TODO 类描述
 *
 * @author yuyifan
 */
public interface MessageRenderer {
    void renderer();
    void setMessageProvider(MessageProvider messageProvider);
    MessageProvider getMessageProvider();

}
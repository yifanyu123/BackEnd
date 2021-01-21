package xmlBased;

/**
 * TODO 类描述
 *
 * @author yuyifan
 */
public class StandardMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider;

    @Override
    public void renderer() {
        if (messageProvider==null){
            throw new RuntimeException("error");
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}

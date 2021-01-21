import java.io.Serializable;

import lombok.Data;

/**
 * User类
 *
 * @author xcw
 */
@Data
public class User implements Serializable {

    private String name;
    private Integer age;
}

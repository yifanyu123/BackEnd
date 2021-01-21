import redis.clients.jedis.Jedis;
public class redisTest {


        public static void main(String args[]){
            // 1. 设置IP地址和端口
            Jedis jedis = new Jedis("136.244.81.99",6379);
            jedis.auth("escape.0811");
            // 2. 保存数据
            jedis.set("name","xcw");
            // 3. 获取数据
            String value = jedis.get("name");
            System.out.println(value);
            // 4.释放资源
            jedis.close();
        }

    }


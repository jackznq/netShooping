import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by ddfhznq on 2017/10/19.
 */
@SpringBootApplication
public class DubboApplication
{
    public static void main(String[] args)
    {
        SpringApplication application = new SpringApplication(DubboApplication.class);
        application.run(args);
    }
}

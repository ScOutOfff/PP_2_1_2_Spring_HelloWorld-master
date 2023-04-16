import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorldBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloWorldBean.getMessage());

        HelloWorld helloWorldBean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloWorldBean2.getMessage());

        Cat catBean = applicationContext.getBean("cat", Cat.class);
        System.out.println(catBean.getName());


        Cat catBean2 = applicationContext.getBean("cat", Cat.class);
        System.out.println(catBean2.getName());

        System.out.println(helloWorldBean.equals(helloWorldBean2));
        System.out.println(catBean.equals(catBean2));


    }
}
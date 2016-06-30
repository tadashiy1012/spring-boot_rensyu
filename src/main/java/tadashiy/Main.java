package tadashiy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {
  public static void main(String[] args) {
    try (ConfigurableApplicationContext ctx = SpringApplication.run(Main.class, args)) {
      Main m = ctx.getBean(Main.class);
      m.hello();
      Hoge h = ctx.getBean(Hoge.class);
      System.out.println(h);
    }
  }
  public void hello() {
    System.out.println("Hello Spring Boot!!");
  }
  @Bean
  public Hoge getHoge() {
    return new Hoge("hoge");
  }
}
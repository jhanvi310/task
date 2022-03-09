package printmessage;
import org.springframework.boot.SpringApplication;

import reactor.core.publisher.Flux;
public class App {
	public static void main(String [] args){
		System.out.println("Hello World!!"); 
		Flux<String> dataStream = Flux.just("Hello World");
		SpringApplication.run(App.class, args);
		dataStream.subscribe(prog ->
		{
		 System.out.println(prog);
		});
	}
}

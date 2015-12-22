package me.biezhi.hello;

import blade.kit.json.JsonObject;

import com.blade.Blade;
import com.blade.route.RouteHandler;
import com.blade.web.http.Request;
import com.blade.web.http.Response;

/**
 * Hello Blade!
 */
public class App {
	
	public static void main(String[] args) {
		Blade blade = Blade.me();
		
		/**
		 * JDK1.6
		 */
		blade.get("/", new RouteHandler() {
			public void handle(Request request, Response response) {
				response.html("<h1>Hello Blade！</h1>");
			}
		});
		
		// java8
		blade.get("/hello", (req,res) -> {
			JsonObject jsonObject = new JsonObject();
			jsonObject.add("name", "biezhi");
			jsonObject.add("blog", "https://biezhi.me");
			res.json(jsonObject.toString());
		});
		
		blade.before("/.*", (req,res) -> {
			System.out.println("before");
		});
		
		blade.listen(9001).start();
		
	}
	
}

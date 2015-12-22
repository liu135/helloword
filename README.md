#hello

This is `blade` framework of an initial project, running is very simple, experience the charm of it!

```java
/**
 * Hello Blade!
 */
public class App extends Bootstrap {

	@Override
	public void init() {}
	
	public static void main(String[] args) throws Exception {
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
```
### Run

```sh
git clone https://github.com/bladejava/hello.git
```

Import Project to your IDE. Run `main` method.

### Console

```bash
2015-10-10 16:24:49,677 DEBUG [main] com.blade.route.impl.DefaultRouteMatcher | Add Route：GET:/
2015-10-10 16:24:49,732 DEBUG [main] com.blade.route.impl.DefaultRouteMatcher | Add Route：GET:/hello
2015-10-10 16:24:49.804:INFO::main: Logging initialized @340ms
2015-10-10 16:24:49.921:INFO:oejs.Server:main: jetty-9.3.4.v20151007
2015-10-10 16:24:49,987 INFO [main] com.blade.ioc.impl.DefaultContainer | register object：me.biezhi.hello.App=me.biezhi.hello.App@f5f2bb7
2015-10-10 16:24:49,987 INFO [main] com.blade.CoreFilter | blade init complete!
2015-10-10 16:24:49.990:INFO:oejsh.ContextHandler:main: Started o.e.j.s.ServletContextHandler@25618e91{/,file:///C:/Users/renqi/AppData/Local/Temp/,AVAILABLE}
2015-10-10 16:24:50.027:INFO:oejs.ServerConnector:main: Started ServerConnector@668d9470{HTTP/1.1,[http/1.1]}{0.0.0.0:9001}
2015-10-10 16:24:50.028:INFO:oejs.Server:main: Started @566ms

2015-10-10 16:25:07,540 DEBUG [qtp193064360-17] com.blade.FilterHandler | Request : GET	/
2015-10-10 16:24:58,709 DEBUG [qtp193064360-15] com.blade.FilterHandler | Request : GET	/hello
```

### Web

[http://localhost:9001/](http://localhost:9001/)

![](https://i.imgur.com/WYyTRrD.png)

[http://localhost:9001/hello](http://localhost:9001/hello)

![](https://i.imgur.com/2V60Eh3.png)
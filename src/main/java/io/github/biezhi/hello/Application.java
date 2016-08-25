package io.github.biezhi.hello;

import static com.blade.Blade.me;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.blade.Blade;
import com.blade.embedd.EmbedJettyServer;
import com.blade.kit.json.JSONObject;
import com.blade.route.RouteHandler;
import com.blade.web.http.Request;
import com.blade.web.http.Response;
import com.bladejava.view.template.VelocityTemplateEngine;

/**
 * Hello Blade!
 */
public class Application {

	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) throws Exception {
		
		Blade blade = me();
		blade.staticFolder("static");
		
		blade.viewEngin(new VelocityTemplateEngine());
		
		// jdk6
		blade.get("/", new RouteHandler() {
			public void handle(Request request, Response response) {
				response.html("<h1>Hello Blade！</h1>");
			}
		});

		// jdk8
		blade.get("/hello", (req, res) -> {
			JSONObject obj = new JSONObject();
			obj.put("name", "biezhi");
			obj.put("blog", "https://biezhi.me");
			res.json(obj.toString());
		});

		blade.get("/show", new RouteHandler() {
			public void handle(Request request, Response response) {
				request.attribute("name", "blade-1.6");
				response.render("views/show.vm");
			}
		});
		
		blade.before("/.*", (req, res) -> {
			LOGGER.info("before ...");
		});
		
		blade.start(EmbedJettyServer.class);
		
	}

}
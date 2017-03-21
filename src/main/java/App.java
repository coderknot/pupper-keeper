import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class  App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/new_pupper", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      ArrayList<Pupper> puppersArrayList = request.session().attribute("puppersList");

      if(puppersArrayList == null) {
        puppersArrayList = new ArrayList<Pupper>();
        request.session().attribute("puppersList", puppersArrayList);
      }

      String name = request.queryParams("name");
      String breed = request.queryParams("breed");
      String age = request.queryParams("age");
      String bio = request.queryParams("bio");

      Pupper newPupper = new Pupper(name, breed, age, bio);
      puppersArrayList.add(newPupper);

      model.put("puppersList", request.session().attribute("puppersList"));
      model.put("template", "templates/pupper-list.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}

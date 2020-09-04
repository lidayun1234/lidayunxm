import com.alibaba.fastjson.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.URIParameter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(urlPatterns="/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.doGet(req, resp);
        Map<String ,Object> map=new HashMap<>();
        map.put("name","aaa");
        String json=JSONObject.toJSONString(map);
        resp.getWriter().print(json);
        resp.getWriter().flush();
        resp.getWriter().close();

    }
}

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.79
 * Generated at: 2023-05-09 17:55:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.learn.mycart.helper.FactoryProvider;
import com.learn.mycart.entities.Product;
import com.learn.mycart.dao.ProductDao;
import com.learn.mycart.dao.CategoryDao;
import com.learn.mycart.entities.Category;
import com.learn.mycart.helper.ProductDiscription;
import java.util.List;
import com.learn.mycart.entities.User;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/components/common_css_js.jsp", Long.valueOf(1682755900259L));
    _jspx_dependants.put("/components/navbar.jsp", Long.valueOf(1683654020712L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.learn.mycart.helper.FactoryProvider");
    _jspx_imports_classes.add("com.learn.mycart.entities.Product");
    _jspx_imports_classes.add("com.learn.mycart.entities.Category");
    _jspx_imports_classes.add("com.learn.mycart.dao.CategoryDao");
    _jspx_imports_classes.add("com.learn.mycart.dao.ProductDao");
    _jspx_imports_classes.add("com.learn.mycart.entities.User");
    _jspx_imports_classes.add("com.learn.mycart.helper.ProductDiscription");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>MyCart</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--css-->\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- javascript -->\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"js/script.js\"></script>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	");
      out.write('\r');
      out.write('\n');

		User user1 = (User)session.getAttribute("current-user");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"element-shadow navbar-expand-lg navbar-dark navbar mb-3 bg-body-tertiary mycart-bg\">\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <a class=\"navbar-brand\" href=\"index.jsp\">MyCart</a>\r\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNavDropdown\" aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarNavDropdown\">\r\n");
      out.write("      <ul class=\"navbar-nav\">\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"index.jsp\">Home</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"#\">Features</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"#\">Pricing</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item dropdown\">\r\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("            Categories\r\n");
      out.write("          </a>\r\n");
      out.write("          <ul class=\"dropdown-menu\">\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Action</a></li>\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Another action</a></li>\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Something else here</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>      \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    ");

    
    if(user1 == null){
    
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("      	<li class=\"nav-item active\">\r\n");
      out.write("      		<a class=\"nav-link active\" href=\"login.jsp\">Login</a>\r\n");
      out.write("      	</li>\r\n");
      out.write("      	<li class=\"nav-item active\">\r\n");
      out.write("      		<a class=\"nav-link active\" href=\"register.jsp\">Register</a>\r\n");
      out.write("      	</li>\r\n");
      out.write("      	      \r\n");
      out.write("      </ul>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    ");
	
    	
    }
    
    
    
    
    
    else{
    	
    
      out.write("\r\n");
      out.write("    <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("      	<li class=\"nav-item active\">\r\n");
      out.write("      		<a class=\"nav-link\" href=\"#!\">");
      out.print( user1.getUserName() );
      out.write("</a>\r\n");
      out.write("      	</li>\r\n");
      out.write("      	<li class=\"nav-item active\">\r\n");
      out.write("      		<a class=\"nav-link\" href=\"logoutServlet\">Logout</a>\r\n");
      out.write("      	</li>\r\n");
      out.write("      	      \r\n");
      out.write("      </ul>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    ");
	
    	
    	
    }
    
    
    
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"row mx-2\">\r\n");
      out.write("\r\n");
      out.write("		");

		
			String cat=request.getParameter("category");
		
			ProductDao dao = new ProductDao(FactoryProvider.getFactory());
		List<Product> list=null;
						
						
		    if( cat==null || cat.trim().equals("all"))
			{
				list = dao.getAllProducts();
			}else{
				
				int cid=Integer.parseInt(cat.trim());
				list=dao.getAllProductsById(cid);
				
			}
		
			
			CategoryDao cdao = new CategoryDao(FactoryProvider.getFactory());
			List<Category> clist = cdao.getCategories();
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<!-- show categories -->\r\n");
      out.write("		<div class=\"col-md-2\">\r\n");
      out.write("			<div class=\"list-group element-shadow\">\r\n");
      out.write("				<a href=\"index.jsp?category=all\" class=\"list-group-item list-group-item-action active\"\r\n");
      out.write("					aria-current=\"true\"> All Products </a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				");

					for (Category c : clist) {
						//	out.println(c.getCategoryTitle() + "<br>");
				
      out.write("\r\n");
      out.write("				<a href=\"index.jsp?category=");
      out.print( c.getCategoryId() );
      out.write("\" class=\"list-group-item list-group-item-action\">");
      out.print(c.getCategoryTitle());
      out.write("</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				");

					}
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<!-- show products -->\r\n");
      out.write("		<div class=\"col-md-9\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			\r\n");
      out.write("				<!-- col:12 -->\r\n");
      out.write("\r\n");
      out.write("				<div class=\"col-md-12\">\r\n");
      out.write("					<div class=\"row row-cols-1 row-cols-md-3 g-4 mb-3\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("						<!-- traversing products -->\r\n");
      out.write("						");

							for (Product p : list) {
						
      out.write("\r\n");
      out.write("						<div class=\"col\">\r\n");
      out.write("						<div class=\"card element-shadow product-card\">\r\n");
      out.write("							<div class=\"container text-center\">\r\n");
      out.write("								<img src=\"img/products/");
      out.print(p.getProductPic());
      out.write("\"\r\n");
      out.write("									style=\"max-height: 200px; max-width: 100%; \"\r\n");
      out.write("									class=\" m-2\" alt=\"...\">\r\n");
      out.write("\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<div class=\"card-body\">\r\n");
      out.write("\r\n");
      out.write("								<h5 class=\"card-title\">");
      out.print(p.getProductName());
      out.write("</h5>\r\n");
      out.write("								<p class=\"card-text\">");
      out.print(ProductDiscription.get10Words(p.getProductDescription()));
      out.write("</p>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"card-footer\">\r\n");
      out.write("								<button class=\"btn btn-outline-success\" disabled>&#8377; ");
      out.print( p.getDiscountedPrice());
      out.write("/- <span class=\"text-secondary discount-label text-strike\">");
      out.print(p.getProductPrice());
      out.write("/-</span><span class=\"discount-label discount-color\"> ");
      out.print( p.getProductDiscount());
      out.write("% off</span></button>\r\n");
      out.write("								<button class=\"btn btn-primary mycart-btn\">Add to Cart</button>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("						");

							}
						
								if(list.size()==0)
								{
									out.println("<h3>No item in this Category!!!</h3>");
								}
						
						
      out.write("\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.KrrCommon;
import org.Staff;
import org.dblayer;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.sun.net.ssl.HttpsURLConnection;
import com.sun.org.apache.bcel.internal.generic.Type;


public class reqres extends HttpServlet {

	Connection con;
	org.Global_Data Global_Data=new org.Global_Data();
	org.Initclass initclass=new org.Initclass();
	org.dblayer dblayer=new org.dblayer();
	org.KrrCommon KrrCommon=new org.KrrCommon();
	public reqres() {
		super();
	}

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}


	public void init() throws ServletException
	{
		initclass.initurl(getServletContext().getRealPath("/properties/database.properties"), Global_Data);
	}
	public void service (javax.servlet.http.HttpServletRequest req ,
			javax.servlet.http.HttpServletResponse resp ) throws ServletException, IOException
			{
		org.ActionErrors errors=new org.ActionErrors();

		con = initclass.getConnection(Global_Data, errors);
		String l_ers;
		String urlString = "http://irem.apsfl.co.in:9999/irem/status";
		// create the url
		URL url = new URL(urlString);

		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
		String line;
		while ((line = reader.readLine()) != null)
		{
			Gson gson = new Gson();
			java.lang.reflect.Type type = new TypeToken<List<Staff>>() {}.getType();
			List<Staff> fromJson = gson.fromJson(line, type);
			for (Staff task : fromJson)
			{
				System.out.println(task);
//				l_ers=dblayer.get_devicedetails(con,task);
//				System.out.println("dsfsdfsdfds"+l_ers);
					l_ers=dblayer.insert_devicedetails(con, task);
			}
//			System.out.println("size "+fromJson.size());

		}
			}

}

package org;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class dblayer 
{
	org.KrrCommon KrrCommon=new org.KrrCommon();
	public String insert_devicedetails(Connection con,Staff task)   
	{
		String errMsg="";
		Statement stmt=null;
		String sql="";
		try
		{
			System.out.println("in db GPSRNO");
			sql="INSERT INTO Staff(";
			sql=sql+"deviceId, ";
			sql=sql+"name, ";
			sql=sql+"inputVoltage, ";
			sql=sql+"outputVoltage, ";
			sql=sql+"batteryVoltage, ";
			sql=sql+"status, ";
			sql=sql+"temperature, ";
			sql=sql+"smokeStatus,";
			sql=sql+"lastConnectedTime";
			sql=sql+") VALUES (";
			sql=sql+KrrCommon.AppendSinlequote(task.getDeviceId())+", ";
			sql=sql+KrrCommon.AppendSinlequote(task.getName())+", ";
			sql=sql+KrrCommon.AppendSinlequote(task.getInputVoltage())+", ";
			sql=sql+KrrCommon.AppendSinlequote(task.getOutputVoltage())+", ";
			sql=sql+KrrCommon.AppendSinlequote(task.getBatteryVoltage())+", ";
			sql=sql+KrrCommon.AppendSinlequote(task.getStatus())+", ";
			sql=sql+KrrCommon.AppendSinlequote(task.getTemperature())+", ";
			sql=sql+KrrCommon.AppendSinlequote(task.getSmokeStatus())+", ";
			sql=sql+KrrCommon.AppendSinlequote(task.getLastConnectedTime())+") ";
			System.out.println(sql);	
			stmt=con.createStatement();
			stmt.executeQuery(sql);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			errMsg=e.getMessage();
		}
		finally
		{
			try
			{
				if(stmt != null) stmt.close();
			}
			catch(Exception e2) 
			{
				e2.printStackTrace();
			}
		}
		return errMsg;
	}
	
}

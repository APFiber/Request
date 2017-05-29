package org;

public class Staff {
	private String deviceId;
	private String name;
	private String inputVoltage;
	private String outputVoltage;
	private String batteryVoltage;
	private String status;
	private String temperature;
	private String smokeStatus;
	private String lastConnectedTime;
	
	public Staff(){      
	   }
	    
	   public Staff(String deviceId,String name,String inputVoltage,String outputVoltage,String batteryVoltage,String status,String temperature,String smokeStatus,String lastConnectedTime)
	   {
	      this.deviceId = deviceId;
	      this.name = name;
	      this.inputVoltage = inputVoltage;
	      this.outputVoltage = outputVoltage;
	      this.batteryVoltage = batteryVoltage;
	      this.status = status;
	      this.temperature = temperature;
	      this.smokeStatus = smokeStatus;
	      this.lastConnectedTime = lastConnectedTime;
	   }
	   
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInputVoltage() {
		return inputVoltage;
	}
	public void setInputVoltage(String inputVoltage) {
		this.inputVoltage = inputVoltage;
	}
	public String getOutputVoltage() {
		return outputVoltage;
	}
	public void setOutputVoltage(String outputVoltage) {
		this.outputVoltage = outputVoltage;
	}
	public String getBatteryVoltage() {
		return batteryVoltage;
	}
	public void setBatteryVoltage(String batteryVoltage) {
		this.batteryVoltage = batteryVoltage;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getSmokeStatus() {
		return smokeStatus;
	}
	public void setSmokeStatus(String smokeStatus) {
		this.smokeStatus = smokeStatus;
	}
	public String getLastConnectedTime() {
		return lastConnectedTime;
	}
	public void setLastConnectedTime(String lastConnectedTime) {
		this.lastConnectedTime = lastConnectedTime;
	}
	public String toString()
	   {
	      return "Staff [deviceId=" + deviceId + ", name=" + name + ", inputVoltage=" + inputVoltage + ", outputVoltage=" + outputVoltage + ", batteryVoltage=" + batteryVoltage + 
	            ", status=" + status + ", temperature=" + temperature +", smokeStatus=" + smokeStatus +", lastConnectedTime=" + lastConnectedTime + "]";
	   }
}

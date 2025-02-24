class SmartHome {
	public static final class Device {
		public static final int MAX_DEVICES = 50;
		private int id;
		private String name;

		public Device(int id, String name) {
			this.id = id;
			this.name = name;
		}
		public final String getDeviceInfo() {
			return "Device ID: " + id + ", Name: " + name;
		}
	}
	public static final class Configuration {
		public static final int Max_Power_Limit = 5000;
	}
	public static abstract class DeviceType {
		public abstract String getDeviceCategory();
	}
	public static class LightDevice extends DeviceType {
		public String getDeviceCategory() {
			return "Light Device";
		}
	}
	public static class FanDevice extends DeviceType {
		public String getDeviceCategory() {
			return "Fan Device";
		}
	}
	public static void main(String[] args) {
		Device device = new Device(101, "Smart Light");
		System.out.println(device.getDeviceInfo());
		System.out.println("MAX Power Limit: " + Configuration.Max_Power_Limit);
		DeviceType light = new LightDevice();
		DeviceType fan = new FanDevice();
		System.out.println("Light Device Category: " + light.getDeviceCategory());
		System.out.println("Fan Device Category: " + fan.getDeviceCategory());
	}
}

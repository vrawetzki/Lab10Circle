import java.util.Scanner;

public class Circle{
	
	private double radius; 
	private double PI = Math.PI;
	private double circumference;
	
		
		public Circle(double radius) {
			this.radius = radius;
			}
		
		public double getCircumference() {
			return PI * 2 * radius;
		}
		
		public double getArea() {
			return PI * Math.pow(radius, 2);
		}
		
		private static String formatNumber(double x) {
			x = (Math.round(x *100.00) / 100.00);
			return Double.toString(x);
			}
		public String getFormattedCircumference() {
			return formatNumber(getCircumference());
		}
		public String getFormattedArea() {
			return formatNumber(getArea());
		}
	}


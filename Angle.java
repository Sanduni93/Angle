class Angle{
	
	public static void main(String args[]){
		
		System.out.println("The degree of angle:"+args[0]);
		double a = Double.parseDouble(args[0]);
		double r = (a*Math.PI)/180 ;
		System.out.println("Angle in radiand:"+r);
		
		
	}
}
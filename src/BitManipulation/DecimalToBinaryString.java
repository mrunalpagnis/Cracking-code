package BitManipulation;

public class DecimalToBinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double decimal = 0.999;
		if(	decimal <= 0 || decimal >=1 ){
			System.out.println("ERROR");
			return;
		}
		StringBuilder sb = new StringBuilder();
		sb.append(".");
		while(decimal>0){
			if(sb.length()>=32){
				System.out.println("ERROR");
				return;
			}
			double r = decimal * 2;
			if(r>=1){
				sb.append(1);
				decimal = r - 1;
			}
			else{
				sb.append("0");
				decimal = r;
			}
		}
		System.out.println(sb.toString());
	}

}

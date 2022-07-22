
public class Practice1 {
	public static void main(String[] args) {
		String file = "D:/photo/2021/travel/food.jpg";
		int name_position = file.lastIndexOf("/")+1;
		int jpg_position = file.lastIndexOf(".")+1;
		
		String [] data = new String[3];
		data[0] = file.substring(name_position,jpg_position-1);
		data[1] = file.substring(jpg_position);
		data[2] = file.substring(0,name_position);

		for(int i=0; i<data.length;i++) {
			System.out.println(data[i]);
		}
	}
}

package week10a;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IdGenerator {
	public static String generator(Product product) {
		SimpleDateFormat temp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		String date = temp.format(new Date());
		String id = "";

		if (product instanceof Movie) {
			id += "MOV" + date;
		} else if (product instanceof Game) {
			id += "GAM" + date;
		} else {
			id += "BOO" + date;
		}

		return id;

	}
}

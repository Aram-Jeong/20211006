package co.micol.prj;

import java.util.HashMap;
import java.util.Map;

import co.micol.prj.vo.Bicle;
import co.micol.prj.vo.Car;
import co.micol.prj.vo.Command;

public class MainApp {
	private static Map<String, Command> map=new HashMap<String,Command>();
	public static void main(String[] args) {
		map.put("car", new Car());
		map.put("bicle", new Bicle());
		
		Command command=map.get("bicle");
		command.run();

	}
}

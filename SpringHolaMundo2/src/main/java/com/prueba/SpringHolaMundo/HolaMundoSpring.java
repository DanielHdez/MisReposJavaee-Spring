package com.prueba.SpringHolaMundo;
import org.springframework.stereotype.Service;
@Service("miHolaMundo")
public class HolaMundoSpring {
	
	public void decirHola() {
		System.out.println("Hola Mundo desde Spring");
	}


}

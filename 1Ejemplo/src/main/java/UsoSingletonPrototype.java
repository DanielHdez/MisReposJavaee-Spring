import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.soft.ioc.DirectorEmpleado;
import com.soft.ioc.SecretarioEmpleado;

public class UsoSingletonPrototype {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("aplicationContext2.xml");
		SecretarioEmpleado Juan=contexto.getBean("secretario", SecretarioEmpleado.class);
		SecretarioEmpleado Pepe=contexto.getBean("secretario", SecretarioEmpleado.class);
		System.out.println("este es juan "+Juan);
		System.out.println("este es pepe "+Pepe);
		
		if(Juan==Pepe) {
			
			System.out.println("Apuntan al mismo objeto");
		}else {
			System.out.println("No es lo mismo");
		}
		
		/*System.out.println(Juan.getTareas());
		System.out .println(Juan.getInforme());
		System.out .println(Juan.getEmail());
		System.out .println(Juan.getNombreEmpresa());
		System.out.println("/n"+Pepe.getTareas());
		System.out .println(Pepe.getInforme());
		System.out .println(Pepe.getEmail());
		System.out .println(Pepe.getNombreEmpresa());*/
		
	
		
		contexto.close();

	}

}

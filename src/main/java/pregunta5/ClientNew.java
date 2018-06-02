package pregunta5;

public class ClientNew {
	public static void main(String[] args) {
				
        ComputerAbstractFactory pcFactory = ComputerAbstractFactory.getComputerFactory("Basic");

        Computer basicComputer = pcFactory.createBasicComputer();		
                
        System.out.println("Basic Computer:\n" + basicComputer.getDescription());
        
    }
}

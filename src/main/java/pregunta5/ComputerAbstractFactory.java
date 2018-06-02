package pregunta5;

public abstract class ComputerAbstractFactory {

	public static final String BASIC = "Basic";
	public static final String OFFICE = "Office";
	public static final String DEVELOPER = "Developer";
	public static final String HIGHEND = "HighEnd";
	
	public static ComputerAbstractFactory getComputerFactory(String tipo) {
        if (tipo.equals(BASIC)) {
            return new BasicComputerFactory();
        }
        if (tipo.equals(OFFICE)) {
            return new OfficeComputerFactory();
        }
        if (tipo.equals(DEVELOPER)) {
        	return new DeveloperComputerFactory();
        }
        if (tipo.equals(HIGHEND)) {
        	return new HighEndComputerFactory();
        }
        return new BasicComputerFactory();
    }

    public abstract BasicComputer createBasicComputer();

    public abstract OfficeComputer createOfficeComputer();

    public abstract DeveloperComputer createDeveloperComputer();
    
    public abstract HighEndComputer createHighEndComputer();
}

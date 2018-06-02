package pregunta4;

public class NotificationTest {
	public static void main(String[] args) {
        Notification notifica = new Notification();
        
		String texto = "El enfoque tradicional sobre el desarrollo de aplicaciones "
        		+ "[1] 2018, Autor A, ABCDS; se centró en el monolito, donde todas las partes de la aplicación "
        		+ "que se pueden implementar están contenidas en esa única aplicación. "
        		+ "Esto tiene sus desventajas: cuanto más grande es la aplicación, más "
        		+ "difícil resulta [2] 2017, Autor B, XXSXS; solucionar nuevos problemas rápidamente y agregar "
        		+ "nuevas funciones. Un enfoque basado en microservicios para la creación "
        		+ "de aplicaciones ayuda a [3] 2018, Autor C, WWWWW; resolver estos problemas y a impulsar el desarrollo "
        		+ "y la capacidad de respuesta.";
        
        evaluaReferencias(notifica, texto);
        notifica.toString();
    }
	
	public static void evaluaReferencias(Notification notif, String texto) {
		String[] tokens = texto.split("\\[");

		for(String s: tokens) {
			if(s.substring(1,2).equals("]")) {			
		    String[] ref = new String[3];
		    ref[0] = s.substring(3,7);
		    ref[1] = s.substring(9,s.indexOf(",", 9));
		    ref[2] = s.substring(s.indexOf(",", 9),s.indexOf(";", 9));
		    notif.addRefIEEE(ref);
			}
		}
		
	}
}

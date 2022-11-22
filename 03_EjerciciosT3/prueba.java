package pruebas3;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Pruebas3 {
    public static void main(String[] args) {
        String nombreSO="os.name";
        String versionSO="os.version";
        String arquitecturaSO="os.arc";
        String homeSO= "java.home";
        String vendorSO= "java.vendor";
        
        System.out.println("\n Informacion sobre el SO");
        System.out.println("\n Informacion sobre el SO");
        System.out.println("\nNombre del SO:"+System.getProperty(nombreSO));
        System.out.println("\nVersion del SO:"+System.getProperty(versionSO));
        System.out.println("\nArquitectura del SO:"+System.getProperty(arquitecturaSO));
        System.getProperty("path.separator");
        System.out.println("\nDirectorio de instalacion JRE:"+System.getProperty(homeSO));
        System.out.println("\nNombre del proveedor de JRE:"+System.getProperty(vendorSO));
    }
    
}

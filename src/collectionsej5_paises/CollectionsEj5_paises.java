
package collectionsej5_paises;

import Service.PaisService;

public class CollectionsEj5_paises {

    public static void main(String[] args) {
        
        PaisService paiS = new PaisService();
        
        paiS.crear();
        
        //System.out.println("Existe el pais? " + paiS.buscar());
        
        paiS.eliminar();
        
    }
    
}


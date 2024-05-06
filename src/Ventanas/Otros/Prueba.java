package Ventanas.Otros;

import org.tensorflow.SavedModelBundle;
import org.tensorflow.Session;

public class Prueba {

    public static void main(String[] args) {
        String rutaModeloH5 = "C:\\Users\\Cristopher\\Downloads\\model.h5";
        try (SavedModelBundle model = SavedModelBundle.load(rutaModeloH5, "serve")) {
            Session session = model.session();
            System.out.println(model);
            System.out.println(session);
        } catch (Exception e) {
        }
    }

}

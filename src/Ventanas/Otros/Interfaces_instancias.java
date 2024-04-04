package Ventanas.Otros;

import Ventanas.Ayuda.Ayuda;
import Ventanas.Crear_modelo.Crear_modelo;
import Ventanas.Detectar.Detectar;
import Ventanas.Menu.Menu;

/**
 * La interfaz Interfaces almacena instancias de interfaces que no necesitan parámetros
 * en sus constructores para hacerlas reutilizables. Cada instancia se declara como una constante.
 * 
 * @author Cristopher Yahir Baca Martinez
 */
public interface Interfaces_instancias {
    
    // Instancia de la interfaz Ayuda.
    Ayuda AYUDA = new Ayuda();
    
    // Instancia de la interfaz Crear_modelo.
    Crear_modelo CREAR_MODELO = new Crear_modelo();
    
    // Instancia de la interfaz Detectar.
    Detectar DETECTAR = new Detectar();
    
    // Instancia de la interfaz Menu.
    Menu MENU = new Menu();
}

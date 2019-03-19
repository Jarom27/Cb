/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaPrincipal;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author SCO3
 */
public class View {
    private Map<String,Object> informacion;
    public static void Show(String vista){
        
    }
    public static void EstablecerInformacion(String claveDelaInformacion,Object info){
        this.informacion = new HashMap();   
    }
}


package listas.doblemente.ligadas3232;

import javax.swing.JOptionPane;

/**
 *
 * @author Mariana M
 */
public class ListasDoblementeLigadas {

   
    public static void main(String[] args) {
       int opc, d;
        Lista L1 = new Lista();
        Lista L2 = new Lista();
        Lista L3 = new Lista();
        do
        {   
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                     1. Insertar Inicio.
                                                                     2. Insertar al final.
                                                                     3. Insertar Ordenado Ascendente.
                                                                     4. Ordenar lista Ascendente.
                                                                     5. Ordenar Lista descendente.
                                                                     6. Buscar(Mostrar una posici\u00f3n).
                                                                     7. Eliminar.
                                                                     8. Reemplazar.
                                                                     9. Multiplicación de datos (listas).
                                                                     10.Intercalado.
                                                                     11.Salir.
                                                                     """, "Menú Principal",3));
            
            switch (opc)
            {
                case 1 ->
                {
                    d = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dato a insertar "));
                    L1.InsertarInicio(d);
                    JOptionPane.showMessageDialog(null, "Dato insertado","Insertar inicio",1);
                    L1.Mostrar();
                }
                case 2 ->
                {
                    d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato a insertar : ")) ;
                    L1.InsertarFinal(d);
                    JOptionPane.showMessageDialog(null, "Dato insertado");
                    L1.Mostrar();
                }
                 case 3 ->
                {
                    d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato a insertar : ")) ;
                    L1.InsertarOrdenado(d);
                    JOptionPane.showMessageDialog(null, "Dato insertado");
                    L1.Mostrar();
                }
                  case 4 ->
                {
                    L1.OrdenarAsc();
                    L1.Mostrar();
                }
               
                  case 5 ->
                {
                    
                    L1.OrdenarDes();
                    L1.Mostrar();
                }
                
                  case 6 ->
                {
                    d= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato que desees buscar: ")) ;
                    L1.Buscar(d);
                    L1.Mostrar();
                }
                  case 7 ->
                  {
                      d = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dato que quieres eliminar "));
                      L1.Eliminar(d);
                      L1.Mostrar();
                  }
                  case 8 ->
                  {
                      d = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dato que quieres remplazar "));
                      L1.Reemplazar(d);
                      L1.Mostrar();
                      
                  }
                case 9 ->
                {
                    JOptionPane.showMessageDialog(null, "Llena la lista 1 ");
                    L1.Llenar();
                    L1.Mostrar();
                    JOptionPane.showMessageDialog(null, "Llena la lista 2 ");
                    L2.Llenar();
                    L2.Mostrar();
                    L3.MultiplicarListas(L1, L2);
                    L3.Mostrar();
                }
                case 10 ->
                {
                    JOptionPane.showMessageDialog(null, "Llena la lista 1 ");
                    L1.Llenar();
                    L1.Mostrar();
                    JOptionPane.showMessageDialog(null, "Llena la lista 2 ");
                    L2.Llenar();
                    L2.Mostrar();
                    L3.Intercalado(L1, L2);
                    L3.Mostrar();
                }
               
                case 11 ->
                {
                    JOptionPane.showMessageDialog(null, "Adiós :) ", "Salir :( ", 3);
                    return;

                }
                default ->
                {
                    JOptionPane.showMessageDialog(null, "Opción incorrecta ", "", 2);
                }
            }
        } while (opc != 11);
    }
}

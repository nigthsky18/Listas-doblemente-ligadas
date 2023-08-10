package listas.doblemente.ligadas3232;

import javax.swing.JOptionPane;

/**
 *
 * @author Mariana M
 */
public class Lista {
    //Atributo
    Nodo Punta;
    //Métodos 
    public Lista() 
    {
        Punta = null;
    }

    public void InsertarInicio(int d) 
    {
        Nodo x = new Nodo(d);
        if (Punta == null)
        {
            Punta = x;
        } else
        {
            x.setLigaD(Punta);
            Punta.setLigaI(x);
            Punta = x;
        }
    }

    public void InsertarFinal(int d) 
    {
        Nodo P, Q, x = new Nodo(d);

        if (Punta == null)
        {
            Punta = x;
        } else
        {
            P = Punta;
            Q = null;

            while (P.getLigaD() != null)
            {
                Q = P;
                P = P.getLigaD();
                P.setLigaI(Q);
            }
            P.setLigaD(x);
        }
    }

    public void InsertarOrdenado(int d) 
    {
        Nodo Q, P, x = new Nodo(d);
        if (Punta == null)
        {
            Punta = x;
        } else
        {
            P = Punta;
            Q = null;
            while (P != null && P.getDato() < x.getDato())
            {
                Q = P;
                P = P.getLigaD();
            }
            if (Q == null)
            {
                x.setLigaD(Punta);
                P.setLigaI(x);
                Punta = x;

            } else
            {
                if (P == null)
                {
                    Q.setLigaD(x);
                    x.setLigaI(Q);
                } else
                {
                    Q.setLigaD(x);
                    P.setLigaI(x);
                    x.setLigaI(Q);
                    x.setLigaD(P);
                }
            }
        }
    }

    public void OrdenarAsc() 
    {
        Nodo P, Q;
        int aux;

        if (Punta == null)
        {
            JOptionPane.showMessageDialog(null, "No hay lista para ordenar", "Lista vacía", 0);
        } else
        {
            P = Punta;
            Q = P.getLigaD();
            while (P.getLigaD() != null)
            {
                while (Q != null)
                {
                    if (P.getDato() > Q.getDato())
                    {
                        aux = Q.getDato();
                        Q.setDato(P.getDato());
                        P.setDato(aux);
                    }
                    Q = Q.getLigaD();
                }
                P = P.getLigaD();
                Q = P.getLigaD();
            }
            JOptionPane.showMessageDialog(null, "Lista ordenada");
        }
    }

    public void OrdenarDes() 
    {
        Nodo P, Q;
        int aux;

        if (Punta == null)
        {
            JOptionPane.showMessageDialog(null, "No hay lista para ordenar", "Lista vacía", 0);
        } else
        {
            P = Punta;
            Q = P.getLigaD();
            while (P.getLigaD() != null)
            {
                while (Q != null)
                {
                    if (P.getDato() < Q.getDato())
                    {
                        aux = Q.getDato();
                        Q.setDato(P.getDato());
                        P.setDato(aux);
                    }
                    Q = Q.getLigaD();
                }
                P = P.getLigaD();
                Q = P.getLigaD();
            }
            JOptionPane.showMessageDialog(null, "Lista ordenada");
        }
    }

    public void Buscar(int d) 
    {
        Nodo P = Punta;
        int i = 0;
        boolean ban = false;
        if (Punta == null)
        {
            JOptionPane.showMessageDialog(null, "No se han ingresado datos a la lista", "Lista vacía", 0);
        } else
        {
            while (P != null)
            {
                if (P.getDato() != d)

                {
                    P = P.getLigaD();

                } else
                {
                    JOptionPane.showMessageDialog(null, "Dato encontrado en la posición " + (i + 1));
                    P = P.getLigaD();
                    ban = true;
                }
                i++;
            }
            if (ban == false)
            {
                JOptionPane.showMessageDialog(null, "El dato no está en la lista");
            }
        }
    }

    public void Eliminar(int d) 
    {
        Nodo P, Q;
        boolean ban = false;
        if (Punta == null)
        {
            JOptionPane.showMessageDialog(null, "No se han ingresado datos a la lista", "Lista vacía", 0);
        } else
        {
            P = Punta;
            Q = null;
            while (P != null)
            {
                if (P.getDato() != d)
                {
                    P = P.getLigaD();

                } else
                {
                    if (P == Punta)
                    {
                        Punta = P.getLigaD();
                        P.setLigaD(null);
                        P = Punta;
                        ban = true;
                    } else
                    {
                        if (P.getLigaD() == null)
                        {
                            Q = P.getLigaI();
                            Q.setLigaD(null);
                            P.setLigaI(null);
                            P = null;
                            ban = true;
                        } else
                        {
                            Q = P.getLigaI();
                            Q.setLigaD(P.getLigaD());
                            Q = P;
                            P = P.getLigaD();
                            P.setLigaI(Q.getLigaI());
                            Q.setLigaI(null);
                            Q.setLigaD(null);
                            ban = true;
                        }
                    }

                }

            }
            if (ban == true)
            {
                JOptionPane.showMessageDialog(null, "Dato(s) eliminado (s)", "Eliminado", 1);
            } else
            {

                JOptionPane.showMessageDialog(null, "El dato que deseas eliminar no está en la lista ", "No encontrado", 0);

            }
        }
    }

    public void Reemplazar(int d) 
    {
        Nodo P, Q;
        boolean ban = false;
        int n;
        if (Punta == null)
        {
            JOptionPane.showMessageDialog(null, "No hay dato para reemplazar, lista vacía", "Lista vacía", 0);
        } else
        {
            P = Punta;
            Q = null;
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato por el que quiere remplazar este valor: "));
            while (P != null)
            {
                if (P.getDato() != d)
                {
                    P = P.getLigaD();
                } else
                {
                    P.setDato(n);
                    ban = true;
                }
            }
            if (ban == true)
            {
                JOptionPane.showMessageDialog(null, "Dato(s) reemplazado (s)", "Reemplazado", 1);
            } else
            {
                JOptionPane.showMessageDialog(null, "El dato que deseas reemplazar no está en la lista ", "No encontrado", 0);
            }
        }
    }

    public void MultiplicarListas(Lista L1, Lista L2) 
    {
        Nodo P = L1.Punta, Q = L2.Punta;
        int mult;
        while (P != null || Q != null)
        {
            if (P != null && Q != null)
            {
                mult = P.getDato() * Q.getDato();
                InsertarFinal(mult);
                P = P.getLigaD();
                Q = Q.getLigaD();
            } else
            {
                if (P != null && Q == null)
                {
                    InsertarFinal(P.getDato());
                    P = P.getLigaD();
                } else
                {
                    InsertarFinal(Q.getDato());
                    Q.getLigaD();
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Datos de las listas multiplicados", "Multiplicado", -1);
    }

    public void Intercalado(Lista L1, Lista L2)
    {
        Nodo P=L1.Punta,Q=L2.Punta;
         while (P != null || Q != null)
        {
            if (P != null && Q != null)
            {
                
                InsertarFinal(P.getDato());
                InsertarFinal(Q.getDato());
                P = P.getLigaD();
                Q = Q.getLigaD();
            } else
            {
                if (P != null && Q == null)
                {
                    InsertarFinal(P.getDato());
                    P = P.getLigaD();
                } else
                {
                    InsertarFinal(Q.getDato());
                    Q.getLigaD();
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Datos de las listas Intercalados", "Intercalado", -1);
    }
        
    
    
    public void Llenar() {
        int d, i = 0, n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de datos que tendrá la lista: "));

        while (i < n)
        {
            d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato a insertar : "));
            InsertarFinal(d);
            i++;
        }
    }

    public void Mostrar() {
        Nodo P = Punta;
        String s = " ";
        while (P != null)
        {
            // SOUT CTRL SPACE
            System.out.print("|" + P.getDato() + "|--->");
            s = s + "[" + P.getDato() + "]--->";
            P = P.getLigaD();
        }
        JOptionPane.showMessageDialog(null, s, "Impresión Listas", 3);
    }
}

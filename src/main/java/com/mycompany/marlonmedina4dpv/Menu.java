
package com.mycompany.marlonmedina4dpv;


import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        
        Afiliado arrayAfiliados[] = new Afiliado[3];
        String comparadorRut;
        int opcCambio;
        
        do {
            
            int op = Integer.parseInt(JOptionPane.showInputDialog("1.INGRESAR AFILIADOS\n2.BUSCAR AFILIADO POR RUT\n3.BUSCAR MAYOR MONTO\n4.MODIFICAR AFILIADOS\n5.CREAR CORREOS\n6.VER CORREOS\n7.SALIR"));
            
            switch(op){
                
                case 1:
                    
                    for (int i = 0; i < 3; i++) {
                        
                        JOptionPane.showMessageDialog(null, "Afiliado " + (i + 1) );
                        String n = JOptionPane.showInputDialog("INGRESE NOMBRE");
                        String a = JOptionPane.showInputDialog("INGRESE APELLIDO");
                        String r = JOptionPane.showInputDialog("INGRESE RUT");
                        double m = Double.parseDouble(JOptionPane.showInputDialog("INGRESE MONTO"));

                        arrayAfiliados[i] = new Afiliado(r,m,n,a);
                        
                    }
                    
                    break;
                    
                case 2:
                    
                    String buscar = JOptionPane.showInputDialog("INGRESE RUT A BUSCAR");
                    
                    for (int i = 0; i < 3; i++) {
                        
                        if (buscar.equals(arrayAfiliados[i].getRut())) {
                            arrayAfiliados[i].mostrar();
                            
                        } else {
                                                
                        }
                        
                    }
                    
                    
                    
                    break;
                    
                case 3: 
                    double may = 0;
                    int mayor = 0;

                    
                    for (int i = 0; i < 3; i++) {
                        
                        if (may < arrayAfiliados[i].getMonto() ) {
                            
                            may = arrayAfiliados[i].getMonto();
                            mayor = i;
                            
                        }
                        
                    }
                    
                arrayAfiliados[mayor].mostrar();


                break;
                
                case 4: 
                        
                
                    comparadorRut = JOptionPane.showInputDialog("Ingrese rut de Afiliado");
                    
                    for (int i = 0; i < 3; i++) {
                        
                        if (comparadorRut.equals(arrayAfiliados[i].getRut())) {
                            
                            
                            do {
                            
                            opcCambio = Integer.parseInt(JOptionPane.showInputDialog("1.Nombre\n2.Apellido\n3.Rut\n4.Monto\n5.Salir"));

                            switch (opcCambio) {
                                
                                case 1:
                                    arrayAfiliados[i].setNombre(JOptionPane.showInputDialog("Ingrese nuevo nombre de Afiliado"));

                                    break;
                                    
                                case 2:
                                    arrayAfiliados[i].setApellido(JOptionPane.showInputDialog("Ingrese nuevo apellido de Afiliado"));

                                    break;
                               
                                case 3:
                                    arrayAfiliados[i].setRut(JOptionPane.showInputDialog("Ingrese nuevo rut de Afiliado"));
                                    
                                    break;
                                
                                case 4:
                                    arrayAfiliados[i].setMonto(Double.parseDouble(JOptionPane.showInputDialog("Ingrese nuevo monto de Afiliado")));

                                    
                                    break;
                                    
                                    
                                case 5:
                                    
                                    break;
                                    
                                    
                                default:
                                   JOptionPane.showMessageDialog(null, "NO EXISTE ESA OPCION");
;
                            }
                            
                            arrayAfiliados[i].crearCorreo();
                            
                            } while (opcCambio != 5);
                           
                        }
                        
                    }
                
                    
                    
                    
                break;
                
                case 5:
                    
                    for (int i = 0; i < 3; i++) {
                        arrayAfiliados[i].crearCorreo();
                    }
                    
                    break;
                
                case 6:
                    
                    for (int i = 0; i < 3; i++) {
                        JOptionPane.showMessageDialog(null, arrayAfiliados[i].correo);
                    }
                    
                    break;
                    
                case 7:
                    
                    JOptionPane.showMessageDialog(null, "PROGRAMA FINALIZADO");
                    System.exit(0);
                    
                    break;
                    
                case 8:
                    
                    JOptionPane.showMessageDialog(null, arrayAfiliados[1].getApellido().length() + arrayAfiliados[1].getApellido());
                    
                    break;
                
                default:
                    
                    JOptionPane.showMessageDialog(null, "NO EXISTE ESA OPCION");
                        
            }
            
            
 
            
            
        } while (true);
        
    }
}

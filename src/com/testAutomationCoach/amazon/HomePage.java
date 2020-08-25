package com.testAutomationCoach.amazon;

public class HomePage<campoBusqueda> {
    Image logoAmazon;
    TextField  campoBusqueda = new TextField();
    Button busqueda = new Button();
    Link devoluciones;
    Image articuloSugerido = new Image();

    public  void buscarProducto(String producto)
    {
        System.out.println("Para buscar un producto : ");
        campoBusqueda.ingresarTexto(producto);
        busqueda.click();
      }

    public void clickDevoluciones() {
        System.out.println("\nPara hacer devoluciones : ");
        busqueda.click();
    }

    public  void elegirProducto()
    {
       //articuloSugerido.click();
    }

    public void seleccionarArticulo(String nombreArticulo) {
        buscarProducto(nombreArticulo);
        //articuloSugerido.buscarArticulo("nombreArticulo");
        //articuloSugerido.click();


    }

    public void buscarArticulo(String articulo)
    {
        //buscar en todas las imagenes, una que tenga tooltip igual al Articulo
        System.out.println("Hacer un recorrido en las imagenes desplegadas bucando: " + articulo);
    }
}

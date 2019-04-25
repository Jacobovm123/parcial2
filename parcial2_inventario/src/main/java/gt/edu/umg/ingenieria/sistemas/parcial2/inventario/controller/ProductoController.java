package gt.edu.umg.ingenieria.sistemas.parcial2.inventario.controller;

import gt.edu.umg.ingenieria.sistemas.core.parcial2.core.model.ProductoEntity;
import gt.edu.umg.ingenieria.sistemas.parcial2.inventario.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;
    
    @GetMapping("/buscarTodos")
    public List<ProductoEntity> buscarTodos() {
        return this.productoService.buscarTodos();
    }
    
  @PostMapping("/registrarProducto")
public ProductoEntity registrar(@RequestBody(required = true) ProductoEntity varprod)
{
return this.productoService.registrar(varprod)  ;  

}
    @PutMapping("/actualizarStock/{id}") 
public ProductoEntity  actualizar(@RequestBody(required=true)ProductoEntity  varprod,@PathVariable Long id)
{
return this.productoService.actualizar(varprod,id);

}

    
    
}

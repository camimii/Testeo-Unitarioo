/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class AuxCategorias {
    private ArrayList<Categoria> DatosCategorias; 
    
    /**
     * 
     * @param Nueva La nueva categoría a agregar si no existe
     * @return 1 si la agrega 0 si no
     */
    public int Agregar(Categoria Nueva)
        {
            int res = 0;

            DatosCategorias.add(Nueva);
            res = 1;

            return res;
        }

        /**
         * 
         * @param idcat id de la nueva categoría
         * @param nom nombre de la categoría
         * @param desc descripción de la categoría
         * @return 
         */
        public int Agregar(int idcat, String nom, String desc)
        {
            int res = 0;
            Categoria nueva = new Categoria(idcat, nom, desc);

            DatosCategorias.add(nueva);
            res = 1;
            
            return res;
        }

        /**
         * 
         * @param idCat de la categoría a eliminar
         * @return 1 si la elimina si no 0
         */
        public int Eliminar(int idCat)
        {
            int res = 0;
            Categoria b = null;
            b = Buscar(idCat);

            if(b!=null)
            {
                DatosCategorias.remove(b);
                res = 0;
            }
            return res;
        }

        public int Modificar(Categoria CatModificada)
        {
            int res = 0;

            if(Buscar(CatModificada.getIdcategoria())!=null)
            {
                int pos = Posicion(CatModificada.getIdcategoria());
                if(pos>=0)
                {
                    DatosCategorias.get(pos).setIdcategoria(CatModificada.getIdcategoria());
                    DatosCategorias.get(pos).setNombre(CatModificada.getNombre());
                    DatosCategorias.get(pos).setDescripcion(CatModificada.getDescripcion());
                    
                    res = 1;
                }
            }

            return res;
        }

        public int Modificar(int idCategoria, String nuevoNombre, String nuevaDescripcion)
        {
            int res = 0;

            int pos = Posicion(idCategoria);

            if(pos>=0)
            {
                DatosCategorias.get(pos).setNombre(nuevoNombre);
                DatosCategorias.get(pos).setDescripcion(nuevaDescripcion);
                res = 1;
            }
            
            return res;
        }

        private Categoria Buscar(int idcat)
        {
            Categoria cat = null;            
            
            for (Categoria c : DatosCategorias)
            {
                if (c.getIdcategoria() == idcat)
                {
                    cat = c;
                    break;
                }
            }

            return cat;
        }

        /**
         * 
         * @param idCat id de la categoría que está buscando
         * @return -1 si no la encuentra si la encuentra la posición en que se encuentra
         */
        private int Posicion(int idCat)
        {
            int res = -1;
            int p = -1;
            for(Categoria c : DatosCategorias)
            {
                p = p++;
                if(c.getIdcategoria()==idCat)
                {
                    res = p+1;
                    break;
                }
            }
            return res;
        }
}

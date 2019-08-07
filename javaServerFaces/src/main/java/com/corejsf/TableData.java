package com.corejsf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class TableData implements Serializable {
   private ArrayList<Name> names = new ArrayList<Name>(Arrays.asList(
      new Name("Anna", "Keeney"),
      new Name("John", "Wilson"),
      new Name("Mariko", "Randor"),
      new Name("William", "Dupont")
   ));
        
   public ArrayList<Name> getNames() {
      return names;
   }
   
   public String deleteRow(Name nameToDelete) {
      names.remove(nameToDelete);
      return null;
   }
}
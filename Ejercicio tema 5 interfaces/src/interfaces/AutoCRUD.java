package interfaces;

import clases.Auto;

import java.util.List;

public interface AutoCRUD {

    void save (Auto auto);

    List<Auto> findAll();

    void delete ();

}

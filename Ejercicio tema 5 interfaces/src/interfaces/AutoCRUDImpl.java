package interfaces;

import clases.Auto;

import java.util.List;

public class AutoCRUDImpl extends AutoReader implements AutoCRUD {
    @Override
    public void save(Auto auto) {
        System.out.println("save");
    }

    @Override
    public List<Auto> findAll() {
        System.out.println("findAll");
        return null;
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }
}
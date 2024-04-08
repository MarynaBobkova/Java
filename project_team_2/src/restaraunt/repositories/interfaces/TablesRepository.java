package restaraunt.repositories.interfaces;

import restaraunt.domain.interfaces.Table;

public interface TablesRepository {


        Table getTableById(int id);

        void addTable(int tableSeatingCapacity, String tablePosition);

        void removeTable(int id);

    }



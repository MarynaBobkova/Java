package restaraunt.repositories;


import restaraunt.domain.CommonTable;
import restaraunt.domain.interfaces.Table;
import restaraunt.repositories.interfaces.TablesRepository;

import java.util.HashMap;
import java.util.Map;


public class CommonTablesRepository implements TablesRepository {

    private Map<Integer, Table> tables = new HashMap<>();
    private int currentId;

    public CommonTablesRepository() {
        addTable(2, "window");
        addTable(1, "middle");
        addTable(4, "exit");
        addTable(4, "toilet");
    }

    @Override
    public Table getTableById(int id) {  // Реализация метода интерфейса TablesRepository для получения таблицы по её ID
        return tables.get(id);
    }

    @Override
    public void addTable(int tableSeatingCapacity, String tablePosition) {
        CommonTable commonTable = new CommonTable(tableSeatingCapacity, tablePosition);
        commonTable.setId(++currentId);
        tables.put(currentId, commonTable);
    }

    @Override
    public void removeTable(int id) {
        tables.remove(id);
    }
}

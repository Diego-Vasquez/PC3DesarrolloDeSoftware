package Solid.DIP;

class InterfazUsuario {
    public BaseDatos database;

    public BaseDatos getDatabase() {
        return database;
    }

    public void setDatabase(BaseDatos database) {
        this.database = database;
    }

    public InterfazUsuario(BaseDatos database) {
        this.database = database;
    }

    public void saveEmployeeId(String empId) {
        database.saveEmpIdInDatabase(empId);
    }
}

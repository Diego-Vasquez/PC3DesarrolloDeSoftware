package Solid.DIP;

class InterfazUsuario {
    private BaseDatos database;

    public InterfazUsuario(BaseDatos database) {
        this.database = database;
    }

    public void saveEmployeeId(String empId) {
        database.saveEmpIdInDatabase(empId);
    }
}
